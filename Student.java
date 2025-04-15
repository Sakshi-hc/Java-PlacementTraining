
package oops;

public class Student {
int age=19;
String name="Sakshi";
void read()
{
    System.out.println("Read");
}
    public static void main(String[] args) {
        System.out.println("Program Start");
        Student s=new Student();
        System.out.println("My age is"+" "+s.age);
        System.out.println("My name is"+" " + s.name);
        s.read();
        System.out.println("Program End");
    }
    
}
