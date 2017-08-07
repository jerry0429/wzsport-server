package com.wzsport.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import com.wzsport.model.User;
import com.wzsport.model.UserExample;

public interface UserMapper {
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_user
	 * @mbg.generated  Mon Aug 07 21:37:47 CST 2017
	 */
	long countByExample(UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_user
	 * @mbg.generated  Mon Aug 07 21:37:47 CST 2017
	 */
	int deleteByExample(UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_user
	 * @mbg.generated  Mon Aug 07 21:37:47 CST 2017
	 */
	@Delete({ "delete from wzsport_user", "where id = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_user
	 * @mbg.generated  Mon Aug 07 21:37:47 CST 2017
	 */
	@Insert({ "insert into wzsport_user (username, password, ", "university_id, latest_token, ",
			"created_at, updated_at)", "values (#{username,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
			"#{universityId,jdbcType=BIGINT}, #{latestToken,jdbcType=VARCHAR}, ",
			"#{createdAt,jdbcType=TIMESTAMP}, #{updatedAt,jdbcType=TIMESTAMP})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_user
	 * @mbg.generated  Mon Aug 07 21:37:47 CST 2017
	 */
	int insertSelective(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_user
	 * @mbg.generated  Mon Aug 07 21:37:47 CST 2017
	 */
	List<User> selectByExample(UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_user
	 * @mbg.generated  Mon Aug 07 21:37:47 CST 2017
	 */
	@Select({ "select", "id, username, password, university_id, latest_token, created_at, updated_at",
			"from wzsport_user", "where id = #{id,jdbcType=BIGINT}" })
	@ResultMap("com.wzsport.mapper.UserMapper.BaseResultMap")
	User selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_user
	 * @mbg.generated  Mon Aug 07 21:37:47 CST 2017
	 */
	int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_user
	 * @mbg.generated  Mon Aug 07 21:37:47 CST 2017
	 */
	int updateByExample(@Param("record") User record, @Param("example") UserExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_user
	 * @mbg.generated  Mon Aug 07 21:37:47 CST 2017
	 */
	int updateByPrimaryKeySelective(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table wzsport_user
	 * @mbg.generated  Mon Aug 07 21:37:47 CST 2017
	 */
	@Update({ "update wzsport_user", "set username = #{username,jdbcType=VARCHAR},",
			"password = #{password,jdbcType=VARCHAR},", "university_id = #{universityId,jdbcType=BIGINT},",
			"latest_token = #{latestToken,jdbcType=VARCHAR},", "created_at = #{createdAt,jdbcType=TIMESTAMP},",
			"updated_at = #{updatedAt,jdbcType=TIMESTAMP}", "where id = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(User record);

	/**
	* 根据id获取user和关联的roles
	* 
	* @param id
	*/
	@Select("SELECT user.id as user_id,"
			+ "user.username as username,"
			+ "user.password as password,"
			+ "user.university_id as university_id, "
			+ "role.id as role_id,"
			+ "role.name as role_name "
			+ "FROM wzsport_user as user "
			+ "LEFT JOIN wzsport_r_user_role as relation ON user.id = relation.user_id "
			+ "LEFT JOIN wzsport_role as role ON role.id = relation.role_id "
			+ "WHERE user.id = #{id}")
	@ResultMap(value = { "userWithRolesResultMap" })
	User selectWithRolesByPrimaryKey(@Param("id") long id);
	
	/**
	* 根据username获取user和关联的roles
	* 
	* @param username - 用户名
	*/
	@Select("SELECT user.id as user_id,"
			+ "user.username as username,"
			+ "user.password as password,"
			+ "user.university_id as university_id, "
			+ "role.id as role_id,"
			+ "role.name as role_name "
			+ "FROM wzsport_user as user "
			+ "LEFT JOIN wzsport_r_user_role as relation ON user.id = relation.user_id "
			+ "LEFT JOIN wzsport_role as role ON role.id = relation.role_id "
			+ "WHERE user.username = #{username}")
	@ResultMap(value = { "userWithRolesResultMap" })
	User selectWithRolesByUsername(@Param("username") String username);
}