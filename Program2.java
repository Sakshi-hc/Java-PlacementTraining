package polymorphism;
class City{
    void place(int a){
        System.out.println("Banglore");
    }
    void place(int a,int b){
        System.out.println("Udupi");
    }
    void place(int a,int b,int c){
        System.out.println("Mysore");
    }
}
public class Program2 {
    public static void main(String[] args){
        City c=new City();
        c.place(10);
        c.place(10,20);
        c.place(10,20,30);
    }
}
