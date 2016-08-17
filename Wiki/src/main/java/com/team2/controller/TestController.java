package com.team2.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.team2.database.MemberInfoObject;
import com.team2.service.MemberService;

@Controller
public class TestController {
	
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	private MemberService service;
	private MemberInfoObject memberObject;
	
	@RequestMapping("test.do")
	public String loginForm(){
		logger.info("TESTDB()");
		System.out.println("sdfdf");
		return "joinForm";
	}
	

}
