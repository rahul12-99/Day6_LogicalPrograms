package com.logicalprograms;

import java.time.LocalTime;
import java.util.Scanner;

public class LogicalPrograms {
    /**
     * Main method is for simulate stopwatch program
     * @param args
     */

    public static void main(String[] args) {
        /*
         * 1) initialize the variable and taking user input for start the current time
         * 2) printing the start time of stopwatch
         * 3) taking user input for end the current time
         * 4) printing the ending time of stopwatch
         * 5) printing the stopwatch time duration
         */
        /*
         1) initialize the variable and taking user input for start the current time
         */
        long start, end;
        double stopWatchTime;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter s to start");
        char s = sc.next().charAt(0);
        start = System.currentTimeMillis();

        /*
         2) printing the start time of stopwatch
         */
        LocalTime starts = LocalTime.now();
        System.out.println("Start Time : " + starts);

        /*
         3) taking user input for end the current time
         */
        System.out.println("Please enter p to stop");
        char p = sc.next().charAt(0);
        end = System.currentTimeMillis();

        /*
         4) printing the ending time of stopwatch
         */
        LocalTime ends = LocalTime.now();
        System.out.println("Stop Time : " + ends);

        /*
         5) printing the stopwatch time duration
         */
        stopWatchTime = (end - start) / 1000.0;
        System.out.println("Duration is : " + stopWatchTime);
    }
}
