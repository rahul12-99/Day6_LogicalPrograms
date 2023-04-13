package com.logicalprograms;

import java.util.Scanner;

public class LogicalPrograms {
    /*
     * Method for check the number is perfect or not
     * @param args
     */
    public static void main(String[] args) {
        /*
         * 1) Taking user input and variables
         * 2) Taking for loop to get the factor of entered number
         * 3) check the factor and adding in the sum variable
         * 4) check if the sum of factor of entered number and entered number
         * is equal or not and printing
         */
        //  1) Taking user input and variables
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0;
        // 2) Taking for loop to get the factor of entered number
        for (int i = 1; i < n; i++) {
            // 3) check the factor and adding in the sum variable
            if(n % i ==0){
                sum = sum+i;
            }
        }
        // 4) check if the sum of factor of entered number and entered number
        //    is equal or not and printing
        if(sum == n){
            System.out.println(n + " is perfect number");
        }else {
            System.out.println(n + " is not a perfect number");
        }
    }
}
