package com.team2.database;

public class MemberInfoObject {

	private String userid;
	private String username;
	private String pw;
	private String email;
	
	public MemberInfoObject() {
		
	}
	
	public String getUserid() {
		return userid;
	}
	
	public void setUserid (String string) {
		this.userid = string;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername (String username){
		this.username = username;
	}
	
	public String getPw() {
		return pw;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
}
