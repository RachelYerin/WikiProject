package com.team2.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.team2.database.ContentInfoObject;
import com.team2.implement.ContentServiceImpl;

@Controller
public class ContentController {
	
	private static final Logger logger = LoggerFactory.getLogger(ContentController.class);
	
	@Autowired
	private ContentServiceImpl service;
	private ContentInfoObject content = null;	
	
	// 모든 컨텐츠 리스트, 서버에 저장되어있는 컨텐츠를 모두 List<>로 받아와서 View에 넘겨준다. (예린)
	@RequestMapping("contentsListView.do")
	public ModelAndView contentsListView( Map<String, Object> map ) throws Exception{
		logger.info("contentsListView()");
		
		ModelAndView mav = new ModelAndView("boardList");
		
		List<ContentInfoObject> contentList = service.getBoardList();
		mav.addObject("list", contentList);
		mav.setViewName("boardList");
		
		return mav;
	}
	
	// 게시물 작성 요청 뷰를 반환 (예린)
	@RequestMapping("openContentWrite.do")
	public ModelAndView openContentWrite() throws Exception{
		logger.info("openContentWrite()");
		
		ModelAndView mav = new ModelAndView("ContentWrite");
		
		return mav;
	}
	
	//게시물작성 뷰에서 등록 버튼을 눌렀을 때. 해당 내용을 받아와 서버에 저장 (예린)
	@RequestMapping("registerContent.do")
	public ModelAndView registerContent(HttpSession session, String title, String desc) throws Exception{
		logger.info("registerContent()");
		
		String useremail = (String) session.getAttribute("userEmail");
		
		service.registerContent(title, desc, useremail);
		ModelAndView mav = new ModelAndView("redirect:/contentsListView.do");
		
		return mav;
	}
	
	//게시물 상세 조회. 조회할 게시물의 idx를 받아와 서버에서 검색하여 해당 객체를 반환. (예린)
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
	
	//상세조회 중 삭제 버튼을 눌렀을 때. 해당 게시물의 idx를 받아와 delete를 하고 게시물 목록으로 redirect (예린)
	@RequestMapping("deleteContent.do")
	public ModelAndView deleteContent(HttpSession session, String idx) throws Exception{
		logger.info("deleteContent()");
		
		String userEmail = (String) session.getAttribute("userEmail");
		ModelAndView mav = new ModelAndView("redirect:/contentsListView.do");
		
		content = service.searchContentByIdx(idx);
		
		if( !userEmail.equals(content.getReg_email())){
			String failDesc = "<span>삭제 권한이 없습니다.</span><span>클릭하시면 리스트로 이동합니다.</span>";
			mav.setViewName("failurePage");
			mav.addObject("FailureType", failDesc);
			//mav.setViewName("deleteFailure");
			return mav;
		}
		
		service.deleteContent(idx, userEmail);

		return mav;
	}
	
	//게시물 수정 View. 해당 게시물의 idx를 받아와 객체를 리턴해줌.
	@RequestMapping("modifyContentView.do")
	public ModelAndView modifyContentView(HttpSession session, String idx) throws Exception{
		logger.info("modifyContentView()");
		
		String userEmail = (String) session.getAttribute("userEmail");
		content = service.searchContentByIdx(idx);

		ModelAndView mav = new ModelAndView("contentsModify");
		mav.addObject("content", content);
		
		return mav;
	}
	
	// 수정 버튼을 눌렀을 때. 해당 View에서 수정한 게시물의 idx, 수정한 내용 등을 받아와 service에서 처리후 수정된 게시물 상세 조회로 리턴. (예린)
	@RequestMapping("updateContent.do")
	public ModelAndView updateContent(HttpSession session, String idx, String title, String desc) throws Exception{
		logger.info("updateContent()");

		String userEmail = (String) session.getAttribute("userEmail");

		service.modifyAndUpdateContent(idx, title, desc, userEmail);
		String url = "redirect:/openContentDetail.do?idx="+content.getIdx();
		ModelAndView mav = new ModelAndView(url);
		return mav;
	}
	
	// 파일 등록 테스트용 뷰 호출 (예린)
	@RequestMapping("fileUploadView.do")
	   public String fileUploadView(HttpSession session) throws Exception {
		   logger.info("fileUploadView()");
		      
		   return "writetest";
	   }
	
	// 파일 등록 테스트중 (예린)
	@RequestMapping("registerContentAndFile.do")
	public ModelAndView registerContentAndFile(HttpSession session, String title, String desc, MultipartFile file) throws Exception{
		logger.info("registerContentAndFile()");

		String userEmail = (String) session.getAttribute("userEmail");

		//service.modifyAndUpdateContent(title, desc, userEmail);
		
		ModelAndView mav = new ModelAndView();
		return mav;
	}
	
	// 해당 키워드로 검색, 검색결과 없으면 failure 페이지로 리턴
	@RequestMapping("searchContents.do")
	public ModelAndView searchContents(HttpSession session, String keyword) throws Exception{
		logger.info("registerContentAndFile()");

		ModelAndView mav = new ModelAndView();
		List<ContentInfoObject> contentList = service.searchContentsByKeyword(keyword);

		if ( keyword.isEmpty() || contentList == null ){
			String failDesc = "<span>검색 결과가 없습니다.</span><span>클릭하시면 리스트로 이동합니다.</span>";
			mav.setViewName("failurePage");
			mav.addObject("FailureType", failDesc);
			
			return mav;
		}
		
		mav.addObject("list", contentList);
		mav.setViewName("boardList");

		return mav;
	}
	
}
