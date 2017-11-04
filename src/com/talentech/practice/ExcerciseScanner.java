package com.talentech.practice;

import java.util.Scanner;

public class ExcerciseScanner {

	public static void main(String[] args) {
	
		Scanner reader =new Scanner(System.in);
		System.out.println("enter number: ");
		int age = reader.nextInt();
		
		if (age>=18 && age<=34){
			System.out.println("superUser");}
		else if (age>=35 && age<=65){
			System.out.println("olderUser");}
		else if (age>=12 && age<=17){
			System.out.println("underAge");}
		else {
			System.out.println("out of range");}
	}
}