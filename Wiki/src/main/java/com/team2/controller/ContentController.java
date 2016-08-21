package com.team2.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.team2.database.ContentInfoObject;
import com.team2.implement.ContentServiceImpl;

@Controller
public class ContentController {
	
	private static final Logger logger = LoggerFactory.getLogger(ContentController.class);
	
	@Autowired
	private ContentServiceImpl service;
	
	
	@RequestMapping("boardListView.do")
	public String boardListView(){
		logger.info("boardListView()");
		
		return "boardList";
	}
	
	
	
	@RequestMapping("viewContents.do")
	public ModelAndView viewContents( Map<String, Object> map ) throws Exception{
		logger.info("viewContents()");
		
		ModelAndView mav = new ModelAndView("boardList");
		
		List<ContentInfoObject> contentList = service.getBoardList();
		mav.addObject("list", contentList);
		mav.setViewName("boardList");
		
		return mav;
	}
	
	
	
}
