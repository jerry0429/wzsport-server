package com.wzsport.mapper;

import com.wzsport.model.SignInAnother;
import com.wzsport.model.SignInAnotherExample;
import com.wzsport.model.SignInCopy;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface SignInAnotherMapper {
    /**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sign_in_c
	 * @mbg.generated  Mon Apr 16 11:29:36 CST 2018
	 */
	long countByExample(SignInAnotherExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sign_in_c
	 * @mbg.generated  Mon Apr 16 11:29:36 CST 2018
	 */
	int deleteByExample(SignInAnotherExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sign_in_c
	 * @mbg.generated  Mon Apr 16 11:29:36 CST 2018
	 */
	@Delete({ "delete from wzsport_sign_in_c", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sign_in_c
	 * @mbg.generated  Mon Apr 16 11:29:36 CST 2018
	 */
	@Insert({ "insert into wzsport_sign_in_c (activity_id, student_id, ", "name, class_id, university_id, ",
			"student_no, is_man, sport_type, ", "sign_in_time)",
			"values (#{activityId,jdbcType=BIGINT}, #{studentId,jdbcType=BIGINT}, ",
			"#{name,jdbcType=VARCHAR}, #{classId,jdbcType=BIGINT}, #{universityId,jdbcType=BIGINT}, ",
			"#{studentNo,jdbcType=VARCHAR}, #{isMan,jdbcType=BIT}, #{sportType,jdbcType=TINYINT}, ",
			"#{signInTime,jdbcType=TIMESTAMP})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(SignInAnother record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sign_in_c
	 * @mbg.generated  Mon Apr 16 11:29:36 CST 2018
	 */
	int insertSelective(SignInAnother record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sign_in_c
	 * @mbg.generated  Mon Apr 16 11:29:36 CST 2018
	 */
	List<SignInAnother> selectByExample(SignInAnotherExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sign_in_c
	 * @mbg.generated  Mon Apr 16 11:29:36 CST 2018
	 */
	@Select({ "select", "id, activity_id, student_id, name, class_id, university_id, student_no, is_man, ",
			"sport_type, sign_in_time", "from wzsport_sign_in_c", "where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.wzsport.mapper.SignInAnotherMapper.BaseResultMap")
	SignInAnother selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sign_in_c
	 * @mbg.generated  Mon Apr 16 11:29:36 CST 2018
	 */
	int updateByExampleSelective(@Param("record") SignInAnother record, @Param("example") SignInAnotherExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sign_in_c
	 * @mbg.generated  Mon Apr 16 11:29:36 CST 2018
	 */
	int updateByExample(@Param("record") SignInAnother record, @Param("example") SignInAnotherExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sign_in_c
	 * @mbg.generated  Mon Apr 16 11:29:36 CST 2018
	 */
	int updateByPrimaryKeySelective(SignInAnother record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_sign_in_c
	 * @mbg.generated  Mon Apr 16 11:29:36 CST 2018
	 */
	@Update({ "update wzsport_sign_in_c", "set activity_id = #{activityId,jdbcType=BIGINT},",
			"student_id = #{studentId,jdbcType=BIGINT},", "name = #{name,jdbcType=VARCHAR},",
			"class_id = #{classId,jdbcType=BIGINT},", "university_id = #{universityId,jdbcType=BIGINT},",
			"student_no = #{studentNo,jdbcType=VARCHAR},", "is_man = #{isMan,jdbcType=BIT},",
			"sport_type = #{sportType,jdbcType=TINYINT},", "sign_in_time = #{signInTime,jdbcType=TIMESTAMP}",
			"where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(SignInAnother record);

	@Select("SELECT t1.* FROM\n" +
            "(\n" +
            "   SELECT * FROM\n" +
            "   (\n" +
            "       SELECT \n" +
            "       student.id AS student_id, \n" +
            "       student.name AS name,\n" +
            "       student.class_id AS class_id,\n" +
            "       student.university_id AS university_id,\n" +
            "       student.student_no AS student_no,\n" +
            "       student.is_man AS is_man,\n" +
            "       act.sport_type,\n" +
            "       act.sport_id,\n" +
            "       act.activity_id,\n" +
            "       act.start_time AS sign_in_time\n" +
            "       FROM\n" +
            "       (\n" +
            "           SELECT id AS activity_id, running_sport_id AS sport_id,start_time,student_id,0 AS sport_type\n" +
            "               FROM wzsport_running_activity \n" +
            "            WHERE qualified = 1 AND is_valid = 1\n" +
            "                AND date(start_time) <= date(#{end}) AND date(start_time) >= date(#{start})\n" +
            "       ) AS act \n" +
            "       LEFT JOIN wzsport_student AS student\n" +
            "       ON act.student_id = student.id\n" +
            "       UNION \n" +
            "       SELECT \n" +
            "       student.id AS student_id, \n" +
            "       student.name AS name,\n" +
            "       student.class_id AS class_id,\n" +
            "       student.university_id AS university_id,\n" +
            "       student.student_no AS student_no,\n" +
            "       student.is_man AS is_man,\n" +
            "       act.sport_type,\n" +
            "       act.sport_id,\n" +
            "       act.activity_id,\n" +
            "       act.start_time AS sign_in_time\n" +
            "       FROM\n" +
            "       (\n" +
            "           SELECT id AS activity_id, area_sport_id AS sport_id,start_time,student_id,1 AS sport_type\n" +
            "               FROM wzsport_area_activity \n" +
            "            WHERE qualified = 1\n" +
            "                AND date(start_time) <= date(#{end}) AND date(start_time) >= date(#{start})\n" +
            "       ) AS act \n" +
            "       LEFT JOIN wzsport_student AS student\n" +
            "       ON act.student_id = student.id\n" +
            "       ) AS resultAct\n" +
            "   GROUP BY student_id,date(sign_in_time)\n" +
            ") t1 \n" +
            "LEFT JOIN wzsport_sign_in_c t2 \n" +
            "ON t1.student_id = t2.student_id AND date(t1.sign_in_time) = date(t2.sign_in_time)\n" +
            "WHERE t2.student_id IS NULL")
    List<SignInAnother> getSignInDataList(@Param("start") Date start, @Param("end") Date end);
    
    @Select("SELECT t1.* FROM\n" + 
            "(\n" + 
            "    SELECT * FROM\n" + 
            "    (\n" + 
            "        SELECT \n" + 
            "        student.id AS student_id,\n" + 
            "        student.`name` AS `name`,\n" + 
            "        student.class_id AS class_id,\n" + 
            "        student.university_id AS university_id,\n" + 
            "        student.student_no AS student_no,\n" + 
            "        student.is_man AS is_man,\n" + 
            "        act.sport_type,\n" + 
            "        act.sport_id,\n" + 
            "        act.activity_id,\n" + 
            "        act.start_time AS sign_in_time\n" + 
            "        FROM \n" + 
            "        (\n" + 
            "            SELECT id AS activity_id, running_sport_id AS sport_id, start_time, student_id, qualified, is_valid, 0  AS sport_type\n" + 
            "            FROM wzsport_running_activity\n" + 
            "            WHERE qualified = 1 AND is_valid = 1\n" + 
            "            AND date(start_time) <= date(#{end}) AND date(start_time) >= date(#{start})\n" + 
            "        ) AS act\n" + 
            "        LEFT JOIN wzsport_student AS student\n" + 
            "        ON act.student_id = student.id\n" + 
            "        UNION\n" + 
            "        SELECT\n" + 
            "        student.id AS student_id,\n" + 
            "        student.`name` AS `name`,\n" + 
            "        student.class_id AS class_id,\n" + 
            "        student.university_id AS university_id,\n" + 
            "        student.student_no AS student_no,\n" + 
            "        student.is_man AS is_man,\n" + 
            "        act.sport_type,\n" + 
            "        act.sport_id,\n" + 
            "        act.activity_id,\n" + 
            "        act.start_time AS sign_in_time\n" + 
            "        FROM \n" + 
            "        (\n" + 
            "            SELECT id AS activity_id, area_sport_id AS sport_id, start_time, student_id, 1 AS sport_type\n" + 
            "            FROM wzsport_area_activity\n" + 
            "            WHERE qualified = 1\n" + 
            "            AND date(start_time) <= date(#{end}) AND date(start_time) >= date(#{start})\n" + 
            "        ) AS act\n" + 
            "        LEFT JOIN wzsport_student AS student\n" + 
            "        ON act.student_id = student.id\n" + 
            "    ) AS resultAct\n" + 
            "    GROUP BY student_id, date(sign_in_time)\n" + 
            ") AS t1 order by sign_in_time")
    HashSet<SignInAnother> getAllSignInDataList(@Param("start") Date start, @Param("end") Date end);
    
    
    @Select("select * from wzsport_sign_in_c order by sign_in_time")
    HashSet<SignInAnother> getAllDataList();
}