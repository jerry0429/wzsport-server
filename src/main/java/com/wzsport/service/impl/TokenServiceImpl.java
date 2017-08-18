package com.wzsport.service.impl;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.time.DateUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.wzsport.dto.TokenDTO;
import com.wzsport.mapper.DeviceLoginLogMapper;
import com.wzsport.mapper.DeviceMapper;
import com.wzsport.mapper.UserMapper;
import com.wzsport.model.Device;
import com.wzsport.model.DeviceExample;
import com.wzsport.model.DeviceLoginLog;
import com.wzsport.model.User;
import com.wzsport.service.TokenService;
import com.wzsport.util.ResponseBody;

import io.jsonwebtoken.CompressionCodecs;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

/**
* TokenService 实现类.
* 
* @author x1ny
* @date 2017年5月22日
*/
@Service
public class TokenServiceImpl implements TokenService {
	
	private static final Logger logger = LoggerFactory.getLogger(TokenServiceImpl.class);
	
	String logMsg = "";
	
	/**
	 * jwt加密、解密的密匙
	 */
	private final String KEY;
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private DeviceMapper deviceMapper;
	
	@Autowired
	private DeviceLoginLogMapper deviceLoginLogMapper;
	
	public TokenServiceImpl(@Value("${jwt.key}") String key) {		
		KEY = key;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public int create(long universityId, String username, String password, int expiredHour, String deviceId, String userAgent, ResponseBody resBody) {
		
		User user = userMapper.selectWithRolesByUsername(username);
		
		if (user == null || !(user.getUniversityId().equals(universityId)) || !user.getPassword().equals(password)) {
			logMsg = "登录失败";
			logger.error(logMsg);
			
			resBody.statusMsg = logMsg;
			resBody.obj = null;
			
			return HttpServletResponse.SC_UNAUTHORIZED;
		}
		
//		if (!user.getPassword().equals(password)) {
//			throw new IncorrectCredentialsException();
//		}
		
		Device device;
		DeviceExample example = new DeviceExample();
		example.createCriteria().andUserIdEqualTo(user.getId());
		List<Device> list = deviceMapper.selectByExample(example);
		if (list.size() == 0) {//第一次登录，还没有保存设备信息
			device = new Device();
			device.setUserId(user.getId());
			device.setDeviceId(deviceId);
			deviceMapper.insert(device);
			
			DeviceLoginLog log = new DeviceLoginLog();
			log.setDeviceId(deviceId);
			log.setUserAgent(userAgent);
			deviceLoginLogMapper.insert(log);
		} else {//第二次登录，验证设备信息
			device = list.get(0);
			if (!device.getDeviceId().equals(deviceId)) {
				logMsg = "设备Id不匹配";
				logger.error(logMsg);
				
				resBody.statusMsg = logMsg;
				resBody.obj = null;
				
				return HttpServletResponse.SC_BAD_REQUEST;
			}
		}
		
		//创建token
		long userId = user.getId();
		Date expiredDate = DateUtils.addHours(new Date(), expiredHour);
		String[] roles = new String[user.getRoles().size()];
		for(int i = 0; i < roles.length; i++) {
			roles[i] = user.getRoles().get(i).getName();
		}
		String token = Jwts.builder()
				.setSubject(String.valueOf(userId))
				.setExpiration(expiredDate)
				.claim("roles", roles)
				.compressWith(CompressionCodecs.DEFLATE)
				.signWith(SignatureAlgorithm.HS512, KEY)
				.compact();
		
		logMsg = "登录成功";
		logger.info(logMsg);
		
		resBody.statusMsg = logMsg;
		resBody.obj = new TokenDTO(userId, roles, token, expiredDate);
		
		return HttpServletResponse.SC_CREATED;
	}
}
