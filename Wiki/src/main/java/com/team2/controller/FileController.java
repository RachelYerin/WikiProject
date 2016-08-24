package com.team2.controller;

import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import com.team2.database.FileInfoObject;
import com.team2.implement.FileServiceImpl;

@Controller
public class FileController {
	private static final Logger logger = LoggerFactory.getLogger(FileController.class);
	
	/*
	 *  이미지를 관리하는 서비스 계층 클래스입니다. 예제에서는 디비를 사용하긴 버거워지므로 서비스 클래스를 따라하는 모양만 서비스인 클래스입니다.
	 */
	@Autowired
	private FileServiceImpl service;
	FileInfoObject img = null;
	
	@RequestMapping("fileupload.do")
	public ModelAndView uploadFile(HttpSession session, MultipartFile imageFile) throws Exception{
		logger.info("file upload()");
		System.out.println("111111111");
		System.out.println(imageFile);
		
		service.save(imageFile);
		ModelAndView mav = new ModelAndView("redirect:/main.do");
		
		return mav;
	}
}
