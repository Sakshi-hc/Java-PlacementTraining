
package numberproblems;

public class Reversedig {
    public static void main(String[] args){
        int n=12345;
        int r=0;
        while(n>0)
        {
            r=n%10;
            System.out.print(r);
            n=n/10;
        }
    }
}
