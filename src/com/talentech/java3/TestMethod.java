package com.talentech.java3;

public class TestMethod {

	public static void main(String[] args) {
		BaseClass obj1 = new BaseClass();
		BaseClass obj2 = new DerivedClass();
		
		obj1.methodToOverride();
		obj2.methodToOverride();

	}
}

