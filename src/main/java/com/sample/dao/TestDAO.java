package com.sample.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.sample.vo.TestVO;

@Mapper
public interface TestDAO {
	
	public List<TestVO> selectUserList() throws Exception;

}
