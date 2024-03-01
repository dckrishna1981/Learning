package com.sampleprograms;

public class ClassNObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		System.out.println("Static->"+A.a);
		System.out.println("NON Static->"+a.a);
		A.a=A.a+1;
		System.out.println("Static->"+A.a);
		System.out.println("NON Static->"+a.a);
	}

}

class A
{
	static int a=1;
	static float b=2;
}
