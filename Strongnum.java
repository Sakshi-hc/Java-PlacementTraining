
package javahw;
import java.util.Scanner;

public class Strongnum {
     public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:"); 
        int num=sc.nextInt();
        int originalNumber=num;
        int sum=0;
        while(num>0)
        {
            int digit=num%10;
            sum+=factorial(digit);
            num/=10;
        }
        if(sum==originalNumber)
        {
            System.out.println(originalNumber+"is a strong number.");
            
        }
        else
        {
            System.out.println(originalNumber+"is not a strong number.");
        }
    }
     public static int factorial(int num)
     {
         int fact=1;
         for(int i=1;i<=num;i++)
         {
             fact*=i;
         }
         return fact;
     }
}
//output
//145.. is a strong number
//247.. is not a strong number