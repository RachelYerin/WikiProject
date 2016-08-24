package com.team2.implement;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.team2.dao.MemberMapper;
import com.team2.database.MemberInfoObject;
import com.team2.service.MemberService;


@Repository
public class MemberServiceImpl implements MemberService{

	@Autowired
	@Qualifier("sqlSession")
	private SqlSession sqlSession;
	
	// 서버에 저장되어있는 모든 User를 불러와서 ArrayList로 반환 (예린)
	@Override
	public ArrayList<MemberInfoObject> getMembers() {
		

		ArrayList<MemberInfoObject> result = new ArrayList<MemberInfoObject>();

        MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);

        result = memberMapper.getMembers();

        return result;
	}

	//받아온 userObject 객체로 멤버를 추가 - (예린)
	@Override
	public void insertMember(MemberInfoObject userObject) {
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
        memberMapper.insertMember(userObject);
		
	}

	@Override
	public void updateMember(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMember(String name) {
		// TODO Auto-generated method stub
		
	}

	// 입력받은 email과 pw로 로그인을 시도, 만약 정보가 없거나 맞지않는다면 멤버객체를 null로 리턴 (예린)
	@Override
	public MemberInfoObject login(String email, String pw) {
		

		MemberInfoObject member = null;		
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class); 
		
		HashMap<String, String> map = new HashMap<String,String>();
		map.put("email",email);
		map.put("pw",pw);
		member = memberMapper.loginMember(map);

		return member;
	}
	
	//중복확인- 이메일로 사용자 중복확인(연희)
   @Override
   public ArrayList<MemberInfoObject> searchMemberByEmail(String email) {
      
	   	ArrayList<MemberInfoObject> result = new ArrayList<MemberInfoObject>();
        MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
        result = memberMapper.searchMemberByEmail(email);
        return result;
   }

}
