package Recursion;

public class RecursionTest {

    public static void main(String[] args) {
        // Create an instance of Recursion to access its methods
        Recursion recursion = new Recursion();

        // Sum of integers from 1 to n
        int number = 5;
        int sumResult = recursion.recursiveSum(number);
        System.out.println("\n------------- Recursion Examples -------------");
        System.out.println("\nThe sum of integers from 1 to " + number + " is: " + sumResult);

        // Decimal to binary conversion
        int decimalNumber = 13;
        String binaryResult = recursion.decimalToBinary(decimalNumber);
        System.out.println("\nThe binary representation of " + decimalNumber + " is: " + binaryResult);
        System.out.println("\n----------------------------------------------");
    }
}
