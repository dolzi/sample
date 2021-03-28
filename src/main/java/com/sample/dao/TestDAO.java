package com.sample.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sample.vo.TestVO;

@Repository
public class TestDAO {

    @Autowired
    private SqlSession sqlSession;
	
	public List<TestVO> selectUserList() throws Exception {
		return sqlSession.selectList("userMapper.selectUserList");
	}

}
