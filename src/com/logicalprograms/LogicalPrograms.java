package com.logicalprograms;

import java.util.Scanner;

public class LogicalPrograms {
    /**
     * This method is for return random coupon number;
     * @param number
     * @return
     */

    public static int CouponGenerator(int number){
        return (int) Math.floor(Math.random() * number)+ 1;
    }

    /**
     * Main method of the program
     * @param args
     */
    public static void main(String[] args) {
        /*
         * 1) Taking user input and initialized the variable
         * 2) Taking an array store the user input in array
         * 3) Store the random number by calling and add random number in array
         * 4) taking loop to be on same index until unique number
         * 5) taking for loop and storing the coupon number and printing
         */
        /*
          1) Taking user input and initialized the variable
         */
        int number,random;
        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly enter the total number of coupons to generate");
        number = sc.nextInt();
        /*
         2) Taking an array store the user input in array
         */
        int[] coupons = new int[number];
        /*
         3) Store the random number by calling and add random number in array
         */
        for (int i = 0; i < number; i++) {
            random = CouponGenerator(number);
            coupons[i] = random;
            /*
             4) taking loop to be on same index until unique number
             */
            for (int j = 0; j < i; j++) {
                if (coupons[i] == coupons[j]) {
                    i--;
                }
            }
        }
        /*
         5) taking for loop and storing the coupon number and printing
         */
        for (int i:coupons) {
            System.out.println(i);
        }
    }
}
