package com.sampleprograms;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA ca=new ClassA();
		ClassB cb=new ClassB();
		cb.methodBb();
	}

}

class ClassA
{
	public void methodAa()
	{
		System.out.println("A->a");
	}
	
	public void methodAb()
	{
		System.out.println("A->b");
	}
	
	public void common()
	{
		System.out.println("from ClassA");
	}
}

class ClassB extends ClassA
{
	public void methodBa()
	{
		System.out.println("B->a");
		methodAa();
	}
	
	public void methodBb()
	{
		System.out.println("B->b");
		super.common();
		this.common();
	}
	
	public void common()
	{
		System.out.println("from ClassB");
	}
}