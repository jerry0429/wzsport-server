package com.wzsport.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.wzsport.model.RunningProject;
import com.wzsport.model.RunningProjectExample;

public interface RunningProjectMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_project
	 * @mbg.generated  Tue Jun 06 22:11:58 CST 2017
	 */
	long countByExample(RunningProjectExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_project
	 * @mbg.generated  Tue Jun 06 22:11:58 CST 2017
	 */
	int deleteByExample(RunningProjectExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_project
	 * @mbg.generated  Tue Jun 06 22:11:58 CST 2017
	 */
	@Delete({ "delete from wzsport_running_project", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_project
	 * @mbg.generated  Tue Jun 06 22:11:58 CST 2017
	 */
	@Insert({ "insert into wzsport_running_project (university_id, name, ", "type, enabled, qualified_distance, ",
			"qualified_cost_time, min_cost_time, ", "hourly_calorie_consumption, created_at, ", "updated_at)",
			"values (#{universityId,jdbcType=BIGINT}, #{name,jdbcType=VARCHAR}, ",
			"#{type,jdbcType=VARCHAR}, #{enabled,jdbcType=BIT}, #{qualifiedDistance,jdbcType=INTEGER}, ",
			"#{qualifiedCostTime,jdbcType=INTEGER}, #{minCostTime,jdbcType=INTEGER}, ",
			"#{hourlyCalorieConsumption,jdbcType=INTEGER}, #{createdAt,jdbcType=TIMESTAMP}, ",
			"#{updatedAt,jdbcType=TIMESTAMP})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(RunningProject record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_project
	 * @mbg.generated  Tue Jun 06 22:11:58 CST 2017
	 */
	int insertSelective(RunningProject record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_project
	 * @mbg.generated  Tue Jun 06 22:11:58 CST 2017
	 */
	List<RunningProject> selectByExample(RunningProjectExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_project
	 * @mbg.generated  Tue Jun 06 22:11:58 CST 2017
	 */
	@Select({ "select", "id, university_id, name, type, enabled, qualified_distance, qualified_cost_time, ",
			"min_cost_time, hourly_calorie_consumption, created_at, updated_at", "from wzsport_running_project",
			"where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.wzsport.generator.mapper.RunningProjectMapper.BaseResultMap")
	RunningProject selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_project
	 * @mbg.generated  Tue Jun 06 22:11:58 CST 2017
	 */
	int updateByExampleSelective(@Param("record") RunningProject record,
			@Param("example") RunningProjectExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_project
	 * @mbg.generated  Tue Jun 06 22:11:58 CST 2017
	 */
	int updateByExample(@Param("record") RunningProject record, @Param("example") RunningProjectExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_project
	 * @mbg.generated  Tue Jun 06 22:11:58 CST 2017
	 */
	int updateByPrimaryKeySelective(RunningProject record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_running_project
	 * @mbg.generated  Tue Jun 06 22:11:58 CST 2017
	 */
	@Update({ "update wzsport_running_project", "set university_id = #{universityId,jdbcType=BIGINT},",
			"name = #{name,jdbcType=VARCHAR},", "type = #{type,jdbcType=VARCHAR},",
			"enabled = #{enabled,jdbcType=BIT},", "qualified_distance = #{qualifiedDistance,jdbcType=INTEGER},",
			"qualified_cost_time = #{qualifiedCostTime,jdbcType=INTEGER},",
			"min_cost_time = #{minCostTime,jdbcType=INTEGER},",
			"hourly_calorie_consumption = #{hourlyCalorieConsumption,jdbcType=INTEGER},",
			"created_at = #{createdAt,jdbcType=TIMESTAMP},", "updated_at = #{updatedAt,jdbcType=TIMESTAMP}",
			"where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(RunningProject record);
}