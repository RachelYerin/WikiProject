package com.team2.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.team2.database.ContentInfoObject;
import com.team2.database.MemberInfoObject;

public interface ContentMapper {
	ArrayList<ContentInfoObject> getBoardList();
	void insertContent(HashMap<String, String> map);
	void updateContent(String idx);
	void deleteContent(String idx);
	
	ArrayList<ContentInfoObject> searchContentByIdx(String idx);
}
