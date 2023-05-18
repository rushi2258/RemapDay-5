package com.bridgelabz.assignment;

public class HarmonicNumber
{
    public static void main(String[] args) {
        int N = 5;

        if (N <= 0) {
            System.out.println("N should be a positive integer.");
            return;
        }

        double harmonicNumber = 0;

        for (int i = 1; i <= N; i++) {
            harmonicNumber += 1.0 / i;
        }

        System.out.println("The " + N + "th harmonic number is: " + harmonicNumber);
    }
}
