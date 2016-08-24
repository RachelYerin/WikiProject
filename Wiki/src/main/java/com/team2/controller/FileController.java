package com.team2.controller;

import java.util.LinkedHashMap;

import javax.activation.CommandMap;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.team2.database.FileInfoObject;
import com.team2.database.ImageView;
import com.team2.implement.ContentServiceImpl;
import com.team2.implement.FileServiceImpl;
import com.team2.service.FileService;

@Controller
public class FileController<ImageService> {
	private static final Logger logger = LoggerFactory.getLogger

(FileController.class);
	/*
	 * ImageView는 파일 시스템에 있는 이미지 파일을 응답으로 돌려주는 역할

을 합니다.
	 * 뒷 부분에서 ImageView 클래스를 작성하게 됩니다.
	 */
	@Resource(name="imageView") ImageView imageView;
	
	/**
	 * 이미지를 관리하는 서비스 계층 클래스입니다. 예제에서는 디비를 사용하

긴 버거워지므로
	 * 서비스 클래스를 따라하는 모양만 서비스인 클래스입니다.
	 */
	@Autowired
	private FileServiceImpl service;
	FileInfoObject img = null;
	
	/**
	 * 이미지 업로드를 위한 페이지 매핑 
	 */
	@RequestMapping("fileuploadview.do")
	private String uploadView() {
		logger.info("fileupload()");
		System.out.println("1111111111111111111111111111");
		return "writetest";
	}
	
	@RequestMapping(value="insertfile.do")
	public ModelAndView insertfile(CommandMap commandMap, 

HttpServletRequest request) throws Exception{
		System.out.println("1데스");
		ModelAndView mv = new ModelAndView

("redirect:/sample/openBoardList.do");
		//Map<String,Object> map = sampleService.selectBoardDetail(commandMap.getMap());
	    //mv.addObject("map", map.get("map"));
	    //mv.addObject("list", map.get("list"));

	    //Map<String,Object> map = service.insertfile(commandMap.getMap(), request);
	    System.out.println("2데tm"); 
	    return mv;
	}

	/**
	 * 이미지 업로드 페이지의 폼에서 전송 시 받게 되는 메서드 
	*/
	@RequestMapping(value="fileupload.do", 

method=RequestMethod.POST)
	private String upload(@RequestParam MultipartFile imageFile, ModelMap 

modelMap) {
		FileInfoObject fileInfo = service.save(imageFile);
		System.out.println("22222222222222222222");
		System.out.println(imageFile);
		System.out.println("제발");
		System.out.println(fileInfo);
		ModelAndView mav = new ModelAndView("img");
		mav.addObject("file", img);
		modelMap.put("imageFile", fileInfo);
		
		return "result";
	} 
	/*
	@RequestMapping("fileupload.do")
	public ModelAndView uploadFile(HttpSession session, MultipartFile 

imageFile) throws Exception{
		logger.info("file upload()");
		System.out.println("22222222222222222222");
		System.out.println(imageFile);
		//String useremail = (String) session.getAttribute("userEmail");
		
		service.save(imageFile);
		ModelAndView mav = new ModelAndView("result");
		
		return mav;
	}
	
*/
	
	@RequestMapping("/image/{imageId}")
	private ImageView getImage(@PathVariable String imageId, ModelMap 

modelMap) {
		FileInfoObject imageFile = service.get(imageId);
		
		modelMap.put("imageFile", imageFile);
		
		return imageView;
	}	
	
}
