package com.team2.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.team2.database.MemberInfoObject;
import com.team2.implement.MemberServiceImpl;

@Controller
public class LoginController {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private MemberServiceImpl service;
	private MemberInfoObject memberObject = null;
	
	@RequestMapping("loginForm.do")
	public String loginForm(){
		logger.info("loginForm()");
		
		return "loginForm";
	}
	
	@RequestMapping("login.do")
	public ModelAndView login(HttpSession session, String email, String pw) {
		logger.info("login()");
		
		ModelAndView mav = new ModelAndView();
		memberObject = service.login(email, pw);
		
		if( memberObject != null ){
			session.setAttribute("userEmail", email);
			mav.setViewName("redirect:main.do");	
		}
		else{
			mav.addObject("isLogin", false);
			mav.setViewName("redirect:loginForm.do");
		}
		
		return mav;
	}
	
	@RequestMapping("main.do")
	public String main(Model model, HttpSession session){
		//String username = (String) session.getAttribute("username");
        //if(username == null)
        //    return "redirect:loginForm.do";
        //else{
            //login success
            return "index";
    }

}

	/*@RequestMapping("selectItem.do")
	public ModelAndView selectItem(Model model, HttpSession session){
		
		ModelAndView mav = new ModelAndView();
		
		String userNM = (String) session.getAttribute("username");
		
		if(userNM == null){
			mav.addObject("isLogin", "false");
		}
		
		return mav;
	}*/
	
	
