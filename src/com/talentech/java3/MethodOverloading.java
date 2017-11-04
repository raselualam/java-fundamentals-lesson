//Write a program  using method overloading and one method is displaying the addition of two variable, 
//another method is displaying name and age of the person and 
//another method is displaying name, age, contribution

package com.talentech.java3;

public class MethodOverloading  {

	public static void main(String[] args) {
		overloading(2,3);
		overloading("Rasel", 24);
		overloading("null",0,32);
	}
	
	public static void overloading( int a, int b){
		System.out.println(a+b);
	}
	public static void overloading(String name, int age){
		System.out.println(name + " "+ age);
	}
	
	public static void overloading(String name, int age, int contribution){
		System.out.print(contribution);
	}
}