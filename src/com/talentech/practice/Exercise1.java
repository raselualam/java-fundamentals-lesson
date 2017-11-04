package com.talentech.practice;

public class Exercise1 {

	public static void main(String[] args) {
	
	myMethod(4);
	myMethod(25);
	}
	
	public static void myMethod( int age) { //parameterized method 
		//int age = 4;
		if (age>=18 && age<=34){
			System.out.println("superUser");}
		else if (age>=35 && age<=65){
			System.out.println("olderUser");}
		else if (age>=12 && age<=17){
			System.out.println("underAge");}
		else {
			System.out.println("out of range");
		}
	}
}

