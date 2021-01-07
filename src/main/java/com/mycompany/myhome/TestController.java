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
		//Model ��ü�� jsp��  request ��ü�� ���� �����Ҷ� ���ȴ�.
		//jsp���� ${user01} ������ ǥ�������� �����ص� �ǰ� request.getAttribute �Լ��� ����ص� �ȴ�.
		
		model.addAttribute("userid", "user01");
		model.addAttribute("username", "ȫ�浿");
		//HashTable, HashMap ó�� ��� Ű�� �� ���� �����Ѵ�.
		
		return "test";
	}
	
	@RequestMapping("/test/list")
	String testList(Model model) {
		List<String> list = new ArrayList<String>();
		list.add("���");
		list.add("�۾�");
		list.add("����ȫ");
		list.add("���ܵ�");
		list.add("�з��̲�");
		list.add("���");
		
		model.addAttribute("flowerList", list);
		
		return "/test/list"; //test ���� �Ʒ��� list.jsp ȣ���ϱ�
	}
	
	//http://localhost:9090/myhome/userinfo?userid=test&password=1234
	@RequestMapping("/userinfo")
	String userinfo(Model model, String userid, String password) {
		model.addAttribute("userid", userid);
		model.addAttribute("password", password);
		
		return "userinfo";
	}
}
