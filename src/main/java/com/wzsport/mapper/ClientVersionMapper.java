package com.wzsport.mapper;

import com.wzsport.model.ClientVersion;
import com.wzsport.model.ClientVersionExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface ClientVersionMapper {
    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_client_version
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
    long countByExample(ClientVersionExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_client_version
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
    int deleteByExample(ClientVersionExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_client_version
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
    @Delete({ "delete from wzsport_client_version", "where id = #{id,jdbcType=BIGINT}" })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_client_version
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
    @Insert({ "insert into wzsport_client_version (version_name, version_code, ", "change_log, is_forced, ",
            "download_url, is_published, ", "platform_id)",
            "values (#{versionName,jdbcType=VARCHAR}, #{versionCode,jdbcType=INTEGER}, ",
            "#{changeLog,jdbcType=VARCHAR}, #{isForced,jdbcType=BIT}, ",
            "#{downloadUrl,jdbcType=VARCHAR}, #{isPublished,jdbcType=TINYINT}, ", "#{platformId,jdbcType=TINYINT})" })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
    int insert(ClientVersion record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_client_version
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
    int insertSelective(ClientVersion record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_client_version
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
    List<ClientVersion> selectByExample(ClientVersionExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_client_version
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
    @Select({ "select", "id, version_name, version_code, change_log, is_forced, download_url, is_published, ",
            "platform_id", "from wzsport_client_version", "where id = #{id,jdbcType=BIGINT}" })
    @ResultMap("com.wzsport.mapper.ClientVersionMapper.BaseResultMap")
    ClientVersion selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_client_version
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
    int updateByExampleSelective(@Param("record") ClientVersion record, @Param("example") ClientVersionExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_client_version
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
    int updateByExample(@Param("record") ClientVersion record, @Param("example") ClientVersionExample example);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_client_version
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
    int updateByPrimaryKeySelective(ClientVersion record);

    /**
     * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_client_version
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
    @Update({ "update wzsport_client_version", "set version_name = #{versionName,jdbcType=VARCHAR},",
            "version_code = #{versionCode,jdbcType=INTEGER},", "change_log = #{changeLog,jdbcType=VARCHAR},",
            "is_forced = #{isForced,jdbcType=BIT},", "download_url = #{downloadUrl,jdbcType=VARCHAR},",
            "is_published = #{isPublished,jdbcType=TINYINT},", "platform_id = #{platformId,jdbcType=TINYINT}",
            "where id = #{id,jdbcType=BIGINT}" })
    int updateByPrimaryKey(ClientVersion record);

    @Select("SELECT * FROM wzsport_client_version where is_published = 1 and platform_id  = #{platform_id,jdbcType=TINYINT} ORDER BY version_code DESC limit 1")
    ClientVersion getLasetVersionInfo(Byte platform_id);
}