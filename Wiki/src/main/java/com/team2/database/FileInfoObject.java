package com.team2.database;

public class FileInfoObject {

	//private String idx;
	//private String board_idx;
	//private String original_filename;
	//private String stored_filename;
	//private String file_size;
	//private String crea_dtm;
	//private String crea_id;
	//private String del_yn;
	
	/**
	 * 업로드한 이미지 파일이 저장될 경로
	 */
	public static final String IMAGE_DIR = "/web/upload_images/";

	private String id;
	private String contentType;
	private int contentLength;
	private String fileName;
	
	public FileInfoObject(String id, String contentType, int contentLength, String fileName) {
		this.id = id;
		this.contentType = contentType;
		this.contentLength = contentLength;
		this.fileName = fileName;
	}
	
	public String getId()	{
		return id;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public int getContentLength() {
		return contentLength;
	}

	public void setContentLength(int contentLength) {
		this.contentLength = contentLength;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	/*
	public String getBoardIdx() {
		return board_idx;
	}
	
	public void setBoardIdx(String board_idx){
		this.board_idx = board_idx;
	}
	
	public String getOriginalFilename() {
		return original_filename;
	}
	
	public void setOriginalFilename(String original_filename){
		this.original_filename = original_filename;
	}
	
	public String getStoredFilename() {
		return stored_filename;
	}
	
	public void setStoredFilename(String stored_filename){
		this.stored_filename = stored_filename;
	}
	
	public String getFilesize() {
		return file_size;
	}
	
	public void setFilesize(String file_size){
		this.file_size = file_size;
	}
	
	public String getCreaDtm() {
		return crea_dtm;
	}
	
	public void setCreaDtm(String crea_dtm){
		this.crea_dtm = crea_dtm;
	}
	
	public String getCreaId() {
		return crea_id;
	}
	
	public void setCreaId(String crea_id){
		this.crea_id = crea_id;
	}
	
	public String getDel_YN() {
		return del_yn;
	}
	
	public void setDel_YN(String del_yn){
		this.del_yn = del_yn;
	}*/
}