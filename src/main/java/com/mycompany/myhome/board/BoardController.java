package com.mycompany.myhome.board;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {
	@Resource(name="boardService")
	BoardService boardService;
	
	@RequestMapping("/board/list")
	String board_list(Model model) {
		model.addAttribute("boardList", boardService.getList());
		return "board/board_list";
	}
}
