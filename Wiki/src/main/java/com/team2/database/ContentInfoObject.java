package com.team2.database;

public class ContentInfoObject {

	private String idx;
	private String title;
	private String desc;
	private String filename;
	private String del_yn;
	private String reg_date;
	private String upd_date;
	private String reg_email;
	
	public ContentInfoObject() {
		
	}
	
	public String getIdx()	{
		return idx;
	}
	
	public void setIdx(String idx){
		this.idx = idx;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public void setDesc(String desc){
		this.desc = desc;
	}
	
	public String getFilename() {
		return filename;
	}
	
	public void setFilename(String filename){
		this.filename = filename;
	}
	
	public String getDel_YN() {
		return del_yn;
	}
	
	public void setDel_YN(String del_yn){
		this.del_yn = del_yn;
	}
	
	public String getReg_date() {
		return reg_date;
	}
	
	public void setReg_date(String reg_date){
		this.reg_date = reg_date;
	}
	
	public String getUpd_date() {
		return upd_date;
	}
	
	public void setUpd_date(String upd_date){
		this.upd_date = upd_date;
	}
	
	public String getReg_email() {
		return reg_email;
	}
	
	public void setReg_email(String reg_email){
		this.reg_email = reg_email;
	}
}
