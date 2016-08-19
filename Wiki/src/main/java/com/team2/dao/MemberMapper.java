package com.team2.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.team2.database.MemberInfoObject;

public interface MemberMapper {
	ArrayList<MemberInfoObject> getMembers();
	void insertMember(MemberInfoObject userObject);
	void updateMember(String name);
	void deleteMember(String name);
	
	MemberInfoObject loginMember(HashMap<String, String> map);
	ArrayList<MemberInfoObject> searchMemberByEmail(String email);
}
