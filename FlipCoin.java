package com.bridgelabz.assignment;

import java.util.Random;

public class FlipCoin
{
    public static void main(String[] args) {
            int numFlips = 250;

            if (numFlips <= 0) {
                System.out.println("Number of flips should be a positive integer.");
                return;
            }

            int headsCount = 0;
            int tailsCount = 0;

            Random random = new Random();

            for (int i = 0; i < numFlips; i++) {
                if (random.nextDouble() < 0.5) {
                    headsCount++;
                } else {
                    tailsCount++;
                }
            }

            double headsPercentage = (double) headsCount / numFlips * 100;
            double tailsPercentage = (double) tailsCount / numFlips * 100;

            System.out.println("Percentage of Heads: " + headsPercentage);
            System.out.println("Percentage of Tails: " + tailsPercentage);
    }
}
