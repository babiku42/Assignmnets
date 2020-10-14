package com.vastika.spring_list;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
private List<Address>address;

public List<Address> getAddress() {
	return address;
}
@Autowired
public void setAddress(List<Address> address) {
	this.address = address;
}
public void displayUserInfo() {
	for(Address address:getAddress()) {
		System.out.println("city name is" + address.getCityName());
		System.out.println("country name is "+ address.getCountryName()); 
	}
}

}
