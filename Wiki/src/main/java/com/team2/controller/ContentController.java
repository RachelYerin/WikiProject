package com.team2.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.team2.dao.ContentMapper;
import com.team2.dao.MemberMapper;
import com.team2.database.ContentInfoObject;
import com.team2.implement.ContentServiceImpl;

@Controller
public class ContentController {
	
	private static final Logger logger = LoggerFactory.getLogger(ContentController.class);
	
	@Autowired
	private ContentServiceImpl service;
	private ContentInfoObject content = null;	
	
	@RequestMapping("contentsListView.do")
	public ModelAndView contentsListView( Map<String, Object> map ) throws Exception{
		logger.info("contentsListView()");
		
		ModelAndView mav = new ModelAndView("boardList");
		
		List<ContentInfoObject> contentList = service.getBoardList();
		mav.addObject("list", contentList);
		mav.setViewName("boardList");
		
		return mav;
	}
	
	@RequestMapping("openContentWrite.do")
	public ModelAndView openContentWrite() throws Exception{
		logger.info("openContentWrite()");
		
		ModelAndView mav = new ModelAndView("ContentWrite");
		
		return mav;
	}
	
	@RequestMapping("registerContent.do")
	public ModelAndView registerContent(HttpSession session, String title, String desc) throws Exception{
		logger.info("registerContent()");
		
		String useremail = (String) session.getAttribute("userEmail");
		
		service.registerContent(title, desc, useremail);
		ModelAndView mav = new ModelAndView("redirect:/contentsListView.do");
		
		return mav;
	}
	
	@RequestMapping("deleteContent.do")
	public ModelAndView deleteContent(HttpSession session, String idx) throws Exception{
		logger.info("deleteContent()");

		String useremail = (String) session.getAttribute("userEmail");
		
		//service.
		ModelAndView mav = new ModelAndView("redirect:/contentsListView.do");
		
		return mav;
	}
}
