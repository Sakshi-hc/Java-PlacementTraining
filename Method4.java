//With Argument and With Return type
package com.smvitm;

public class Method4 {
    static int sq(int a)
    {
        return a*a;
    }
     static int cb(int b)
    {
        int ans=b*b*b;
        return ans;
    }
     public static void main(String[] args)
    {
        System.out.println("Program Starts");
        System.out.println(sq(2));
        System.out.println(cb(3));
        System.out.println("Program Ends");
    }
}

