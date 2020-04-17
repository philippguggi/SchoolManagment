package com.PhilippGuggi.SchoolManagement;

public class Student {
	private int id;
	private String name;
	private double grade;
	private int	feesPaid;
	private int feesTotal;
	
	public Student(int id, String name, double grade) {
		this.feesPaid = 0;
		this.feesTotal = 30000;
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	
	public void payFees(int fees) {
		feesPaid += fees;
		// School.updateTotalMoneySpent(feesPaid);
	}
	
	public void setGrade(double grade) {
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
	
	public int getFeesPaid() {
		return feesPaid;
	}
	
	public int getFeesTotal() {
		return feesTotal;
	}
	
	public int getRemainingFees() {
		return feesTotal - feesPaid;
	}
	
	@Override
	public String toString() {
		return "Student's name: " + name +
				 "\nTotal fees paid so far €" + feesPaid;
	}
}
