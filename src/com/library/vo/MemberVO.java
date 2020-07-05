package com.library.vo;

public class MemberVO {
	private String id;
	private String passwd;
	private String name;
	private String email;
	private String birth;
	static int count;
	
	public MemberVO(String tId, String tPasswd, String tName, String tEmail, String tBirth) {
		id = tId;
		passwd = tPasswd;
		name = tName;
		email = tEmail;
		birth = tBirth;
	}
	
	public MemberVO() {
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}

}
