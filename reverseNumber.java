//To Print Number In Reverse
package com.logicalProgram;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        int reverse = 0;

        for(;number!=0;){
            int reminder = number%10;
            reverse = reverse*10 +reminder;
            number = number/10;
        }
        System.out.println("The reverse of the given number is " + reverse);
    }
}
