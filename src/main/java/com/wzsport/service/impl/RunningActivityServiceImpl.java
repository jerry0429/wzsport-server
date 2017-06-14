package com.wzsport.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wzsport.mapper.RunningActivityMapper;
import com.wzsport.mapper.RunningProjectMapper;
import com.wzsport.model.RunningActivity;
import com.wzsport.model.RunningActivityExample;
import com.wzsport.model.RunningProject;
import com.wzsport.model.Term;
import com.wzsport.service.RunningActivityService;
import com.wzsport.service.TermService;
import com.wzsport.util.CalorieUtil;

/**
* RunningActivity Service 实现类.
*
* @author x1ny
* @date 2017年5月26日
*/
@Service
public class RunningActivityServiceImpl implements RunningActivityService {

	@Autowired
	private RunningProjectMapper runningProjectMapper;
	@Autowired
	private RunningActivityMapper runningActivityMapper;
	@Autowired
	private TermService termService;
	
	/* (non-Javadoc)
	 * @see com.wzsport.service.RunningActivityService#create(com.wzsport.model.RunningActivity)
	 */
	@Override
	public RunningActivity create(RunningActivity runningActivity) {
		
		RunningProject runningProject = runningProjectMapper.selectByPrimaryKey(runningActivity.getProjectId());
		//判断是否合格
		if(runningActivity.getDistance() >= runningProject.getQualifiedDistance()
				&& runningActivity.getTargetTime() != null
				&& runningActivity.getTargetTime() <= runningProject.getQualifiedCostTime()){
			runningActivity.setQualified(true);
		} else {
			runningActivity.setQualified(false);
		}
		
		//计算卡路里消耗
		int caloriesConsumed = CalorieUtil.calculateCalorieConsumption(80, runningActivity.getCostTime(),
				runningProject.getHourlyCalorieConsumption());
		runningActivity.setCaloriesConsumed(caloriesConsumed);
		
		runningActivityMapper.insertSelective(runningActivity);
		
		return runningActivity;
	}

	/* (non-Javadoc)
	 * @see com.wzsport.service.RunningActivityService#getCurrentTermQualifiedActivityCount(long)
	 */
	@Override
	public int getCurrentTermQualifiedActivityCount(long studentId, long universityId) {
		Term term = termService.getCurrentTerm(universityId);
		if(term != null) {
			RunningActivityExample runningActivityExample = new RunningActivityExample();
			runningActivityExample.createCriteria().andStartTimeBetween(term.getStartDate(), term.getEndDate())
												.andStudentIdEqualTo(studentId)
												.andQualifiedEqualTo(true);
			
			return (int) runningActivityMapper.countByExample(runningActivityExample);
		}
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.wzsport.service.RunningActivityService#getStudentCaloriesConsumption(long)
	 */
	@Override
	public int getStudentCaloriesConsumption(long studentId) {
		
		return runningActivityMapper.sumCaloriesConsumedByStudentId(studentId);
	}
	
	
}
