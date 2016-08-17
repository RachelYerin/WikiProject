package com.team2.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.team2.database.MemberInfoObject;
import com.team2.service.MemberDAOService;

@Controller
public class MemberController {
	
	@Autowired
    private MemberDAOService memberDAOService;
	
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);

	
	@RequestMapping("memberView.do")
	public ModelAndView member() {
		logger.info("this is member");
		
		//view 화면에 DB로부터 읽어온 데이터를 보여줌
		ModelAndView mav = new ModelAndView();
		//addObject view에 넘어가는 데이터??

		System.out.println("ok**************************************************");
		
		List<MemberInfoObject> memberList = memberDAOService.getMembers();
		

		System.out.println("list size : " + memberList.size());
		
		mav.addObject("result", memberList);
		mav.setViewName("result");

		return mav;
	}
	
	@RequestMapping("insert.do")
	public ModelAndView insert(HttpServletRequest request){
		
		MemberInfoObject member = new MemberInfoObject();
		member.setUserid((String) request.getParameter("userid"));
		member.setUsername((String) request.getParameter("username"));
		member.setPw((String) request.getParameter("pw"));
		member.setEmail((String) request.getParameter("email"));
		
		memberDAOService.insertMember(member);
		System.out.println("Insert is success");
		
		ModelAndView mav = new ModelAndView();
		List<MemberInfoObject> memberList = memberDAOService.getMembers();
		mav.addObject("result", memberList);		
		
		return mav;
	}
	
}