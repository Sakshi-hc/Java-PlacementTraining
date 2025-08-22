package com;

public class Program3 {
	public static void main(String[] args) {
		String name="Dinga";
	try {
	System.out.println(name.charAt(9));
		}
	catch(StringIndexOutOfBoundsException e) {
			System.out.println("Invalid char accessed!");
		}
	}
}
