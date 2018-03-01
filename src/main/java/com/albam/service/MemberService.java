package com.albam.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.albam.domain.Member;
import com.albam.repository.MemberRepository;

@Service
public class MemberService {
	@Autowired
	MemberRepository reop;

	public HashMap<String, Object> memberSave(Member member) {
		HashMap<String, Object> result = new HashMap<>();
		/*
		 * - 코드 관리 : enum 클래스를 이용하여 구현
		 * - username, password, account 3가지 파라미터에 대한 기본적인 validation 검사 처리
		 *  1. 모든 파라미터에 대한 길이 체크 username,password,account 20자리 체크 (code:
		 *  2. account 이메일 형식만 입력 받게 체크
		 *  3. password 길이 최소 8글자 대문자&특수문자 존재 체크
		 *  4. 모든 파라미터는 필수값 처리
		 *  음...이정도만 vaildation 처리 하자...
		 *  
		 * - 패스 워드 : sha 암호화 하여 저장
		 * 
		 * 위 내용정도만 구현하고 ~~~~~~~~
		 * 
		 * 
		 *  
		 */
		reop.save(member);
		result.put("code", "S000");
		result.put("msg", "회원가입 처리 완료");
		return result;
	}
	
	
}
