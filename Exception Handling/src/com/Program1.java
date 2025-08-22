package com;

public class Program1 {
public static void main(String[] args) {
	System.out.println("Program Starts");
	int a=10;
	int b=0;
	try {
		System.out.println(a/b);
	}catch(ArithmeticException e)
	{
		System.out.println("Divide by 0 not possible");
	}
	System.out.println("Program Ends");
}
}
