package com.logicalprograms;

import java.util.Scanner;

public class LogicalPrograms {
    /**
     * Main method is for reverse the number
     *
     * @param args
     */

    public static void main(String[] args) {
        /*
         * 1) Initialized the variable and taking user input
         * 2) Putting the condition and storing the reminder and printing
         */

        /*
         1) Initialized the variable and taking user input
         */
        int num, reminder;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want reverse");
        num = sc.nextInt();

        /*
         2) Putting the condition and storing the reminder and printing
         */
        System.out.println("After reverse the number");
        while (num > 0) {
            reminder = num % 10;
            System.out.print(reminder);
            num = num / 10;
        }
    }
}
