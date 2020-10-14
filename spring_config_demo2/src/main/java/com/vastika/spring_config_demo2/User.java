package com.vastika.spring_config_demo2;

public class User {
private String userName;
private Long mobileNo;
private int age;
private Address address;
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public Long getMobileNo() {
	return mobileNo;
}
public void setMobileNo(Long mobileNo) {
	this.mobileNo = mobileNo;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public void displayUserInfo() {
	System.out.println("username is "+getUserName());
	System.out.println(("mobilenumber is "+getMobileNo()));
	System.out.println("age is "+getAge());
	System.out.println("city name is "+ getAddress().getCityName());
	System.out.println("country name is "+getAddress().getCountryName());
}

}
