package com.albam.service;

import java.util.HashMap;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.albam.common.exception.handler.RestExceptionHandler;
import com.albam.domain.Member;
import com.albam.repository.MemberRepository;

@Service
public class MemberService {
	@Autowired
	MemberRepository reop;
	/**
	 * - 코드 관리 : enum 클래스를 이용하여 구현 (다른방법으로 공통 메세지 처리 propertiese파일로 할수 있다..)
	 * 
	 * - username, password, account 3가지 파라미터에 대한 기본적인 validation 검사 처리 (예외 처리는 공통 예외 처리 부분 작성하여 처리)
	 * 1. 모든 파라미터에 대한 길이 체크 username,password,account 20자리 체크 (HTTP STATS CODE:400, code:E0001, message: param + "길이는 최대 20자") 
	 * 2. account 이메일 형식만 입력 받게 체크 ( HTTP STATS CODE:400, code:E0001, message: "account는 이메일형식만 가능") 
	 * 3. 모든 파라미터는 필수값 처리 (HTTP STATS CODE:400, code:E0001, message: "param +"필수값") 
	 * 음...이정도만 vaildation 처리 하자...
	 * 
	 * - 패스 워드 : sha 암호화 하여 저장
	 * 
	 * @param member
	 * @return
	 * @throws Exception 
	 */
	public HashMap<String, Object> memberSave(Member member) {
		HashMap<String, Object> result = new HashMap<>();
		reop.save(member);
		result.put("code", "S0000");
		result.put("message", "정상처리");
		return result;
	}

}
