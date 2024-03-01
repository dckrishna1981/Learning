package com.sampleprograms;

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		India india=new India();
		US us=new US();
		india.verifyByCountryID();
		india.verify();
		us.verifyByCountryID();
		us.verify();
		
	}
}

abstract class VerificationProcess
{
	abstract void verifyByCountryID();
	void verify()
	{
		System.out.println("specific to country");
	}
}



class US extends VerificationProcess
{

	@Override
	void verifyByCountryID() {
		// TODO Auto-generated method stub
		System.out.println("Verification process by SSN");
	}	
	
	void verify()
	{
		System.out.println("this is specific to US");
	}
}

class India extends VerificationProcess
{

	@Override
	void verifyByCountryID() {
		// TODO Auto-generated method stub
		System.out.println("Verification process by AADHAR");
		
	}
	
	void verify()
	{
		System.out.println("this is specific to INDIA");
	}
}
