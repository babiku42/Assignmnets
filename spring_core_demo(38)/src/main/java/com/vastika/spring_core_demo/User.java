package com.vastika.spring_core_demo;

public class User {
//	public void displayUserInfo() {
//		System.out.println("Hi there");
//	}
	
	

	private String username;
	public User(String username, Long mobileNo, Long age) {
		super();
		this.username = username;
		this.mobileNo = mobileNo;
		this.age = age;
	}
	private Long mobileNo;
	private Long age;

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public void displayUserInfo() {
		System.out.println("user name is"+ getUsername());
		System.out.println("mobile number is"+ getMobileNo());
		System.out.println("age is"+ getAge());
	}
}

