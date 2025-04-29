
package Polymorphism;

//OVERRIDING
class instagram1{
    void post(){
        System.out.println("Photos can be posted");
    }
}
class instagram2 extends instagram1{
    @Override
    void post(){
        super.post();
        System.out.println("Photos and videos can be posted");
    }
}
class instagram3 extends instagram2{
    @Override
    void post(){
        super.post();
        System.out.println("Photos,videos  and Reels can be posted");
    }
}

public class InstagramMain {
public static void main(String[] args) {
instagram3 in = new instagram3();
 in.post();
}
}
