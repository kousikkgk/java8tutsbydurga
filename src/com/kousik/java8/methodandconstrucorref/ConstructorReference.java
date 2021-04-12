package com.kousik.java8.methodandconstrucorref;

interface A{
	public Sample get();
}

class Sample{
	Sample(){
		System.out.println("Sample class Constrctor");
	}
}

public class ConstructorReference {

	public static void main(String[] args) {
		A i = Sample::new;
		i.get();
	}

}
