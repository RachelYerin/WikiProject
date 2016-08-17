package com.team2.implement;

import com.team2.database.MemberInfoObject;

public interface MemberServiceImpl {

	public MemberInfoObject searchUserWithUserid(long userid);
	public MemberInfoObject searchUserWithUsername(String username);
	public boolean signup(MemberInfoObject object);
	public boolean login(String username, String pw);
}
