package com.tns_day6_StaticBlockMethod;

public class MyClassDemo {
	
		public static void main(String[] args) {
			
			MyClass o1 = new MyClass();
			System.out.println(o1);
			
			MyClass.display(); // static method
			
			MyClass o2 = new MyClass();
			System.out.println(o2);
			MyClass.display();

		}

	}

