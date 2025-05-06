
package Mobile;

abstract class Android
{
    void call(){
    System.out.println("calling to GF");
    
}
void text()
{
System.out.println("Texting with BF");
}
abstract void os();
}
class OnePlus extends Android
{
    @Override
    void os(){
        System.out.println("Oxygen OS");
    }
}
class Redmi extends Android
{
    @Override
    void os(){
        System.out.println("MIUI OS");
    }
}

public class Mobile {
    public static void main(String[] args)
    {
        OnePlus op=new OnePlus();
        op.call();
        op.text();
        op.os();
        Redmi r=new Redmi();
        r.call();
        r.text();
        r.os();
    }
}
