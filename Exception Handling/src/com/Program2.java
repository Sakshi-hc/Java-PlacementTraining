package com;

public class Program2 {
	public static void main(String[] args) {
		System.out.println("Program Starts");
		
		int arr[]= {1,2,3,4,5};
		try {
			System.out.println(arr[9]);
			}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid index accessed!");
		}
		System.out.println("Program Ends");
		}
}
