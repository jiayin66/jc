package com.jc.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.github.pagehelper.PageHelper;
import com.jc.mapper.UserMapper;
import com.jc.pojo.User;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;

@Api("用户管理")
@RestController
@RequestMapping("/user")
public class StudentController {

	@Autowired
	private UserMapper service;

	@ApiOperation("查询全部")
	@GetMapping("/userList")
	public List<User> getUserList() {
		return service.findAllUser();
	}

	@ApiOperation("分页查询全部")
	@GetMapping("/userList")
	public List<User> getUserListByPage(@RequestParam("pageNum") @ApiParam("第几页") int pageNum,
			@RequestParam("pageSize") @ApiParam("每页数量") int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		return service.findAllUser();
	}

	@ApiOperation("添加用户,返回本地")
	@GetMapping("/add/{id}/{username}")
	public User addUser1(@PathVariable @ApiParam("用户id") String id, @PathVariable @ApiParam("用户name") String username) {
		User user = new User();
		user.setId(id);
		user.setUsername(username);
		service.createUser(user);
		return user;
	}

	@ApiOperation("修改数据")
	@PostMapping("/update")
	public int addUser(@RequestParam("id") @ApiParam("用户id") String id,
			@RequestParam("username") @ApiParam("用户name") String username) {
		System.out.println(id + username);
		return service.updateById(id, username);

	}

}
