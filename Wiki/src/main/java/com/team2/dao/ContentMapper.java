package com.team2.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.team2.database.ContentInfoObject;
import com.team2.database.MemberInfoObject;

public interface ContentMapper {
	ArrayList<ContentInfoObject> getBoardList();
	void insertContent(HashMap<String, String> map);
	void updateContent(HashMap<String, String> map);
	void deleteContent(ContentInfoObject contentObject);
	
	ContentInfoObject searchContentByIdx(String idx);
}
