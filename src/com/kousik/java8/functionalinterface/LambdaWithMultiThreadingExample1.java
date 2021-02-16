package com.kousik.java8.functionalinterface;

class MyRunnable implements Runnable{

	@Override
	public void run() {
		
		for(int i=0;i<=10;i++) {
			try {
				Thread.sleep(3000);
				System.out.println("Child Thread");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
}
public class LambdaWithMultiThreadingExample1 {

	public static void main(String[] args) throws InterruptedException {
		MyRunnable r1 = new MyRunnable();
		Thread t1 = new Thread(r1);
		t1.start();
		
		for(int i=0;i<=10;i++) {
			Thread.sleep(3000);
			System.out.println("Main Thread");
		}
	}

}
