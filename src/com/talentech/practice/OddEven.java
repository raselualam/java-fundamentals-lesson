package com.talentech.practice;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter=1;
		for (counter=1;counter<=50;counter ++){
			if(counter%2==0){
				System.out.println("This is even number "+ counter);
			}
			else{
				System.out.println("This is odd number "+ counter);
			}
		}
	}
}