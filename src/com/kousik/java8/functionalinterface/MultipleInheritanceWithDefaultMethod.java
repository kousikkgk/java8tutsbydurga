package com.kousik.java8.functionalinterface;

interface Left{
	default void m1() {
		System.out.println("Left interface m1() method");
	}	
}
interface Right{
	default void m1() {
		System.out.println("Right interface m1() method");
	}	
}

//If we are not override the m1() method compiler will throw error
public class MultipleInheritanceWithDefaultMethod implements Left,Right {
	public void m1() {
		System.out.println("Interface implementation....");
		Left.super.m1();//Left interface method
		Right.super.m1();//Right interface method
	}
	public static void main(String[] args) {
		MultipleInheritanceWithDefaultMethod m1 = new MultipleInheritanceWithDefaultMethod();
		m1.m1();
	}

}
