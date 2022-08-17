package com.iu.start.bankbook;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/bankbook/*")
public class BankBookController {
	
	@Autowired
	private BankBookService bankBookService;	

	@RequestMapping(value = "list", method = RequestMethod.GET)
	public void list(HttpServletRequest re) throws Exception{
		List<BankBookDTO> ar= bankBookService.getList();
		
		re.setAttribute("list", ar);
	}
	
//	public ModelAndView detail(Long bookNum) throws Exception {
//		
//	}
//	
//	public String add() {
//		
//	}
//	
//	public ModelAndView add(BankBookDTO dto) throws Exception {
//		
//	}
//	
//	public ModelAndView update(BankBookDTO dto, ModelAndView mv) throws Exception {
//		
//	}
//	public ModelAndView update(BankBookDTO dto) throws Exception{
//		
//	}
//	
//	public ModelAndView delete(BankBookDTO dto) throws Exception {
//		
//	}
}
