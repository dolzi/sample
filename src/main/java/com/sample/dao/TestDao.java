package com.sample.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sample.vo.TestVo;

@Mapper
public interface TestDao {
	
	TestVo selectUser(TestVo testVo) throws Exception;
	
	List<TestVo> selectUserList() throws Exception;
	
	int insertUser(TestVo testVo) throws Exception;
	
	int updateUser(TestVo testVo) throws Exception;
	
	int deleteUser(TestVo testVo) throws Exception;

}
