package com.talentech.practice;

public class MyTest {
	
	public int a = 20; //Can use it from other package too
	private int b = 30; //Only can use in this class
	protected int c; //only access from same package classes
	
	public static int t;
		
	public static void main(String[] args) {
		int d =15;
		if (d<20){ //single line no need {} if multiple line need{}
			System.out.println("good number");}
		else if (d==15){
			System.out.println("perfect number");}
	}
	private void test(){	
	}	
	private void t1(int a, String b){
	}	
}