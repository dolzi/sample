package com.sample.service;

import java.util.List;

import com.sample.vo.TestVo;

public interface TestService {

	TestVo selectUser(TestVo testVo) throws Exception;
	
	List<TestVo> selectUserList() throws Exception;
	
	int insertUser(TestVo testVo) throws Exception;
	
	int updateUser(TestVo testVo) throws Exception;
	
	int deleteUser(TestVo testVo) throws Exception;
}
