package com.team2.service;

import java.util.ArrayList;
import java.util.Map;

import javax.activation.CommandMap;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.team2.database.FileInfoObject;


public interface FileService {

	public ArrayList<FileInfoObject> getTest() throws Exception;
	
/*	public String getExtension(String fileName) throws Exception;
	public String saveToFile(MultipartFile src, String id) throws Exception;
	public FileInfoObject save(MultipartFile multipartFile);
	public FileInfoObject get(String id);
	//void insertfile(Map<String, Object> map, HttpServletRequest request) throws Exception;
	//ModelAndView insertfile(CommandMap commandMap, HttpServletRequest request)			throws Exception;
	void insertfile(Map<String, Object> map, HttpServletRequest request) throws Exception;
*/

}