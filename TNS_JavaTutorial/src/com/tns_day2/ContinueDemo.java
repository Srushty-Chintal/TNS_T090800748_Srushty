package com.tns_day2;

public class ContinueDemo {
			public static void main(String[] args) {
			
			for(int i=5; i<15; i++)
			{
				// odd numbers are skipped
				if(i%2 != 0)
				{
					continue;
				}
				// even numbers are printed
				System.out.println(i+ " ");
			}

		}

	}


