package com.team2.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
//import com.team2.database.MemberInfoObject;



import com.team2.database.ContentInfoObject;

public interface ContentService {
	
	// 모든 게시물을 받아옴
	public ArrayList<ContentInfoObject> getBoardList() throws Exception;
	// 게시물 등록
	public void registerContent(String title, String desc, String reg_email) throws Exception;
	// 게시물과 파일 등록 - 수정중
	public boolean registerContentAndFile(String title, String desc, String filename, String reg_email) throws Exception;
	// 게시물 삭제
	public void deleteContent(String idx, String userEmail) throws Exception;
	// 게시물 수정
	public ContentInfoObject modifyAndUpdateContent(String idx, String title, String desc, String reg_email) throws Exception;
	// 게시글 번호로 조회
	public ContentInfoObject searchContentByIdx(String idx);
	// 검색어로 조회
	public ArrayList<ContentInfoObject> searchContentsByKeyword(String keyword);
	// 게시글 랜덤으로 뽑아옴
	public ContentInfoObject selectRandomContents();
}

