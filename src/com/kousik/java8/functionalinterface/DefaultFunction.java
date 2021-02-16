package com.kousik.java8.functionalinterface;

interface A{
	public void m1();
	public void m2();
	default void m3() {
		System.out.println();
	}
}

interface B{
	//default method cannot be overide a method from java.lang.object
	/*default int hashCode() {
		return 1;
	}*/
}
class Test1 implements A{

	@Override
	public void m1() {System.out.println("Test 1 M1 method");}

	@Override
	public void m2() {System.out.println("Test 1 M2 method");}
	
	//while override it should be public
	public void m3() {
		System.out.println("Default m3() method from test1 class");
	}
	
}
/*Test2
 *Test3
 *Test4
 *....
 *....
 *upto Test100 
 * */
class Test100 implements A{

	@Override
	public void m1() {System.out.println("Test 100 M1 method");}

	@Override
	public void m2() {System.out.println("Test 100 M2 method");}
	
	//No need to override m3() method it is optional
	
}
public class DefaultFunction {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.m1();
		t1.m2();
		t1.m3();
		
		Test100 t100 = new Test100();
		t100.m1();
		t100.m2();
		
	}

}
