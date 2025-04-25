
package javahw;
import java.util.Scanner;
public class ArmStrongnum {
     public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:"); 
        int num=sc.nextInt();
        int originalNumber=num;
        int result=0;
        int n=0;
        int temp=num;
        while(temp!=0){
            temp/=10;
            n++;
        }
        temp=num;
        while(temp!=0){
            int digit=temp%10;
            result+=Math.pow(digit, n);
            temp/=10;
            
        }
        if(result==originalNumber)
            System.out.println(originalNumber+"is an Armstrong number.");
        else
            System.out.println(originalNumber+"is not an Armstrong number.");
            sc.close();
    }
}
//output
//153.. is an Armstrong number
//145.. is not an Armstrong number