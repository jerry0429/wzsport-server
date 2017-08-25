package com.wzsport.mapper;

import com.wzsport.model.AreaActivity;
import com.wzsport.model.AreaActivityExample;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface AreaActivityMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity
	 * @mbg.generated  Fri Aug 25 16:54:31 CST 2017
	 */
	long countByExample(AreaActivityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity
	 * @mbg.generated  Fri Aug 25 16:54:31 CST 2017
	 */
	int deleteByExample(AreaActivityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity
	 * @mbg.generated  Fri Aug 25 16:54:31 CST 2017
	 */
	@Delete({ "delete from wzsport_area_activity", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity
	 * @mbg.generated  Fri Aug 25 16:54:31 CST 2017
	 */
	@Insert({ "insert into wzsport_area_activity (area_sport_id, student_id, ", "cost_time, start_time, ",
			"kcal_consumed, qualified, ", "qualified_cost_time, created_at, ", "updated_at, ended_at, ", "ended_by)",
			"values (#{areaSportId,jdbcType=BIGINT}, #{studentId,jdbcType=BIGINT}, ",
			"#{costTime,jdbcType=INTEGER}, #{startTime,jdbcType=TIMESTAMP}, ",
			"#{kcalConsumed,jdbcType=INTEGER}, #{qualified,jdbcType=BIT}, ",
			"#{qualifiedCostTime,jdbcType=INTEGER}, #{createdAt,jdbcType=TIMESTAMP}, ",
			"#{updatedAt,jdbcType=TIMESTAMP}, #{endedAt,jdbcType=TIMESTAMP}, ", "#{endedBy,jdbcType=TINYINT})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(AreaActivity record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity
	 * @mbg.generated  Fri Aug 25 16:54:31 CST 2017
	 */
	int insertSelective(AreaActivity record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity
	 * @mbg.generated  Fri Aug 25 16:54:31 CST 2017
	 */
	List<AreaActivity> selectByExample(AreaActivityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity
	 * @mbg.generated  Fri Aug 25 16:54:31 CST 2017
	 */
	@Select({ "select", "id, area_sport_id, student_id, cost_time, start_time, kcal_consumed, qualified, ",
			"qualified_cost_time, created_at, updated_at, ended_at, ended_by", "from wzsport_area_activity",
			"where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.wzsport.mapper.AreaActivityMapper.BaseResultMap")
	AreaActivity selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity
	 * @mbg.generated  Fri Aug 25 16:54:31 CST 2017
	 */
	int updateByExampleSelective(@Param("record") AreaActivity record, @Param("example") AreaActivityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity
	 * @mbg.generated  Fri Aug 25 16:54:31 CST 2017
	 */
	int updateByExample(@Param("record") AreaActivity record, @Param("example") AreaActivityExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity
	 * @mbg.generated  Fri Aug 25 16:54:31 CST 2017
	 */
	int updateByPrimaryKeySelective(AreaActivity record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_area_activity
	 * @mbg.generated  Fri Aug 25 16:54:31 CST 2017
	 */
	@Update({ "update wzsport_area_activity", "set area_sport_id = #{areaSportId,jdbcType=BIGINT},",
			"student_id = #{studentId,jdbcType=BIGINT},", "cost_time = #{costTime,jdbcType=INTEGER},",
			"start_time = #{startTime,jdbcType=TIMESTAMP},", "kcal_consumed = #{kcalConsumed,jdbcType=INTEGER},",
			"qualified = #{qualified,jdbcType=BIT},", "qualified_cost_time = #{qualifiedCostTime,jdbcType=INTEGER},",
			"created_at = #{createdAt,jdbcType=TIMESTAMP},", "updated_at = #{updatedAt,jdbcType=TIMESTAMP},",
			"ended_at = #{endedAt,jdbcType=TIMESTAMP},", "ended_by = #{endedBy,jdbcType=TINYINT}",
			"where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(AreaActivity record);

	@Select("SELECT SUM(kcal_consumed) FROM wzsport_area_activity WHERE student_id = #{studentId}")
	Integer sumKcalConsumedByStudentId(long studentId);
	
	@Select("SELECT SUM(cost_time) FROM wzsport_area_activity WHERE student_id = #{studentId}")
	Integer sumCostTimeByStudentId(long studentId);
	
	@Select("SELECT SUM(kcal_consumed) "
			+ "FROM wzsport_area_activity "
			+ "WHERE student_id = #{studentId} AND start_time > #{start} AND start_time < #{end}")
	Integer sumKCalConsumedByStudentIdAndDuration(@Param("studentId") long studentId,@Param("start") Date start,@Param("end")  Date end);
	
	@Select("SELECT SUM(cost_time) "
			+ "FROM wzsport_area_activity "
			+ "WHERE student_id = #{studentId} AND start_time > #{start} AND start_time < #{end}")
	Integer sumCostTimeByStudentIdAndDuration(@Param("studentId") long studentId,@Param("start")  Date start,@Param("end")  Date end);
}