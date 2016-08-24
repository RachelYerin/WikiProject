package com.team2.implement;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.team2.dao.ContentMapper;
import com.team2.database.ContentInfoObject;
import com.team2.service.ContentService;


@Service
public class ContentServiceImpl implements ContentService{

	@Autowired
	@Qualifier("sqlSession")
	private SqlSession sqlSession;


	// 모든 게시물을 받아와 ArrayList에 받고 리턴해줌 (예린)
	@Override
	public ArrayList<ContentInfoObject> getBoardList()
			throws Exception {
		
		ArrayList<ContentInfoObject> result = new ArrayList<ContentInfoObject>();
		
		ContentMapper contentMapper = sqlSession.getMapper(ContentMapper.class);
        result = contentMapper.getBoardList();
        
        return result;
	}


	//제목, 내용, 등록자의 email을 받아와 새 글 등록 (예린)
	@Override
	public void registerContent(String title, String desc, String reg_email) throws Exception {
		
		//ContentInfoObject content = new ContentInfoObject();
		ContentMapper contentMapper = sqlSession.getMapper(ContentMapper.class);

		HashMap<String, String> map = new HashMap<String,String>();
		map.put("title",title);
		map.put("desc",desc);
		map.put("reg_email",reg_email);
		contentMapper.insertContent(map);
		
	}
	
	//해당 게시물의 인덱스, 등록자를 받아와 비교 후 삭제 (예린)
	@Override
	public void deleteContent(String idx, String userEmail) throws Exception {
		
		ContentInfoObject content = new ContentInfoObject();
		content.setIdx(idx);
		content.setReg_email(userEmail);
		
		
		ContentMapper contentMapper = sqlSession.getMapper(ContentMapper.class);
		contentMapper.deleteContent(content);
		
	}

	//인덱스 값으로 게시물 검색하여 리턴 (예린)
	@Override
	public ContentInfoObject searchContentByIdx(String idx) {
		
		ContentInfoObject content = new ContentInfoObject();
		ContentMapper contentMapper = sqlSession.getMapper(ContentMapper.class);
		content = contentMapper.searchContentByIdx(idx);
		
		return content;
	}

	
	//컨텐츠 수정하여 업데이트 (예린)
	@Override
	public ContentInfoObject modifyAndUpdateContent(String idx, String title, String desc, String reg_email) throws Exception {
		
		ContentInfoObject content = new ContentInfoObject();
		
		ContentMapper contentMapper = sqlSession.getMapper(ContentMapper.class);
		
		HashMap<String, String> map = new HashMap<String,String>();
		map.put("idx", idx);
		map.put("title",title);
		map.put("desc",desc);
		map.put("reg_email",reg_email); // 수정자 이메일로 세팅
		
		contentMapper.updateContent(map);  // 수정일이 현재시간으로 세팅
		content = contentMapper.searchContentByIdx(idx); // 인덱스로 찾아와 게시물 리턴
		
		return content;
	}


	@Override
	public ContentInfoObject searchContentsByKeyword(String keyword) {
		
		ContentInfoObject content = new ContentInfoObject();
		ContentMapper contentMapper = sqlSession.getMapper(ContentMapper.class);
		content = contentMapper.searchContentByKeyword(keyword);
		
		return content;
	}
	
}
