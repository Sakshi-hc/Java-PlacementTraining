
package Inheritance;
class Person{
    void human()
    {
        System.out.println("He is a Human");
    }
}
class Walk extends Person
{
    void disp()
    {
        System.out.println("Executing walk class");
    }
}
class Run extends Person
{
    void show()
    {
        System.out.println("Executing run class");
    }
}
public class HiericheralInheritance {
      public static void main(String[] args)
    {
       Walk w=new Walk();
        w.human();
        w.disp();
        Run r = new Run();
        r.human();
        r.show();
    }
}
