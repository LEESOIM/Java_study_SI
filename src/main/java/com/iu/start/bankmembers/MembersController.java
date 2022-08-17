package com.iu.start.bankmembers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/member/*")
public class MembersController {
	
	@Autowired
	private MembersService membersService;
	
	
	@RequestMapping(value = "join.iu", method = RequestMethod.GET)
	public void join() {
		System.out.println("회원가입 실행");
	}
	
	@RequestMapping(value = "join.iu", method = RequestMethod.POST)
	public String join(BankMembersDTO bankMembersDTO) throws Exception {
		System.out.println("회원가입 성공");
		int result = membersService.setJoin(bankMembersDTO);
		System.out.println(bankMembersDTO.getUserName());
		System.out.println(bankMembersDTO.getPassword());
		return "redirect:../";
	}
	
	
	@RequestMapping(value = "search.iu", method = RequestMethod.GET)
	public void searchID() throws Exception {
		System.out.println("아이디찾기 실행");
	}
	
	@RequestMapping(value = "search.iu", method = RequestMethod.POST)
	public String searchID(String search, Model model) throws Exception {
		System.out.println("아이디찾기 성공");
		List<BankMembersDTO> li = membersService.getSearchByID(search);
		model.addAttribute("list", li);
		return "member/list";
	}
	
	
	@RequestMapping(value = "login.iu", method = RequestMethod.GET)
	public void login() {
		System.out.println("로그인 실행");
	}

	@RequestMapping(value = "login.iu", method = RequestMethod.POST)
	public String login(BankMembersDTO bankMembersDTO, HttpSession session) throws Exception {
		System.out.println("로그인 성공");
		bankMembersDTO = membersService.getLogin(bankMembersDTO);
		session.setAttribute("success", bankMembersDTO);
		return "redirect:../";
	}
	
	@RequestMapping(value = "logout.iu", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		System.out.println("로그아웃 성공");
		session.invalidate();
		return "redirect:../";
	}

}
