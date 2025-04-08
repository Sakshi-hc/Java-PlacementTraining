
package com.arrays.smvitm;
//Find the Maximum element in an array
public class ArrayMAX {
     public static void main(String[] args){
         int[] n={1,7,3,5,4};
         int max=n[0];
         for(int i=0;i<n.length;i++){
             if(max<n[i]){
                 max=n[i];
             }
         }
System.out.println(max);
     }
}
