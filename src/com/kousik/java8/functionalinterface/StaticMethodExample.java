package com.kousik.java8.functionalinterface;

interface Utility{
	public static int add(int a, int b) {
		return a+b;
	}
}

public class StaticMethodExample {//implements Utility{
	
	// Even we are not implements the interface we can call the static method
	
	public static void main(String[] args) {
	
		System.out.println(Utility.add(10, 10));
		
		/* The below methods are not valid to invoke the static methods	
		 * StaticMethodExample.add();
		add();
		StaticMethodExample s1 =new StaticMethodExample();
		s1.add();*/
	}

}
