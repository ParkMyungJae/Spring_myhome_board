package com.mycompany.myhome;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/test")
	String test1(Model model) {
		//Model 객체는 jsp의  request 객체에 값을 전달할때 사용된다.
		//jsp에서 ${user01} 형태의 표현식으로 접근해도 되고 request.getAttribute 함수를 사용해도 된다.
		
		model.addAttribute("userid", "user01");
		model.addAttribute("username", "홍길동");
		//HashTable, HashMap 처럼 사용 키와 값 쌍을 저장한다.
		
		return "test";
	}
	
	@RequestMapping("/test/list")
	String testList(Model model) {
		List<String> list = new ArrayList<String>();
		list.add("장미");
		list.add("작약");
		list.add("백일홍");
		list.add("꽃잔디");
		list.add("패랭이꽃");
		list.add("목련");
		
		model.addAttribute("flowerList", list);
		
		return "/test/list"; //test 폴더 아래에 list.jsp 호출하기
	}
	
	//http://localhost:9090/myhome/userinfo?userid=test&password=1234
	@RequestMapping("/userinfo")
	String userinfo(Model model, String userid, String password) {
		model.addAttribute("userid", userid);
		model.addAttribute("password", password);
		
		return "userinfo";
	}
}
