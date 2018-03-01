package com.albam.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Member {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@NotEmpty(message="username 필수값")
    @Size(max = 20,message="username 최대길이 20")
	private String username; //회원이름
	@NotEmpty(message="password 필수값")
    @Size(max = 20,message="password 최대길이 20")
	private String password; //회원 패스워드
	@NotEmpty(message="account 필수값")
    @Size(max = 20,message="account 최대길이 20")
	@Email(message="account 이메일 형식만 지원")
	private String account; //회원 계정(전 이메일 형식으로 픽스!)
	
}
