package com;

public class Student {
int id;
String name;
Student(int x,String n){        //constructor Student(int id,String name)
	id=x;                       //this.id=id;
	name=n;                     //this.name=name;
}
public static void main(String[] args) {
	Student s1=new Student(22,"siva");
	Student s2=new Student(23,"uma");
	
	Student[] s=new Student[2];
	s[0]=s1;
	s[1]=s2;
	
	for(int i=0;i<s.length;i++) {
		System.out.println(s[i].id+" "+s[i].name);
	}
}
}
