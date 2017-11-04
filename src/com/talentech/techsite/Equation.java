package com.talentech.techsite;

public class Equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		myMethod1();
		
		Equation myObject= new Equation ();
		myObject.myMethod2();
		
		int q = myMethod3();
		System.out.println("Result from static int method is "+q);
	}
	
	public static void myMethod1(){
		int a=10;
		int b=15;
		int d=b-a;
		System.out.println("Result from static void method is "+d);
	}
	
	public void myMethod2(){
		int b=15;
		int c=20;
		int e=c-b;
		System.out.println("Result from non static void method is "+e);
	}

	public static int myMethod3(){
		int a=10;
		int b=15;
		int m=a*b+89;
		return m;
	}
}