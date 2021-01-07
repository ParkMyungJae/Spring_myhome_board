package com.mycompany.myhome.board;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("boardService")
public class BoardServiceImpl implements BoardService {
	
	//@Resource �� BoardDao��� �̸��� ��ü�� ã�Ƽ� �����۾�(
	@Resource(name="BoardDao")
	BoardDao boardDao;

	@Override
	public List<BoardDto> getList() {
		return boardDao.getList();
	}

}
