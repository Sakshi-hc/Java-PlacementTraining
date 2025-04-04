
package program9;


public class Program9 {
    static void disp()
    {
        System.out.println("Executing Disp()....");
    }
    static void run()
    {
     disp();
     System.out.println("Executing Run()....");
    }

    public static void main(String[] args) {
        System.out.println("Program starts");
        run();
        System.out.println("program ends");
        
    }
    
}
