package com.kousik.java8.functionalinterface;

interface Addition1{
	public void add(int a,int b);
}

/*class AdditionImpl implements Addition1{
	@Override
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	
}*/
public class FIExample1 {

	public static void main(String[] args) {
		/*AdditionImpl impl = new AdditionImpl();
		impl.add(10, 20);*/
		
		Addition1 add1 = (int a,int b)->System.out.println(a+b);
		add1.add(20,30);
		
		Addition1 add2 = (a,b)->System.out.println(a+b);
		add2.add(30, 40);
	}

}
