package com.wzsport.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.wzsport.model.Class;
import com.wzsport.model.ClassExample;

public interface ClassMapper {

	/**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_class
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
     * @mbg.generated  Sun Nov 05 18:23:19 CST 2017
=======
     * @mbg.generated  Sun Nov 12 14:24:13 CST 2017
>>>>>>> 3ac524975058... see #1124_8
=======
     * @mbg.generated  Wed Nov 15 16:43:59 CST 2017
>>>>>>> 0d22cc3d6c22... see f_1124_15
=======
     * @mbg.generated  Wed Nov 15 19:25:35 CST 2017
>>>>>>> f56a08fb9d4a... see f_1139_1
=======
     * @mbg.generated  Thu Nov 16 22:47:22 CST 2017
>>>>>>> d053db385567... see f_1139_2
=======
     * @mbg.generated  Fri Nov 17 14:37:24 CST 2017
>>>>>>> 2913deae1992... see f_1124_17
     */
    long countByExample(ClassExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_class
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
     * @mbg.generated  Sun Nov 05 18:23:19 CST 2017
=======
     * @mbg.generated  Sun Nov 12 14:24:13 CST 2017
>>>>>>> 3ac524975058... see #1124_8
=======
     * @mbg.generated  Wed Nov 15 16:43:59 CST 2017
>>>>>>> 0d22cc3d6c22... see f_1124_15
=======
     * @mbg.generated  Wed Nov 15 19:25:35 CST 2017
>>>>>>> f56a08fb9d4a... see f_1139_1
=======
     * @mbg.generated  Thu Nov 16 22:47:22 CST 2017
>>>>>>> d053db385567... see f_1139_2
=======
     * @mbg.generated  Fri Nov 17 14:37:24 CST 2017
>>>>>>> 2913deae1992... see f_1124_17
     */
    int deleteByExample(ClassExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_class
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
     * @mbg.generated  Sun Nov 05 18:23:19 CST 2017
=======
     * @mbg.generated  Sun Nov 12 14:24:13 CST 2017
>>>>>>> 3ac524975058... see #1124_8
=======
     * @mbg.generated  Wed Nov 15 16:43:59 CST 2017
>>>>>>> 0d22cc3d6c22... see f_1124_15
=======
     * @mbg.generated  Wed Nov 15 19:25:35 CST 2017
>>>>>>> f56a08fb9d4a... see f_1139_1
=======
     * @mbg.generated  Thu Nov 16 22:47:22 CST 2017
>>>>>>> d053db385567... see f_1139_2
=======
     * @mbg.generated  Fri Nov 17 14:37:24 CST 2017
>>>>>>> 2913deae1992... see f_1124_17
     */
    @Delete({ "delete from wzsport_class", "where id = #{id,jdbcType=BIGINT}" })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_class
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
     * @mbg.generated  Sun Nov 05 18:23:19 CST 2017
=======
     * @mbg.generated  Sun Nov 12 14:24:13 CST 2017
>>>>>>> 3ac524975058... see #1124_8
=======
     * @mbg.generated  Wed Nov 15 16:43:59 CST 2017
>>>>>>> 0d22cc3d6c22... see f_1124_15
=======
     * @mbg.generated  Wed Nov 15 19:25:35 CST 2017
>>>>>>> f56a08fb9d4a... see f_1139_1
=======
     * @mbg.generated  Thu Nov 16 22:47:22 CST 2017
>>>>>>> d053db385567... see f_1139_2
=======
     * @mbg.generated  Fri Nov 17 14:37:24 CST 2017
>>>>>>> 2913deae1992... see f_1124_17
     */
    @Insert({ "insert into wzsport_class (major_id, university_id, ", "name, grade, created_at, ", "updated_at)",
            "values (#{majorId,jdbcType=BIGINT}, #{universityId,jdbcType=BIGINT}, ",
            "#{name,jdbcType=VARCHAR}, #{grade,jdbcType=SMALLINT}, #{createdAt,jdbcType=TIMESTAMP}, ",
            "#{updatedAt,jdbcType=TIMESTAMP})" })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
    int insert(Class record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_class
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
     * @mbg.generated  Sun Nov 05 18:23:19 CST 2017
=======
     * @mbg.generated  Sun Nov 12 14:24:13 CST 2017
>>>>>>> 3ac524975058... see #1124_8
=======
     * @mbg.generated  Wed Nov 15 16:43:59 CST 2017
>>>>>>> 0d22cc3d6c22... see f_1124_15
=======
     * @mbg.generated  Wed Nov 15 19:25:35 CST 2017
>>>>>>> f56a08fb9d4a... see f_1139_1
=======
     * @mbg.generated  Thu Nov 16 22:47:22 CST 2017
>>>>>>> d053db385567... see f_1139_2
=======
     * @mbg.generated  Fri Nov 17 14:37:24 CST 2017
>>>>>>> 2913deae1992... see f_1124_17
     */
    int insertSelective(Class record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_class
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
     * @mbg.generated  Sun Nov 05 18:23:19 CST 2017
=======
     * @mbg.generated  Sun Nov 12 14:24:13 CST 2017
>>>>>>> 3ac524975058... see #1124_8
=======
     * @mbg.generated  Wed Nov 15 16:43:59 CST 2017
>>>>>>> 0d22cc3d6c22... see f_1124_15
=======
     * @mbg.generated  Wed Nov 15 19:25:35 CST 2017
>>>>>>> f56a08fb9d4a... see f_1139_1
=======
     * @mbg.generated  Thu Nov 16 22:47:22 CST 2017
>>>>>>> d053db385567... see f_1139_2
=======
     * @mbg.generated  Fri Nov 17 14:37:24 CST 2017
>>>>>>> 2913deae1992... see f_1124_17
     */
    List<Class> selectByExample(ClassExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_class
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
     * @mbg.generated  Sun Nov 05 18:23:19 CST 2017
=======
     * @mbg.generated  Sun Nov 12 14:24:13 CST 2017
>>>>>>> 3ac524975058... see #1124_8
=======
     * @mbg.generated  Wed Nov 15 16:43:59 CST 2017
>>>>>>> 0d22cc3d6c22... see f_1124_15
=======
     * @mbg.generated  Wed Nov 15 19:25:35 CST 2017
>>>>>>> f56a08fb9d4a... see f_1139_1
=======
     * @mbg.generated  Thu Nov 16 22:47:22 CST 2017
>>>>>>> d053db385567... see f_1139_2
=======
     * @mbg.generated  Fri Nov 17 14:37:24 CST 2017
>>>>>>> 2913deae1992... see f_1124_17
     */
    @Select({ "select", "id, major_id, university_id, name, grade, created_at, updated_at", "from wzsport_class",
            "where id = #{id,jdbcType=BIGINT}" })
    @ResultMap("com.wzsport.mapper.ClassMapper.BaseResultMap")
    Class selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_class
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
     * @mbg.generated  Sun Nov 05 18:23:19 CST 2017
=======
     * @mbg.generated  Sun Nov 12 14:24:13 CST 2017
>>>>>>> 3ac524975058... see #1124_8
=======
     * @mbg.generated  Wed Nov 15 16:43:59 CST 2017
>>>>>>> 0d22cc3d6c22... see f_1124_15
=======
     * @mbg.generated  Wed Nov 15 19:25:35 CST 2017
>>>>>>> f56a08fb9d4a... see f_1139_1
=======
     * @mbg.generated  Thu Nov 16 22:47:22 CST 2017
>>>>>>> d053db385567... see f_1139_2
=======
     * @mbg.generated  Fri Nov 17 14:37:24 CST 2017
>>>>>>> 2913deae1992... see f_1124_17
     */
    int updateByExampleSelective(@Param("record") Class record, @Param("example") ClassExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_class
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
     * @mbg.generated  Sun Nov 05 18:23:19 CST 2017
=======
     * @mbg.generated  Sun Nov 12 14:24:13 CST 2017
>>>>>>> 3ac524975058... see #1124_8
=======
     * @mbg.generated  Wed Nov 15 16:43:59 CST 2017
>>>>>>> 0d22cc3d6c22... see f_1124_15
=======
     * @mbg.generated  Wed Nov 15 19:25:35 CST 2017
>>>>>>> f56a08fb9d4a... see f_1139_1
=======
     * @mbg.generated  Thu Nov 16 22:47:22 CST 2017
>>>>>>> d053db385567... see f_1139_2
=======
     * @mbg.generated  Fri Nov 17 14:37:24 CST 2017
>>>>>>> 2913deae1992... see f_1124_17
     */
    int updateByExample(@Param("record") Class record, @Param("example") ClassExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_class
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
     * @mbg.generated  Sun Nov 05 18:23:19 CST 2017
=======
     * @mbg.generated  Sun Nov 12 14:24:13 CST 2017
>>>>>>> 3ac524975058... see #1124_8
=======
     * @mbg.generated  Wed Nov 15 16:43:59 CST 2017
>>>>>>> 0d22cc3d6c22... see f_1124_15
=======
     * @mbg.generated  Wed Nov 15 19:25:35 CST 2017
>>>>>>> f56a08fb9d4a... see f_1139_1
=======
     * @mbg.generated  Thu Nov 16 22:47:22 CST 2017
>>>>>>> d053db385567... see f_1139_2
=======
     * @mbg.generated  Fri Nov 17 14:37:24 CST 2017
>>>>>>> 2913deae1992... see f_1124_17
     */
    int updateByPrimaryKeySelective(Class record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_class
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
     * @mbg.generated  Sun Nov 05 18:23:19 CST 2017
=======
     * @mbg.generated  Sun Nov 12 14:24:13 CST 2017
>>>>>>> 3ac524975058... see #1124_8
=======
     * @mbg.generated  Wed Nov 15 16:43:59 CST 2017
>>>>>>> 0d22cc3d6c22... see f_1124_15
=======
     * @mbg.generated  Wed Nov 15 19:25:35 CST 2017
>>>>>>> f56a08fb9d4a... see f_1139_1
=======
     * @mbg.generated  Thu Nov 16 22:47:22 CST 2017
>>>>>>> d053db385567... see f_1139_2
=======
     * @mbg.generated  Fri Nov 17 14:37:24 CST 2017
>>>>>>> 2913deae1992... see f_1124_17
     */
    @Update({ "update wzsport_class", "set major_id = #{majorId,jdbcType=BIGINT},",
            "university_id = #{universityId,jdbcType=BIGINT},", "name = #{name,jdbcType=VARCHAR},",
            "grade = #{grade,jdbcType=SMALLINT},", "created_at = #{createdAt,jdbcType=TIMESTAMP},",
            "updated_at = #{updatedAt,jdbcType=TIMESTAMP}", "where id = #{id,jdbcType=BIGINT}" })
    int updateByPrimaryKey(Class record);

    /**
	* 根据教师id获取所有相关联的班级
	* 
	* @param teacherId 教师id
	*/
	@Select("SELECT class.id AS id, "
			+ "class.major_id AS marjor_id, "
			+ "class.university_id AS university_id, "
			+ "class.name AS name, "
			+ "class.grade AS grade, "
			+ "class.created_at AS created_at "
			+ "FROM wzsport_r_teacher_class "
			+ "JOIN wzsport_class as class ON wzsport_r_teacher_class.class_id = class.id "
			+ "WHERE wzsport_r_teacher_class.teacher_id = #{teacherId}")
	List<Class> listClassByTeacherId(long teacherId);
}