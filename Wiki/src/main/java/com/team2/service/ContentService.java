package com.team2.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
//import com.team2.database.MemberInfoObject;

import com.team2.database.ContentInfoObject;

public interface ContentService {

	ArrayList<ContentInfoObject> getBoardList() throws Exception;

}

