package com.kousik.java8.predefinedFI;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Student {
	String name;
	int mark;
	String stipend;
	
	public Student(String name, int mark, String stipend) {
		super();
		this.name = name;
		this.mark = mark;
		this.stipend = stipend;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", mark=" + mark + ", stipend=" + stipend + "]";
	}

}

public class FunctionExample {
	public static void main(String[] args) {

		//Provide Grade to the Students
		Function<Student, String> grade = g -> {
			int marks = g.mark;
			String stu_grade;

			if (marks >= 80)
				stu_grade = "A[Distinction]";
			else if (marks >= 60)
				stu_grade = "B[First Class]";
			else if (marks >= 50)
				stu_grade = "C[Second Class]";
			else if (marks >= 40)
				stu_grade = "D[Third class]";
			else
				stu_grade = "E[Failed]";
			return stu_grade;
		};
		
		//Give stipend to topper student
		Function<Student,String> stipend = funStipend ->{
			String funSti ="";
			funSti="1000";
			return funSti;
		};
		
		//Check the Students mark is GTE 60
		Predicate<Student> stuSixtyPredicate = s -> s.mark > 60;

		ArrayList<Student> stuList = new ArrayList<>();
		stuList.add(new Student("KK", 70,"0.0"));
		stuList.add(new Student("DJ", 50,"0.0"));
		stuList.add(new Student("SJ", 40,"0.0"));
		stuList.add(new Student("AJ", 20,"0.0"));

		for (Student s1 : stuList) {
			System.out.println("Name:" + s1.name + " | " + "Marks:" + s1.mark + " | " + "Grade:" + grade.apply(s1));
			if (stuSixtyPredicate.test(s1)) {
				System.out.println("****Toppers*****");
				System.out.println("Name:" + s1.name + " | " + "Marks:" + s1.mark + " | " + "Grade:" + grade.apply(s1)+ " | "+"Stipend:"+stipend.apply(s1));
			}
		}
		
		/*Function Chaining*/
		Function<Integer,Integer> f1 = i->2*i;
		Function<Integer,Integer> f2 = i->i*i*i;
		
		System.out.println("----------------------");
		System.out.println(f1.andThen(f2).apply(2));
		System.out.println(f1.compose(f2).apply(2));
		System.out.println(f1.andThen(f2).andThen(f1).apply(2));
	}
}
