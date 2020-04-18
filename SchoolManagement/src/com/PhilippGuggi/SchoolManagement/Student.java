package com.PhilippGuggi.SchoolManagement;

public class Student {
	private int id;
	private String name;
	private int grade;
	private double	feesPaid;
	private double feesTotal;
	
	public Student(int id, String name, int grade) {
		this.feesPaid = 0;
		this.feesTotal = 2000; // fees per month
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
	public void payFees(int fees) {
		feesPaid += fees;
		School.updateTotalMoneyEarned(feesPaid);
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getGrade() {
		return grade;
	}
	
	public double getFeesPaid() {
		return feesPaid;
	}
	
	public double getFeesTotal() {
		return feesTotal;
	}
	
	public double getRemainingFees() {
		return feesTotal - feesPaid;
	}
	
	@Override
	public String toString() {
		return "Student's name: " + name +
				 "\nStudent's ID: " + id +
				 "\nTotal fees paid so far " + feesPaid + " €.";
	}
}
