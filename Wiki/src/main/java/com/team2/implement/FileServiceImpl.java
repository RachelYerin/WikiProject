package com.team2.implement;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.team2.dao.FileMapper;
import com.team2.database.FileInfoObject;
import com.team2.service.FileService;


@Service
public class FileServiceImpl implements FileService{

	@Autowired
	@Qualifier("sqlSession")
	private SqlSession sqlSession;


	public ArrayList<FileInfoObject> getTest()
			throws Exception {
		
		ArrayList<FileInfoObject> result = new ArrayList<FileInfoObject>();
		
		FileMapper fileMapper = sqlSession.getMapper(FileMapper.class);
        result = fileMapper.getTest();
        
        return result;
	}
}