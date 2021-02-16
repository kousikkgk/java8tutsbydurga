package com.kousik.java8.predefinedFI;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {

	String empName;
	int salary;
	int age;

	public Employee(String empName, int salary, int age) {
		super();
		this.empName = empName;
		this.salary = salary;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", salary=" + salary + ", age=" + age + "]";
	}

}

public class PredicateExample {

	public static void main(String[] args) {

		// Check the num is GT 5
		Predicate<Integer> p1 = i -> i > 5;
		System.out.println(p1.test(6));

		// Check the input is even
		Predicate<Integer> p2 = i -> i % 2 == 0;
		System.out.println(p2.test(4));
		System.out.println(p2.test(5));

		ArrayList<Employee> eList = new ArrayList<>();
		eList.add(new Employee("Kousik", 10000, 29));
		eList.add(new Employee("KK", 12000, 22));
		eList.add(new Employee("DJ", 20000, 2));
		eList.add(new Employee("Daniel", 9000, 3));
		eList.add(new Employee("Sharon", 300000, 27));

		// Fetch employees whose salary is GTE 10K
		Predicate<Employee> empPredicate1 = s -> s.salary >= 10000;
		for (Employee emp1 : eList) {
			if (empPredicate1.test(emp1)) {
				System.out.println(emp1);
			}
		}

		System.out.println("-----------------------");

		// Fetch employees whose age is GTE 18
		Predicate<Employee> empPredicate2 = s -> s.age >= 18;
		for (Employee emp1 : eList) {
			if (empPredicate2.test(emp1)) {
				System.out.println(emp1);
			}
		}

		System.out.println("-----------------------");

		// Fetch employees whose name length is GTE 3
		Predicate<Employee> empPredicate3 = s -> s.empName.length() >= 3;
		for (Employee emp1 : eList) {
			if (empPredicate3.test(emp1)) {
				System.out.println(emp1);
			}
		}
		
		System.out.println("-----------------------");
		
		// Fetch employees whose name length is even
		Predicate<Employee> empPredicate4 = s -> s.empName.length() %2==0;
		for (Employee emp1 : eList) {
			if (empPredicate4.test(emp1)) {
				System.out.println(emp1);
			}
		}
		
		System.out.println("-----------------------");
		
		/*Predicate Joining*/
		for (Employee emp1 : eList) {
			if (empPredicate1.and(empPredicate2).test(emp1)) {
				System.out.println("Employee:(Sal GTE 10K and Age GTE 18) "+emp1);
			}
			if (empPredicate2.or(empPredicate4).test(emp1)) {
				System.out.println("Employee:(Age GTE 18 or Length of name is even) "+emp1);
			}
			if (empPredicate1.negate().test(emp1)) {
				System.out.println("Employee:(Sal opp of GTE 10K) "+emp1);
			}
		}

	}

}
