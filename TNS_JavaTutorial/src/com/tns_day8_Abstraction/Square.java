package com.tns_day8_Abstraction;

public class Square extends Shape {
	
		private float side;
		
		public Square() {
		    side=2.0f;
		}

		public Square(float side) {
			super();
			this.side = side;
		}

		@Override
		void calArea() {
			area= side*side;
			
		}

	}


