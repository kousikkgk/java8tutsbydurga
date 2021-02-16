package com.kousik.java8.functionalinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		/*if (o1>02)
			return 1;
		else if(o1<o2)
			return -1;
		else
			return 0;*/
		return (o1>o2)?1:(o1<o2)?-1:0;
	}
	
}
public class LambdaExpressionWithCollections {

	public static void main(String[] args) {
		
		ArrayList<Integer> aList = new ArrayList<>();
		
		aList.add(22);
		aList.add(32);
		aList.add(12);
		aList.add(42);
		aList.add(2);
		aList.add(52);
		
		System.out.println(aList);
		Collections.sort(aList,new MyComparator());
		System.out.println(aList);
	}

}
