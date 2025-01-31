package com.tns_day8_NestedinterfaceDemo;


// outer interface
public interface MyInterface {
	
	void show();
	
	// inner interface
	public interface InnerInterface
	{
		int a = 20;
		void disp();
	}

}



