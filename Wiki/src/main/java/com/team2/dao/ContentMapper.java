package com.team2.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.team2.database.ContentInfoObject;
import com.team2.database.MemberInfoObject;

public interface ContentMapper {
	ArrayList<ContentInfoObject> getBoardList();            //게시물 전체 리스트를 찾아 ArrayList로 반환
	void insertContent(HashMap<String, String> map);        //파라미터로 객체 정보를 넣어 등록
	void updateContent(HashMap<String, String> map);        //파라미터로 객체 정보를 넣어 수정
	void deleteContent(ContentInfoObject contentObject);    //파라미터로 객체 정보를 넣어 삭제
	
	ContentInfoObject searchContentByIdx(String idx);       //인덱스값으로 게시물을 찾아 리턴
}
