package com.talentech.practice;

public class Exercise1nonparameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	myMethod();

	}
	
	public static void myMethod(){
		int age = 4; 

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
