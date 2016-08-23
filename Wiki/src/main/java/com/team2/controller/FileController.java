package com.team2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.team2.implement.FileServiceImpl;

@Controller
public class FileController {
	
	private static final Logger logger = LoggerFactory.getLogger(FileController.class);
	
	@Autowired
	private FileServiceImpl service;
	
	
	@RequestMapping("fileuploadview.do")
	public String fileuploadview(){
		logger.info("fileupload()");
		
		return "writetest";
	}
	
	@RequestMapping("fileupload.do")
	public String fileupload(){
		logger.info("fileupload()");
		
		return "writetest";
	}
	
	
	
}
