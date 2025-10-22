package day1;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        sc.close();

        // Check for invalid input
        if (num < 0) {
            System.out.println("Please enter a non-negative number.");
            return;
        }

        // Check if the number is prime
        boolean isPrime = true;

        if (num < 2) {
            isPrime = false; // 0 and 1 are not prime
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) { // Optimization: loop till sqrt(num)
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Print whether the number is prime
        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("NOT PRIME");
        }
    }
}
