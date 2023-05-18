package com.bridgelabz.assignment;

public class PrimeFactors
{
        public static void main(String[] args) {
            int N = 72; // Change this value to set the number

            if (N <= 1) {
                System.out.println("N should be greater than 1.");
                return;
            }

            System.out.print("Prime factors of " + N + ": ");

            for (int i = 2; i * i <= N; i++) {
                while (N % i == 0) {
                    System.out.print(i + " ");
                    N /= i;
                }
            }

            if (N > 1) {
                System.out.print(N);
            }

            System.out.println();
        }
}
