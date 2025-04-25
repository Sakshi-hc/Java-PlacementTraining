
package javahw;

public class PrimeInRange {
    public static boolean isPrimeNumber(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println("Prime Numbers between 1 and 100 are:");
        for(int i=0;i<=100;i++){
            if(isPrimeNumber(i)){
                System.out.print(i+" ");
            }
        }
    }
}
