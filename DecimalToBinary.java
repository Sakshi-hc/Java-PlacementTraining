/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbersproblems;


import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        String binary = "";

        int num = decimal;
        while (num > 0) {
            binary = (num % 2) + binary;
            num /= 2;
        }

        System.out.println("Binary of " + decimal + " is: " + binary);
    }
}

