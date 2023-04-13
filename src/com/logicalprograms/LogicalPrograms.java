package com.logicalprograms;

import java.util.Scanner;

public class LogicalPrograms {
    /*
     * Method for printing the fibonacci series .
     * @param args
     */
    public static void main(String[] args) {

        /*
         * 1) Taking user input for n term for fibonacci series
         * 2) Initializing the variable n1,n2,n3
         * 3) taking for loop for n terms and printing the terms
         * 4) Initializing the value in variable n1,n2,n3
         */

        // 1) Taking user input for n term for fibonacci series
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the term for fibonacci series");
        int nTerm = scanner.nextInt();
        // 2) Initializing the variable n1,n2,n3
        int n1 = 0;
        int n2 = 1;
        int n3;
        // 3) taking for loop for n terms and printing the terms
        for (int i = 1; i <= nTerm; i++){
            System.out.print(n1 +" ");
            // 4) Initializing the value in variable n1,n2,n3
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
}
