package com.logicalprograms;

import java.util.Scanner;

public class LogicalPrograms {
    /*
     * Method for check the prime number
     * @param args
     */
    public static void main(String[] args) {
        /*
         * 1) Get user input and initialize  variable
         * 2) Taking a for loop and getting the factor of entered number
         * 3) checking the factors and counting the factors
         * 4) condition for checking prime number or not
         */

        // 1) Get user input and initialize  variable
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int count = 0;
        // 2) Taking a for loop and getting the factor of entered number
        for (int i = 2; i <= n; i++){
            // 3) checking the factors and counting the factors
            if(n % i == 0){
                count++;
            }
        }
        // 4) condition for checking prime number or not
        if(count >= 2){
            System.out.println(n + " is a prime number");
        }else {
            System.out.println(n + " is not a prime number");
        }
    }
}
