
package javahw;
import java.util.Scanner;
public class PerfectNum {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number:"); 
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num/2;i++)
        {
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num&&num!=0)
        {
            System.out.println(num+"is a perfect number.");
        }
        else{
            System.out.println(num+"is not a perfect number.");
        }
        sc.close();
}
}

//output
    //6,28.. is a perfect number
//16.. is not a perfect number
