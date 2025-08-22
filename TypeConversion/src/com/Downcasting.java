package com;

public class Downcasting {
	public static void main(String[]  args) {
		Mom m=new Daughter(); //up-casting
		System.out.println(m.name);

		Daughter d=(Daughter)m;
		System.out.println(d.age+" "+d.name);
		}
}
