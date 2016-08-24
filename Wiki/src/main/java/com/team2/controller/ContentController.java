package com.team2.controller;
//git
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
	
	@RequestMapping("openContentDetail.do")
	public ModelAndView ModelAndView(HttpSession session, String idx) throws Exception{
		logger.info("registerContent()");
		
		String useremail = (String) session.getAttribute("userEmail");
		content = service.searchContentByIdx(idx);
		ModelAndView mav = new ModelAndView("contentsDetail");
		mav.addObject("content", content);
		content = null;
		
		return mav;
	}
	
	@RequestMapping("deleteContent.do")
	public ModelAndView deleteContent(HttpSession session, String idx) throws Exception{
		logger.info("deleteContent()");
		
		String userEmail = (String) session.getAttribute("userEmail");
		
		service.deleteContent(idx, userEmail);
		ModelAndView mav = new ModelAndView("redirect:/contentsListView.do");
		
		return mav;
	}
	
	@RequestMapping("modifyContentView.do")
	public ModelAndView modifyContentView(HttpSession session, String idx) throws Exception{
		logger.info("modifyContentView()");
		
		String userEmail = (String) session.getAttribute("userEmail");
		content = service.searchContentByIdx(idx);

		ModelAndView mav = new ModelAndView("contentsModify");
		mav.addObject("content", content);
		
		return mav;
	}
	
	@RequestMapping("updateContent.do")
	public ModelAndView updateContent(HttpSession session, String idx, String title, String desc) throws Exception{
		logger.info("updateContent()");

		String userEmail = (String) session.getAttribute("userEmail");

		service.modifyAndUpdateContent(idx, title, desc, userEmail);
		String url = "redirect:/openContentDetail.do?idx="+content.getIdx();
		System.out.println(url+"##################################");
		ModelAndView mav = new ModelAndView(url);
		return mav;
	}
}
