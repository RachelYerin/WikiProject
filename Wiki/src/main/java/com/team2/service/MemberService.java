package com.team2.service;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.team2.database.MemberInfoObject;

public interface MemberService {
	public ArrayList<MemberInfoObject> getMembers();
    public void insertMember(MemberInfoObject userObject);
    public void updateMember(String name);
    public void deleteMember(String name);
    
    public MemberInfoObject login(String email, String pw);
    public ArrayList<MemberInfoObject> searchMemberByEmail(String email);
}

//MemerMapper와 내용은 같으나 DAO를 Mapper의 역할로서 함께 사용시 문제가 발생하기에 따로 구분하여 사용하는 것이 좋다!!! 
//중요하다!! 이거때문에 시간 많이 잡아 먹었다!