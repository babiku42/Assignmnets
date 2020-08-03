package day10;

import java.util.Scanner;

public class WhileLoopDemo1 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);//while loop ma condition true hunai parxa nattra run nahune 
		boolean flag = true;					//do while ma condition true false condition le kei hudaina run hunxa
		while (flag) { //the name is uncertain until you put santosh name i  it
			System.out.println("Enter name:");
			String name = input.next();
			System.out.println("Name is "+name ); //
			if (name.equals("santosh")){ //this is where string is compared name.equals
				
			flag = false;
		}
		}
		System.out.println("exit from loop...");
		input.close();
	}
}
