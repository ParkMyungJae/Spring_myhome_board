package com.mycompany.myhome.board;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("BoardDao")
public class BoardDaoImpl implements BoardDao{

	@Autowired
	SqlSessionTemplate sm;
	
	@Override
	public List<BoardDto> getList() {
		return sm.selectList("Board_getList");
	}
}
