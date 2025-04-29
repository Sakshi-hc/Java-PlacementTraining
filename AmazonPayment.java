
package polymorphism;
class Amazon{
    void payment(){
        System.out.println("COD");
    }
    void payment(String name){
        System.out.println("UPI Payment");
    }
    void payment(long cardnumber,int otp){
        System.out.println("Card payment");
    }
    void payment(String username,String password){
        System.out.println("Net Banking");
    }
}
public class AmazonPayment{
    public static void main(String[] args){
        Amazon a=new Amazon();
        a.payment();
        a.payment("GPAY");
        a.payment(12345678965L,565640);
        a.payment("User123","password");
        
    }
}
