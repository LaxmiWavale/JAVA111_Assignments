package com.question1;

import java.util.Scanner;

public class Student {

	private int roll;
	private String name;
	private int marks;
	private char grade;
	
	
	
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	private char calculateGrade(int marks){
		
		if(marks>=500) {
			return 'A';
		}
		else if(marks<500 && marks>=400) {
			return 'B';
		}
		else if(marks<400) {
			return 'C';
		}
		
		return 'D';
		
	}
	
	public void displayDetails() {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter student Name: ");
		String name= scan.next();
		setName(name);
		
		System.out.println("Enter student roll Number: ");
		int roll= scan.nextInt();
		setRoll(roll);
		
		System.out.println("Enter student Marks: ");
		int marks= scan.nextInt();
		setMarks(marks);
		
		char grade=calculateGrade(marks);
		setGrade(grade);
		
		System.out.println(toString());
		
	}

	

	@Override
	public String toString() {
		return "Student name= " + name +"\n"+ "Student roll= " + roll +"\n"+ "Student marks= " + marks +"\n"+ "Student grade= " + grade;
	}
	
	
	
}
