package com.sample.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sample.vo.testVO;

@Repository
public class testDAO {

    @Autowired
    private SqlSessionTemplate sqlSession;
	
	public List<testVO> selectUserList() throws Exception {
		return sqlSession.selectList("userMapper.selectUserList");
	}

}
