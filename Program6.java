
package program6;


public class Program6 {

   
    public static void main(String[] args) {
        int x=5;
        char ch='a';
        for(int i=0;i<x;i++)
        {
         System.out.println(ch+" ");
         if(i<x/2)
         {
             ch++;
         }
         else
         {
             ch--;
         }
        }
    }
    
}
