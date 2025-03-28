package com.smvitm;

public class Method3 {
    static int disp()
    {
        return 45;
    }
    static char print()
    {
        return 'a';
    }
    public static void main(String[] args)
    {
        System.out.println("Program Starts");
        int res=disp();
        System.out.println(res);
        System.out.println(print());
        System.out.println("Program Ends");
    }
}
