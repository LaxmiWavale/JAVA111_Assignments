package com.question2;

import java.util.Scanner;

public class Parent {
	
	final int number;
	
	Parent(int num){
		this.number = num;
	}
	void method1() {
		System.out.println("number---"+ number);
	}
	
	final void method2() {
		System.out.println("this method belongs to Parent class");
	}
	
	void method3() {
		System.out.println("this method belongs to Parent class");

	}
	
	void method4() {
		System.out.println("this method belongs to Parent class");

	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your number");
		final int num= scan.nextInt();
		
		if(num<=10 && num>=1) {
			
			Child c= new Child(num);
			c.method1();
			c.method2();
			
			Parent p= new Parent(num);
			p.method1();
			p.method2();
			p.method3();
			p.method4();
			
			
		
			
		}else {
			System.out.println("Invalid number");
		}
		
		
		
		
	}
	
	
}
