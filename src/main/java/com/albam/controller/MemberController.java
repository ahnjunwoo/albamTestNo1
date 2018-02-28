package com.albam.controller;

import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.albam.domain.Member;
import com.albam.service.MemberService;


/**
 * @author ahnjunwoo
 * desc : 회원관련 처리 클래스(일단 가입만 구현)
 */
@RestController
@RequestMapping("/members")
public class MemberController {
	private static Logger logger = (Logger) LoggerFactory.getLogger(MemberController.class);
	@Autowired
	MemberService memberService;
	@RequestMapping(value="",method=RequestMethod.POST)
	public ResponseEntity<HashMap<String, Object>> memberSave(@RequestBody Member member){
		HashMap<String, Object> result = memberService.memberSave(member);
		return new ResponseEntity<HashMap<String, Object>>(result, HttpStatus.OK);
	}
}
