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
		 * 회원가입 파라미터 체크
		 * 1. account: 계정 이
		 */
		reop.save(member);
		result.put("code", "S000");
		result.put("msg", "회원가입 처리 완료");
		return result;
	}
	
	
}
