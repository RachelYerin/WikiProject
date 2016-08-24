package com.team2.implement;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

import javax.activation.CommandMap;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.team2.dao.ContentMapper;
import com.team2.dao.FileMapper;
import com.team2.database.FileInfoObject;
import com.team2.service.FileService;


@Service
public class FileServiceImpl implements FileService{

	@Override
	public ArrayList<FileInfoObject> getTest() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
	

	/*@Autowired
	@Qualifier("sqlSession")
	private SqlSession sqlSession;

	
	public ArrayList<FileInfoObject> getTest() throws Exception {
		
		ArrayList<FileInfoObject> result = new ArrayList<FileInfoObject>();
		
		FileMapper fileMapper = sqlSession.getMapper(FileMapper.class);
        //result = fileMapper.getTest();
		result = null; //testtttttttttttttt
        
        return result;
	}
	
	
	public FileInfoObject save(MultipartFile multipartFile) {
		
		String savedFileName;
		
		try {
			savedFileName = saveToFile(multipartFile, multipartFile.getOriginalFilename());
			imageFile = new FileInfoObject(genId, multipartFile.getContentType(),(int)multipartFile.getSize(),savedFileName);
			
			imageFilesMap.put(genId, imageFile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return imageFile;
	}
	
	*//**
	 * 파일이름으로부터 확장자를 반환하는 메서드
	 * 파일이름에 확장자 구분을 위한 . 문자가 없거나. 가장 끝에 있는 경우는 빈문자열 ""을 리턴
	 *//*
	@Override
	public String getExtension(String fileName) throws Exception {
		// TODO Auto-generated method stub
		int dotPosition = fileName.lastIndexOf('.');
		
		if (-1 != dotPosition && fileName.length() - 1 > dotPosition) {
			return fileName.substring(dotPosition + 1);
		} else {
			return "";
		}
	}
	*//**
	 * Multipart File의 내용을 파일로 저장, 저장 후 저장된 파일 이름을 반환
	 *//*
	@Override
	public String saveToFile(MultipartFile src, String id) throws Exception {
		// TODO Auto-generated method stub
		String fileName = src.getOriginalFilename();
		byte[] bytes = src.getBytes();
		String saveFileName = id + "." + getExtension(fileName);
		String savePath = FileInfoObject.IMAGE_DIR + saveFileName;

		 파일 쓰기 
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(savePath));
		bos.write(bytes);
		bos.flush();
		bos.close();
		
		return saveFileName;
	}

	@Override
	public ModelAndView insertfile(CommandMap commandMap, HttpServletRequest request) throws Exception{
	    ModelAndView mv = new ModelAndView("result");
	     
	    FileService service;
		service.insertfile(commandMap.getMap(), request);
	     
	    return mv;
	}
	@Override
	public void insertfile(Map<String, Object> map, HttpServletRequest request) throws Exception {
		System.out.println(map);
	    //sampleDAO.insertBoard(map);
	     
	    MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest)request;
	    Iterator<String> iterator = multipartHttpServletRequest.getFileNames();
	    MultipartFile multipartFile = null;
	    while(iterator.hasNext()){
	        multipartFile = multipartHttpServletRequest.getFile(iterator.next());
	        if(multipartFile.isEmpty() == false){
	            log.debug("------------- file start -------------");
	            log.debug("name : "+multipartFile.getName());
	            log.debug("filename : "+multipartFile.getOriginalFilename());
	            log.debug("size : "+multipartFile.getSize());
	            log.debug("-------------- file end --------------\n");
	        }
	    }
	}*/

}