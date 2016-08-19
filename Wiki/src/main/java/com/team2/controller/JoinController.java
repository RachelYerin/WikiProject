package com.team2.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.team2.database.MemberInfoObject;
import com.team2.implement.MemberServiceImpl;

@Controller
public class JoinController {
   
   private static final Logger logger = LoggerFactory.getLogger(JoinController.class);

   private MemberInfoObject memberObject;
   
   @Autowired
    private MemberServiceImpl service;
   
   @RequestMapping("joinForm.do")
   public String joinForm(){
      logger.info("joinForm()");
      
      return "joinForm";
   }

   @RequestMapping("check_name.do")
   public ModelAndView check_result(HttpServletRequest request,HttpServletResponse response, String email) {
      logger.info("this is duple check");
      
      //view 화면에 DB로부터 읽어온 데이터를 보여줌
      ModelAndView mav = new ModelAndView();
      
      List<MemberInfoObject> alllist = service.searchMemberByEmail(request.getParameter("id"));
      
      if(alllist.size() > 0){
          response.setCharacterEncoding("EUC-KR");
           PrintWriter writer;
           try {
            writer = response.getWriter();
            writer.println("<script type='text/javascript'>");
             writer.println("alert('이미 존재하는 이메일입니다.');");
             writer.println("self.close();");
             writer.println("</script>");
             writer.flush();
           } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
           }
      }
      else{
         response.setCharacterEncoding("EUC-KR");
           PrintWriter writer;
           try {
            writer = response.getWriter();
            writer.println("<script type='text/javascript'>");
             writer.println("alert('사용가능한 이메일입니다.');");
             writer.println("self.close();");
             writer.println("</script>");
             writer.flush();
           } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
           }
      }
      
      mav.addObject("alllist", alllist);

      return mav;
   }
   
   @RequestMapping("join.do")
   public ModelAndView join(HttpServletRequest request,HttpServletResponse response, String username, String email, String pw) {
      logger.info("join()");
      
      MemberInfoObject newmember = new MemberInfoObject() ;
      ModelAndView mav = new ModelAndView();
      
      newmember.setUsername(username);
      newmember.setEmail(email);
      newmember.setPw(pw);
      service.insertMember(newmember);
      
      mav.addObject("newmember", newmember);
      response.setCharacterEncoding("UTF-8");
        PrintWriter writer;
        try {
         writer = response.getWriter();
         writer.println("<script type='text/javascript'>");
          writer.println("alert('회원가입 성공! 축하합니다.');");
          //writer.println("self.close();");
          writer.println("</script>");
          writer.flush();
          mav.setViewName("redirect:/");
        } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
        }
      
      
      return mav;
      
   }


}