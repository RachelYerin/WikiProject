package com.team2.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.team2.database.MemberInfoObject;

public interface MemberMapper {
	ArrayList<MemberInfoObject> getMembers();                         // 전체 유저 받아옴, ArrayList로 반환
	void insertMember(MemberInfoObject userObject);                   // 멤버 추가                    
	void updateMember(String name);                                  
	void deleteMember(String name);
	
	MemberInfoObject loginMember(HashMap<String, String> map);        // 로그인 
	ArrayList<MemberInfoObject> searchMemberByEmail(String email);    // 이메일로 사용자 찾기 
}
