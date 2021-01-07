package com.mycompany.myhome.board;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	
	//@Resource 가 BoardDao라는 이름의 객체를 찾아서 연결작업(
	@Resource(name="BoardDao")
	BoardDao boardDao;

	@Override
	public List<BoardDto> getList() {
		return boardDao.getList();
	}

}
