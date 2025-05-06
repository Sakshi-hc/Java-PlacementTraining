
package pkginterface;


public class Uma implements Person
{

    @Override
    public void eat()
    {
        System.out.println("Uma loves to eat sweet");
    }
    public static void main(String[] args) {
        Uma u=new Uma();
        System.out.println(u.age);
        u.eat();
       
    }
    
}
