package com.wzsport.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.wzsport.model.College;
import com.wzsport.model.CollegeExample;

public interface CollegeMapper {

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_college
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
    long countByExample(CollegeExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_college
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
    int deleteByExample(CollegeExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_college
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
    @Delete({ "delete from wzsport_college", "where id = #{id,jdbcType=BIGINT}" })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_college
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
    @Insert({ "insert into wzsport_college (university_id, name, ", "created_at, updated_at)",
            "values (#{universityId,jdbcType=BIGINT}, #{name,jdbcType=VARCHAR}, ",
            "#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP})" })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
    int insert(College record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_college
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
    int insertSelective(College record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_college
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
    List<College> selectByExample(CollegeExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_college
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
    @Select({ "select", "id, university_id, name, created_at, updated_at", "from wzsport_college",
            "where id = #{id,jdbcType=BIGINT}" })
    @ResultMap("com.wzsport.mapper.CollegeMapper.BaseResultMap")
    College selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_college
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
    int updateByExampleSelective(@Param("record") College record, @Param("example") CollegeExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_college
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
    int updateByExample(@Param("record") College record, @Param("example") CollegeExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_college
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
    int updateByPrimaryKeySelective(College record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_college
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
    @Update({ "update wzsport_college", "set university_id = #{universityId,jdbcType=BIGINT},",
            "name = #{name,jdbcType=VARCHAR},", "created_at = #{createdAt,jdbcType=TIMESTAMP},",
            "updated_at = #{updatedAt,jdbcType=TIMESTAMP}", "where id = #{id,jdbcType=BIGINT}" })
    int updateByPrimaryKey(College record);
}