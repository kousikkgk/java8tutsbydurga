package com.kousik.java8.functionalinterface;

import java.util.ArrayList;
import java.util.Collections;

class Employee{
	int empNo;
	String empName;
	double empSal;
	public Employee(int empNo, String empName, double empSal) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empSal = empSal;
	}
	
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
	
	
}
public class LambdaExpressionWithEmployeeClass {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(20, "Kousik",20000));
		empList.add(new Employee(30, "Daniel",15000));
		empList.add(new Employee(10, "Sharon",200000));
		
		System.out.println(empList);
		//Collections.sort(empList);
		
		//Sort based on Employee no
		Collections.sort(empList,(e1,e2)->(e1.empNo>e2.empNo)?1:(e1.empNo<e2.empNo)?-1:0);
		System.out.println(empList);
		
		//Sort based on Employee name alpabetical order
		Collections.sort(empList,(e1,e2)->e1.empName.compareTo(e2.empName));
		System.out.println(empList);
	
		//Get 2nd highest salary of the employee
		Collections.sort(empList,(e1,e2)->(e1.empSal>e2.empSal)?-1:(e1.empSal<e2.empSal)?1:0);
		System.out.println(empList);
		System.out.println(empList.get(1));
	}

}
