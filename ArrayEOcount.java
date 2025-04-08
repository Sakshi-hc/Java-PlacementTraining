
package com.arrays.smvitm;

public class ArrayEOcount {
    public static void main(String[] args){
        int[] a={21,22,23,24,25};
        int evencount=0;
        int oddcount=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0){
                evencount++;
            }
            else
            {
                oddcount++;
            }
        }
            System.out.println("Even Count"+evencount);
            System.out.println("Odd Count"+oddcount);
            
        }
    }

