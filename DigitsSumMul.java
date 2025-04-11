
package numberproblems;
public class DigitsSumMul{
    public static void main(String[] args){
        int n=12345;
        int rem=0;
        int sum=0;
        int mul=1;
        while(n>0)
        {
            rem=n%10;
            sum=sum+rem;
            mul=mul*rem;
            n=n/10;
        }
        System.out.println(sum);
        System.out.println(mul);
    }
}
