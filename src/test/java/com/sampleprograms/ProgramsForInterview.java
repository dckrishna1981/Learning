package com.sampleprograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Random;

public class ProgramsForInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,90,10,30,90,90,30,11};
		fFindVowelsInString("maharnima");
	}
	public static void fFindVowelsInString(String str)
	{
		String sLetter="";
		for(int i=0;i<str.length();i++)
		{
			sLetter=str.substring(i, i+1).toString();
			if(sLetter.equalsIgnoreCase("a")||sLetter.equalsIgnoreCase("e")||sLetter.equalsIgnoreCase("i")||sLetter.equalsIgnoreCase("o")||sLetter.equalsIgnoreCase("u"))
				System.out.println(sLetter + " is vowel");
			else
				System.out.println(sLetter + " is consonent");
		}
				
	}
	
	public static void fSortArray(int[] arr)
	{
		int temp=0;
		for(int i=0;i<arr.length-1;i++)
			for(int j=i+1;j<arr.length;j++)			
				if(arr[i]>=arr[j])
				{
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
		for(int i:arr)
		System.out.println(i);
			
	}
	
	public static void fReverseString(String str)
	{
		String sReverse="";
		for(int i=str.length()-1;i>=0;i--)
			sReverse = sReverse + str.charAt(i);
		
		System.out.println(sReverse);
			
	}
	
	public static void fCountOccurancesInArray(int[] arr)
	{
		LinkedHashMap<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
		int iCounter=0;
		for(int i:arr)
		{
			if(map.containsKey(i))
			{				
				iCounter = map.get(i);
				map.put(i, iCounter+1);
			}
			else
				map.put(i, 1);					
		}
		
		System.out.println(map);
		for(int i:map.keySet())
			if(map.get(i)==1)
				System.out.println(i + "->" + map.get(i));
	}
	
	public static void fRemoveDupsMaps(int[] arr)
	{
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		for(int i:arr)
		map.put(i, i);
		
		int[] arr1=new int[map.size()];
		int index=0;
		
		System.out.println(map);
		for(int i:map.values())
			arr1[index++]=i;
		
		for(int i:arr1)
			System.out.println(i);
	}
	
	public static void fRemoveDups(int[] arr)
	{
		HashSet<Integer> lhs=new HashSet<Integer>();
		for(int i:arr)
			lhs.add(i);
		
		int[] arr1=new int[lhs.size()];
		int index=0;
		for(int i:lhs)
			arr1[index++]=i;
		
		System.out.println(lhs);		
		
		for(int i:arr1)		
		System.out.println(i);
	}
	
	public static void fGCD(int i, int j)
	{
		int a;
		a=j%i;
		while(a!=0)
		{		
			j=i;
			i=a;
			a=j%i;
		}
		System.out.println(i);
		
	}
	
	public static void fPiramidDescending(int n)
	{
		for(int i=n;i>=1;i--)
		{
			//System.out.print("* ");
			for(int j=1;j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}
	}
	
	public static void fPiramidAscending(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}
	}
	public static void fRandomNumber()
	{
		Random r=new Random();
		System.out.println(r.nextInt(100));
	}
	public static void fFactorial(int n)
	{
		int product=1;
		for(int i=1;i<=n;i++)
			product=product*i;
		
		System.out.println("Factorial of " + n + " is " + product);
	}
	public static void fPalindrome(int n)
	{
		int i,rev=0,temp=n;
		while(n!=0)
		{
			i=n%10;
			rev=(rev*10)+i;
			n=n/10;
		}
		if(temp==rev)
			System.out.println(temp + " is Palindrom");
		else
			System.out.println(temp + " is NOT Palindrom");
	}
	public static void fPrime(int n)
	{
		if((n!=1)&&(n!=2))
		{
		
			boolean isPrime=true;
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime)
				System.out.println(n + " is Prime");
			else
				System.out.println(n + " is Complex");
		}
		else
			System.out.println(n + " is neither prime nor complex");
	}
	public static void fFabonacci(int n)
	{
		int first=0,next=1,third;
		
		System.out.println(first);
		System.out.println(next);
		for(int i=3;i<=n;i++)
		{
			
			third=first+next;
			System.out.println(third);
			first=next;
			next=third;
		}
		
	}
}
