package com.team2.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
//import com.team2.database.MemberInfoObject;

import com.team2.database.ContentInfoObject;

public interface ContentService {
	public ArrayList<ContentInfoObject> getBoardList() throws Exception;
	public void registerContent(String title, String desc, String reg_email) throws Exception;
	public void deleteContent(String idx, String reg_email) throws Exception;
}

