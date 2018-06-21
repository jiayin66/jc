package com.jc.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jc.pojo.User;

public interface UserMapper {
	

    /**
	     * 新增用户
	     * @param user
	     */
	    void createUser(User user);
	    /**
	     * 查询用户列表
	     * @return
	     */
	    List<User> findAllUser();
	    
	    int updateById(@Param("id") String id,@Param("username") String username);
	}

