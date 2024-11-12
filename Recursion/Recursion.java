package Recursion;

public class Recursion {

    // Find the sum of all integers from 1 to n using recursion
    public int recursiveSum(int n) {
        // If n is 1, return 1
        if (n == 1) {
            return 1;
        } else {
            // Add n to the result of recursiveSum(n-1)
            return n + recursiveSum(n - 1);
        }
    }

    // Convert a decimal number to binary using recursion
    public String decimalToBinary(int n) {
        // If n is 0 or 1, return it as a string
        if (n <= 1) {
            return Integer.toString(n);
        } else {
            // Divide n by 2, and call decimalToBinary on the quotient
            return decimalToBinary(n / 2) + Integer.toString(n % 2);
        }
    }
}
