package com.team2.dao;

import java.util.ArrayList;
import java.util.Map;

import com.team2.database.ContentInfoObject;
import com.team2.database.MemberInfoObject;

public interface ContentMapper {
	ArrayList<ContentInfoObject> getBoardList();
	void insertContent(ContentInfoObject contetnObject);
	void updateContent(String idx);
	void deleteContent(String idx);
	
	ArrayList<ContentInfoObject> searchContentByIdx(String idx);
}
