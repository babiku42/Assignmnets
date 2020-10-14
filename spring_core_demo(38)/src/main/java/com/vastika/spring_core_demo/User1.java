package com.vastika.spring_core_demo;

public class User1 {

	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public void displayUserInfo() {
		System.out.println("user name is"+ getUsername());
	}
}
//<!-- <bean id="" class="com.vastika.spring_core_demo.User">
//<constructor-arg type="Long" value="45" name="age"/>
//<constructor-arg value = "11111" name="mobileNo" />
//<constructor-arg value="Bikash" name="username" />
//</bean>
//</beans>
//<property name="username" value="BikuBro"></property> -->
//
//<!-- <constructor-arg value="9999" type="Long"/> -->
//
//<!-- <constructor-arg value= "Bikash" type= "java.Lang.String/> -->