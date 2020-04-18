package com.PhilippGuggi.SchoolManagement;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Teacher mike = new Teacher(1, "Mike", 2400);
		Teacher jack = new Teacher(2, "Jack", 2750);
		Teacher john = new Teacher(3, "John", 2500);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(mike);
		teacherList.add(jack);
		teacherList.add(john);
		
		
		Student bob = new Student(1, "Bob", 10);
		Student sam = new Student(2, "Sam", 9);
		Student phil = new Student(3, "Phil", 12);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(bob);
		studentList.add(sam);
		studentList.add(phil);
		
		School ghs = new School(teacherList, studentList);
		
		bob.payFees(3750);
		sam.payFees(2500);
		phil.payFees(3500);
		
		System.out.println("GHS has earned: " + ghs.getTotalMoneyEarned() + " €.");
		System.out.println();
		System.out.println("----- Salary ----");
		
		mike.receiveSalary(mike.getSalary());
		System.out.println("GHS has spent " + mike.getSalary() + " € to " + mike.getName() + " "
								 + "and now has a balance of " + ghs.getBalance() + " €.");
		
		john.receiveSalary(john.getSalary());
		System.out.println("GHS has spent " + john.getSalary() + " € to " + john.getName() + " "
				 + "and now has a balance of " + ghs.getBalance() + " €.");
		
		System.out.println("GHS has spent " + mike.getSalary() + " € to " + mike.getName() + " "
				 + "and now has a balance of " + ghs.getBalance() + " €.");
		System.out.println();
		System.out.println(phil);
		System.out.println();
		System.out.println(mike);
	}
}
