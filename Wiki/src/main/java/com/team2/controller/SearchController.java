package com.team2.controller;


import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.team2.database.ContentInfoObject;
import com.team2.database.MemberInfoObject;
import com.team2.implement.ContentServiceImpl;


@Controller
public class SearchController {
	
	@Autowired
    private ContentServiceImpl service;
	
	private static final Logger logger = LoggerFactory.getLogger(SearchController.class);

	
	@RequestMapping("search.do")
	public ContentInfoObject search(String keyword) throws Exception{
		logger.info("search()");
		
		ModelAndView mav = new ModelAndView("search");
		String key = "1";
		
		ContentInfoObject searchList = service.searchContentByIdx(key);
		mav.addObject("search", searchList);
		mav.setViewName("search");
		System.out.println(searchList);
		return searchList;
	}
	
}
