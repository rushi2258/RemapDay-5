package com.bridgelabz.assignment;

import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args) {
        int year;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Year");
        year = in.nextInt();
        if (year < 1000 || year > 9999) {
            System.out.println("Year should be a four-digit number.");
            return;
        }

        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
