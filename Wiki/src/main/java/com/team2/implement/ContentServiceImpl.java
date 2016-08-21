package com.team2.implement;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.team2.dao.ContentMapper;
import com.team2.database.ContentInfoObject;
import com.team2.database.MemberInfoObject;
import com.team2.service.ContentService;


@Service
public class ContentServiceImpl implements ContentService{

	@Autowired
	@Qualifier("sqlSession")
	private SqlSession sqlSession;


	@Override
	public ArrayList<ContentInfoObject> getBoardList()
			throws Exception {
		
		ArrayList<ContentInfoObject> result = new ArrayList<ContentInfoObject>();
		
		ContentMapper contentMapper = sqlSession.getMapper(ContentMapper.class);
        result = contentMapper.getBoardList();
        
        return result;
	}
	
	

}
