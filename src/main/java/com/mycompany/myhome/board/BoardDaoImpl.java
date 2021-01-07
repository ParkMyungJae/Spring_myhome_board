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

	@Override
	public void insert(BoardDto dto) {
		//xml 파일의 id, parameterType에 전달될 객체
		sm.insert("Board_insert", dto);
		
	}

	@Override
	public BoardDto getView(String id) {
		return sm.selectOne("Board_view", id);
	}
}
