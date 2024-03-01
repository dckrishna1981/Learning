package com.sampleprograms;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo cd=new ConstructorDemo(12,100);
		ConstructorDemo cd1=new ConstructorDemo(1,2,3);
		
	}

}

class ConstructorDemo
{
	public ConstructorDemo(int a, int b)
	{
		System.out.println(a+b);
		
	}
	
	public ConstructorDemo(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
}
