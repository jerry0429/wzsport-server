package com.wzsport.mapper;

import com.wzsport.model.RunningActivityData;
import com.wzsport.model.RunningActivityDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface RunningActivityDataMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data
	 * @mbg.generated  Mon Aug 14 10:23:48 CST 2017
	 */
	long countByExample(RunningActivityDataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data
	 * @mbg.generated  Mon Aug 14 10:23:48 CST 2017
	 */
	int deleteByExample(RunningActivityDataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data
	 * @mbg.generated  Mon Aug 14 10:23:48 CST 2017
	 */
	@Delete({ "delete from wzsport_running_activity_data", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data
	 * @mbg.generated  Mon Aug 14 10:23:48 CST 2017
	 */
	@Insert({ "insert into wzsport_running_activity_data (activity_id, acquisition_time, ", "step_count, distance, ",
			"longitude, latitude, ", "location_type, is_normal, ", "created_at, updated_at)",
			"values (#{activityId,jdbcType=BIGINT}, #{acquisitionTime,jdbcType=TIMESTAMP}, ",
			"#{stepCount,jdbcType=SMALLINT}, #{distance,jdbcType=SMALLINT}, ",
			"#{longitude,jdbcType=DECIMAL}, #{latitude,jdbcType=DECIMAL}, ",
			"#{locationType,jdbcType=TINYINT}, #{isNormal,jdbcType=BIT}, ",
			"#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(RunningActivityData record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data
	 * @mbg.generated  Mon Aug 14 10:23:48 CST 2017
	 */
	int insertSelective(RunningActivityData record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data
	 * @mbg.generated  Mon Aug 14 10:23:48 CST 2017
	 */
	List<RunningActivityData> selectByExample(RunningActivityDataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data
	 * @mbg.generated  Mon Aug 14 10:23:48 CST 2017
	 */
	@Select({ "select", "id, activity_id, acquisition_time, step_count, distance, longitude, latitude, ",
			"location_type, is_normal, created_at, updated_at", "from wzsport_running_activity_data",
			"where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.wzsport.mapper.RunningActivityDataMapper.BaseResultMap")
	RunningActivityData selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data
	 * @mbg.generated  Mon Aug 14 10:23:48 CST 2017
	 */
	int updateByExampleSelective(@Param("record") RunningActivityData record,
			@Param("example") RunningActivityDataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data
	 * @mbg.generated  Mon Aug 14 10:23:48 CST 2017
	 */
	int updateByExample(@Param("record") RunningActivityData record,
			@Param("example") RunningActivityDataExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data
	 * @mbg.generated  Mon Aug 14 10:23:48 CST 2017
	 */
	int updateByPrimaryKeySelective(RunningActivityData record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity_data
	 * @mbg.generated  Mon Aug 14 10:23:48 CST 2017
	 */
	@Update({ "update wzsport_running_activity_data", "set activity_id = #{activityId,jdbcType=BIGINT},",
			"acquisition_time = #{acquisitionTime,jdbcType=TIMESTAMP},", "step_count = #{stepCount,jdbcType=SMALLINT},",
			"distance = #{distance,jdbcType=SMALLINT},", "longitude = #{longitude,jdbcType=DECIMAL},",
			"latitude = #{latitude,jdbcType=DECIMAL},", "location_type = #{locationType,jdbcType=TINYINT},",
			"is_normal = #{isNormal,jdbcType=BIT},", "created_at = #{createdAt,jdbcType=TIMESTAMP},",
			"updated_at = #{updatedAt,jdbcType=TIMESTAMP}", "where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(RunningActivityData record);
}