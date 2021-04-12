package com.kousik.java8.predefinedFI;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class StudentConsumer {
	String name;
	int mark;

	public StudentConsumer(String name, int mark) {
		super();
		this.name = name;
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "StudentConsumer [name=" + name + ", mark=" + mark + "]";
	}

}

public class ConsumerExample {

	public static void main(String[] args) {
		
		// Provide Grade to the Students
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

		// Give stipend to topper student
		Function<Student, String> stipend = funStipend -> {
			String funSti = "";
			funSti = "1000";
			return funSti;
		};

		// Check the Students mark is GTE 60
		Predicate<Student> stuSixtyPredicate = s -> s.mark > 60;

		ArrayList<Student> stuList = new ArrayList<>();
		stuList.add(new Student("KK", 70, "0.0"));
		stuList.add(new Student("DJ", 50, "0.0"));
		stuList.add(new Student("SJ", 40, "0.0"));
		stuList.add(new Student("AJ", 20, "0.0"));
		
		/*
		 * Consumer
		 * */
		Consumer<Student> c1 = s1->{
			System.out.println("Name:" + s1.name + " | " + "Marks:" + s1.mark + " | " + "Grade:" + grade.apply(s1)
			+ " | " + "Stipend:" + stipend.apply(s1));
		};
		
		Consumer<Student> c2 = s1->{
			System.out.println("Name:" + s1.name + " | " + "Marks:" + s1.mark + " | " + "Grade:" + grade.apply(s1));
		};
		
		for (Student s1 : stuList) {
				c2.accept(s1);
			if (stuSixtyPredicate.test(s1)) {
				System.out.println("****Toppers*****");
				c1.accept(s1);
			}
		}
	}
}
