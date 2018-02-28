package com.albam.repository;

import org.springframework.data.repository.CrudRepository;

import com.albam.domain.Member;

public interface  MemberRepository extends CrudRepository<Member, Long>{
	
}
