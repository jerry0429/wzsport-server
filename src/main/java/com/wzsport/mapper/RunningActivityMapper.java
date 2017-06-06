package com.wzsport.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.wzsport.model.RunningActivity;
import com.wzsport.model.RunningActivityExample;

public interface RunningActivityMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Tue Jun 06 22:11:58 CST 2017
	 */
	long countByExample(RunningActivityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Tue Jun 06 22:11:58 CST 2017
	 */
	int deleteByExample(RunningActivityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Tue Jun 06 22:11:58 CST 2017
	 */
	@Delete({ "delete from wzsport_running_activity", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Tue Jun 06 22:11:58 CST 2017
	 */
	@Insert({ "insert into wzsport_running_activity (project_id, student_id, ", "distance, cost_time, ",
			"target_time, start_time, ", "cost_calorie, qualified, ", "created_at, updated_at)",
			"values (#{projectId,jdbcType=BIGINT}, #{studentId,jdbcType=BIGINT}, ",
			"#{distance,jdbcType=INTEGER}, #{costTime,jdbcType=INTEGER}, ",
			"#{targetTime,jdbcType=INTEGER}, #{startTime,jdbcType=TIMESTAMP}, ",
			"#{costCalorie,jdbcType=INTEGER}, #{qualified,jdbcType=BIT}, ",
			"#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(RunningActivity record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Tue Jun 06 22:11:58 CST 2017
	 */
	int insertSelective(RunningActivity record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Tue Jun 06 22:11:58 CST 2017
	 */
	List<RunningActivity> selectByExample(RunningActivityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Tue Jun 06 22:11:58 CST 2017
	 */
	@Select({ "select", "id, project_id, student_id, distance, cost_time, target_time, start_time, cost_calorie, ",
			"qualified, created_at, updated_at", "from wzsport_running_activity", "where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.wzsport.generator.mapper.RunningActivityMapper.BaseResultMap")
	RunningActivity selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Tue Jun 06 22:11:58 CST 2017
	 */
	int updateByExampleSelective(@Param("record") RunningActivity record,
			@Param("example") RunningActivityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Tue Jun 06 22:11:58 CST 2017
	 */
	int updateByExample(@Param("record") RunningActivity record, @Param("example") RunningActivityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Tue Jun 06 22:11:58 CST 2017
	 */
	int updateByPrimaryKeySelective(RunningActivity record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_activity
	 * @mbg.generated  Tue Jun 06 22:11:58 CST 2017
	 */
	@Update({ "update wzsport_running_activity", "set project_id = #{projectId,jdbcType=BIGINT},",
			"student_id = #{studentId,jdbcType=BIGINT},", "distance = #{distance,jdbcType=INTEGER},",
			"cost_time = #{costTime,jdbcType=INTEGER},", "target_time = #{targetTime,jdbcType=INTEGER},",
			"start_time = #{startTime,jdbcType=TIMESTAMP},", "cost_calorie = #{costCalorie,jdbcType=INTEGER},",
			"qualified = #{qualified,jdbcType=BIT},", "created_at = #{createdAt,jdbcType=TIMESTAMP},",
			"updated_at = #{updatedAt,jdbcType=TIMESTAMP}", "where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(RunningActivity record);
}