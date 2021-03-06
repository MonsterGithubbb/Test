package com.example.spring.Mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.spring.Mybatis.Entity.User;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@Mapper
@Repository
public interface UserMapper {
	
	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(String userName);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated
	 */
	int insert(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated
	 */
	int insertSelective(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated
	 */
	User selectByPrimaryKey(String userName);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(User record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user
	 * @mbg.generated
	 */
	int updateByPrimaryKey(User record);

	List<User> selectByPage(@Param("offset") Long offset, @Param("limit") Long limit);

	User getAll();
	
	User getOne(Long a);
	
	boolean exitUser(User user);
	
	int update(User user);
	
	int delete(Long b);
	
	User selectUser(@Param("userName1") String userName ,@Param("password1") String password);

}
