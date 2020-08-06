package day28;

import java.util.Comparator;

public class User implements Comparator<User> {
private String name;
private int roll;
public User() {
	super();
}
public User(String name, int roll ) {
	this.name= name;
	this.roll=roll;
}
public String getName() {
	return name;
}
public int getRoll() {
	return roll;
}
@Override
public String toString() {
	return " name=" + name + ", roll="+ roll;
}
@Override
public int compare(User o1, User o2) {
if(o1.getRoll()>o2.getRoll()) {
	return 1;
}else{
	return -1;

}
}
}



