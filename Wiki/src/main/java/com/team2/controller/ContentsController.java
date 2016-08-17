package com.team2.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContentsController {
	
	private static final Logger logger = LoggerFactory.getLogger(ContentsController.class);
	

	@RequestMapping("viewContents.do")
	public ModelAndView viewContents( Map<String, Object> map ) throws Exception{

		ModelAndView mav = new ModelAndView("boardList");
		
		//List<Map<String, Object>> list = contentsService.selectBoardList(map);
		//mav.addObject("list", list);
		mav.setViewName("boardList");
		
		return mav;
	}
	
}
