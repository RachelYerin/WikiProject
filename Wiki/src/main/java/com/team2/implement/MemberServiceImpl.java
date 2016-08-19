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
	
	@Override
	public ArrayList<MemberInfoObject> getMembers() {
		

		ArrayList<MemberInfoObject> result = new ArrayList<MemberInfoObject>();

        MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);

        result = memberMapper.getMembers();

        //받아오는거까지 성공. 확인함
        return result;
	}

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

	@Override
	public MemberInfoObject login(String email, String pw) {
		

		MemberInfoObject member = null;		
		MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class); //여기서 멈춤

		System.out.println("this issssssssssssssssss spartaaaaaaaaaaaa");
		
		HashMap<String, String> map = new HashMap<String,String>();
		map.put("email",email);
		map.put("pw",pw);
		member = memberMapper.loginMember(map);

		System.out.println("this issssssssssssssssss spartaaaaaaaaaaaa");
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
