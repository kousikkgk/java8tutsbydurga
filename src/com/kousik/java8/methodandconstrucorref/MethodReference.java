package com.kousik.java8.methodandconstrucorref;


public class MethodReference {
	public static void methodRef() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Child thread");
		}
	}
	public  void methodRef1() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Child thread");
		}
	}
	public static void main(String[] args) {
		Runnable r1 = MethodReference::methodRef;
		Runnable r = new MethodReference()::methodRef1;/*() -> {
			for (int i = 0; i <= 10; i++) {
				System.out.println("Child thread");
			}
		};*/

		Thread myThread = new Thread(r);
		myThread.start();
		for (int i = 0; i <= 10; i++) {
			System.out.println("Main thread");
		}
	}

}
