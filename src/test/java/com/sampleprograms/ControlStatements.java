package com.sampleprograms;

public class ControlStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fContinue();
	}
	
	public static void fContinue()
	{
		int a=1;
		for(a=1;a<=10;a++)
			if(a==6)
				continue;
			else
				System.out.println(a);
	}
	
	public static void fBreak()
	{
		int a=1;
		for(a=1;a<=10;a++)
			if(a==6)
				break;
			else
				System.out.println(a);
	}
	
	public static void fDoWhile()
	{
		int a=1;
		do 
		{
			System.out.println(a);
			a++;
		}while(a<=10);
	}
	
	public static void fSwitch()
	{
		int a=10;
		boolean bln=false;
		if(a%2==0)
			bln=true;
		
		switch(a)
		{
		case(1):System.out.println("10");break;
		case(2):System.out.println("5");break;
		default:System.out.println("NA");
		}
	}
	
	public static void fWhile()
	{
		int a=1;
		while(a<=10)
		{
			System.out.println(a);
			a++;
		}
	}
	
	public static void fFor()
	{
		int i=1;
		for(i=1;i<=10;i++)
			System.out.println(i);
		
		
	}
	
	public static void fForEach()
	{
		int arr[]= {1,3,5,6,3,2};
		for(int i:arr)
			System.out.println(i);
	}

}
