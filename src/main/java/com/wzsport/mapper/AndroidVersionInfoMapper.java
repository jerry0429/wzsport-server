package com.wzsport.mapper;

import com.wzsport.model.AndroidVersionInfo;
import com.wzsport.model.AndroidVersionInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface AndroidVersionInfoMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_android_version_info
	 * @mbg.generated  Mon Aug 07 15:48:13 CST 2017
	 */
	long countByExample(AndroidVersionInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_android_version_info
	 * @mbg.generated  Mon Aug 07 15:48:13 CST 2017
	 */
	int deleteByExample(AndroidVersionInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_android_version_info
	 * @mbg.generated  Mon Aug 07 15:48:13 CST 2017
	 */
	@Delete({ "delete from wzsport_android_version_info", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_android_version_info
	 * @mbg.generated  Mon Aug 07 15:48:13 CST 2017
	 */
	@Insert({ "insert into wzsport_android_version_info (version_name, version_code, ", "change_log, is_forced, ",
			"apk_url, created_at, ", "updated_at)",
			"values (#{versionName,jdbcType=VARCHAR}, #{versionCode,jdbcType=INTEGER}, ",
			"#{changeLog,jdbcType=VARCHAR}, #{isForced,jdbcType=BIT}, ",
			"#{apkUrl,jdbcType=VARCHAR}, #{createdAt,jdbcType=TIMESTAMP}, ", "#{updatedAt,jdbcType=TIMESTAMP})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(AndroidVersionInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_android_version_info
	 * @mbg.generated  Mon Aug 07 15:48:13 CST 2017
	 */
	int insertSelective(AndroidVersionInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_android_version_info
	 * @mbg.generated  Mon Aug 07 15:48:13 CST 2017
	 */
	List<AndroidVersionInfo> selectByExample(AndroidVersionInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_android_version_info
	 * @mbg.generated  Mon Aug 07 15:48:13 CST 2017
	 */
	@Select({ "select", "id, version_name, version_code, change_log, is_forced, apk_url, created_at, ", "updated_at",
			"from wzsport_android_version_info", "where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.wzsport.mapper.AndroidVersionInfoMapper.BaseResultMap")
	AndroidVersionInfo selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_android_version_info
	 * @mbg.generated  Mon Aug 07 15:48:13 CST 2017
	 */
	int updateByExampleSelective(@Param("record") AndroidVersionInfo record,
			@Param("example") AndroidVersionInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_android_version_info
	 * @mbg.generated  Mon Aug 07 15:48:13 CST 2017
	 */
	int updateByExample(@Param("record") AndroidVersionInfo record,
			@Param("example") AndroidVersionInfoExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_android_version_info
	 * @mbg.generated  Mon Aug 07 15:48:13 CST 2017
	 */
	int updateByPrimaryKeySelective(AndroidVersionInfo record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_android_version_info
	 * @mbg.generated  Mon Aug 07 15:48:13 CST 2017
	 */
	@Update({ "update wzsport_android_version_info", "set version_name = #{versionName,jdbcType=VARCHAR},",
			"version_code = #{versionCode,jdbcType=INTEGER},", "change_log = #{changeLog,jdbcType=VARCHAR},",
			"is_forced = #{isForced,jdbcType=BIT},", "apk_url = #{apkUrl,jdbcType=VARCHAR},",
			"created_at = #{createdAt,jdbcType=TIMESTAMP},", "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
			"where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(AndroidVersionInfo record);

	@Select("SELECT * FROM wzsport_android_version_info ORDER BY version_code DESC limit 1")
    AndroidVersionInfo getLasetVersionInfo();
}