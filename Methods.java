package com.smvitm;

public class Methods {
    static void run()
    {
        System.out.println("Executing run()");
    }
    static void mul(int a,int b,int c)
    {
        System.out.println(a*b*c);
        
    }
    static String name()
    {
        return "SMVITM";
    }
    static boolean res(int a)
    {
        if(a%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        run();
        mul(2,3,5);
        System.out.println(name());
        boolean ans=res(5);
        System.out.println(ans);
    }
}
