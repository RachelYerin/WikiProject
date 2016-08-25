package com.team2.controller;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.team2.database.ContentInfoObject;
import com.team2.database.MemberInfoObject;
import com.team2.implement.ContentServiceImpl;
import com.team2.implement.MemberServiceImpl;

@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private MemberServiceImpl service;
	private MemberInfoObject memberObject = null;
	
	//로그인 화면으로 리턴
	@RequestMapping("loginForm.do")
	public String loginForm(){
		logger.info("loginForm()");
		
		return "loginForm";
	}
	
	//로그인 시도. 받아온 email과 pw로 서버에 해당 객체가 있는지 확인. 있다면 session에 email저장 없다면 실패 페이지로 리턴 (예린)
	@RequestMapping("login.do")
	public ModelAndView login(HttpSession session, String email, String pw) {
		logger.info("login()");
		
		ModelAndView mav = new ModelAndView();
		memberObject = service.login(email, pw);
		
		if( memberObject != null ){
			session.setAttribute("userEmail", email);
			mav.setViewName("redirect:/main.do");	
		}
		else{
			//mav.addObject("isLogin", false);
			mav.setViewName("redirect:/loginFailure.do");
		}
		
		return mav;
	}
	
	// index가 나오는 메인 페이지 (예린)
	@RequestMapping("main.do")
	public ModelAndView main(Model model, HttpSession session){

		//ContentInfoObject content = new ContentInfoObject();
		//ContentServiceImpl conService = new ContentServiceImpl(); 
		//변수 선언 없이 그냥 퍼블릭 함수를 호출하고 싶었는데 그게 안됨. 왜 그런지 모르겠어 연희야 ㅠㅠ
		//content = conService.selectRandomContents();
		ModelAndView mav = new ModelAndView("index");
		//mav.addObject("content", content);
		
		return mav;
    }

	// 로그인 실패시 나오는 페이지로 리턴 
	@RequestMapping("loginFailure.do")
	public String loginFailure(ModelAndView mav) {
		logger.info("loginFailure()");
		System.out.println("call: login failure");
		
		return "loginFailure";
	}
	
	@RequestMapping("logout.do")
	public String logout(HttpSession session){
		logger.info("logout()");

		session.setAttribute("userEmail", null);
		
		return "index";
	}
}

