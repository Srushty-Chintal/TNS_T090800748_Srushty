package com.tns_day6_StaticVariable;

public class Employee {
	
		
		private String name;
		private int id;
		
		//TNS common for all objects
		static String companyName = "TNS";
		
		Employee(String name, int id)
		{
			this.name=name;
			this.id=id;
			}

		@Override
		public String toString() {
			return "Employee [name=" + name + ", id=" + id + ", companyName = "+ companyName +"]";
		}

		
		
				

	}


