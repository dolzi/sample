package com.sample.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sample.service.TestService;
import com.sample.vo.TestVo;

@RestController
public class TestController {
	
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);

	@Autowired
	private TestService testService;
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	@ResponseBody
	public TestVo userInfo() throws Exception {

		TestVo testVo = new TestVo();
		testVo.setId("test");
		
		return testService.selectUser(testVo);
	}
	
	@RequestMapping(value = "/userList", method = RequestMethod.GET)
	@ResponseBody
	public List<TestVo> userInfoList() throws Exception {
		return testService.selectUserList();
	}
	
	@RequestMapping(value = "/insertUser", method = RequestMethod.GET)
	@ResponseBody
	public int insertUser() throws Exception {
		
		TestVo testVo = new TestVo();
		testVo.setId("test");
		testVo.setPw("test");
		testVo.setRegBy("test");
		
		return testService.insertUser(testVo);
	}
	
	@RequestMapping(value = "/updateUser", method = RequestMethod.GET)
	@ResponseBody
	public int updateUser() throws Exception {
		
		TestVo testVo = new TestVo();
		testVo.setId("test");
		testVo.setPw("test1");
		testVo.setModBy("test");
		
		return testService.updateUser(testVo);
	}
	
	@RequestMapping(value = "/deleteUser", method = RequestMethod.GET)
	@ResponseBody
	public int deleteUser() throws Exception {

		TestVo testVo = new TestVo();
		testVo.setId("test");
		
		return testService.deleteUser(testVo);
	}
	

}
