
package com.arrays.smvitm;

public class ElementsOccurence {
  public static void main(String[] args){
      int[] arr={21,22,23,24,25};
      int ele=23;
      int count=0;
      for(int num:arr){
          if(num==ele){
              count++;
              
          }
      }
      System.out.println("The element"+ele+"appears"+count+"time in the array");
  }  
}
