package com.kousik.java8.functionalinterface;

interface Addition{
	public void add();
}

/*class AdditionImpl implements Addition{

	@Override
	public void add() {
		System.out.println("Implementation for Addition interface....");
	}
	
}*/
public class FunctionalInterfaceExample {

	public static void main(String[] args) {
	/*	AdditionImpl addImpl = new AdditionImpl();
		addImpl.add();
		
		Addition add = new AdditionImpl();
		add.add();
	*/	
		Addition addLam =()->System.out.println("Lambda implementation for Addition Interface");
		addLam.add();
	}

}
