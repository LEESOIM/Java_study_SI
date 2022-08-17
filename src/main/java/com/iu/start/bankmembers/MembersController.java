package com.iu.start.bankmembers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/member/*")
public class MembersController {
	
	@Autowired
	private MembersService membersService;
	
	

}
