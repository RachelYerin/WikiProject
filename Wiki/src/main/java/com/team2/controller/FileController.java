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
   
   @Autowired
   private FileServiceImpl service;
   FileInfoObject img = null;
   
   @RequestMapping("fileUpload.do")
   public ModelAndView fileUpload(HttpSession session, String title, String desc, MultipartFile file) throws Exception{
      logger.info("fileUpload()");
      
//      service.save(file);
      ModelAndView mav = new ModelAndView("redirect:/main.do");
      
      return mav;
   }
   
   
}