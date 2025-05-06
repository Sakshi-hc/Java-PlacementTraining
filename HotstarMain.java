
package Mobile;

abstract class Hotstar
{
    void login()
    {
        System.out.println("Login Successful");
    }
    abstract void watch();
}
class HotstarFree extends Hotstar
{
    @Override
    void watch()
    {
        System.out.println("Watch with ads");
    }
}
class HotstarPremium extends Hotstar
{
    @Override
    void watch()
    {
        System.out.println("Watch without ads");
    }
}


public class HotstarMain {

   
    public static void main(String[] args) {
        HotstarFree hf =new HotstarFree();
        hf.login();
        hf.watch();
        HotstarPremium hp=new HotstarPremium();
        hp.login();
        hp.watch();   
    }
    
}
