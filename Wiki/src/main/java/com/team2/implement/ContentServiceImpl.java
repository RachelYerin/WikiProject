package com.team2.implement;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.team2.dao.ContentMapper;
import com.team2.dao.MemberMapper;
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


	@Override
	public void registerContent(String title, String desc, String reg_email) throws Exception {
		
		ContentInfoObject content = new ContentInfoObject();
		ContentMapper contentMapper = sqlSession.getMapper(ContentMapper.class);

		HashMap<String, String> map = new HashMap<String,String>();
		map.put("title",title);
		map.put("desc",desc);
		map.put("reg_email",reg_email);
		contentMapper.insertContent(map);
		
	}
	
	@Override
	public void deleteContent(String idx, String reg_email) throws Exception {
		
		//ContentInfoObject content = new ContentInfoObject();
		//content.setIdx(idx);
		//content.setReg_email(reg_email);
		ContentMapper contentMapper = sqlSession.getMapper(ContentMapper.class);
		
		contentMapper.deleteContent(idx, reg_email);
		
	}
}
