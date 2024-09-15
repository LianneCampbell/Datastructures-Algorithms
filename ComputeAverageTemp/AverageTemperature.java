package ComputeAverageTemp;

import java.util.Scanner;

public class AverageTemperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("--------- Average Temperature Calculator ---------");
        System.out.println("");

        // 1. Take input from the user
        System.out.print("Enter the number of days you wish to calculate: ");

        int numDays = scanner.nextInt();

        // 2. Prompt to enter temperature
        double[] temperatures = new double[numDays];
        double sum = 0;

        System.out.println("");
        System.out.println("--------------------------------------------------");
        System.out.println("");

        for (int i = 0; i < numDays; i++) {

            System.out.print("Enter the recorded temperature for day " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
            sum += temperatures[i];
        }

        // 3. Calculate the average temperature
        double average = sum / numDays;
        System.out.println("");
        System.out.println("------------------- Solution ---------------------");
        System.out.println("");
        System.out.println("The average temperature: " + average);

        // 4. Count temperatures are above the average
        int countAboveAverage = 0;
        for (double temp : temperatures) {
            if (temp > average) {
                countAboveAverage++;
            }
        }

        System.out.println("");
        System.out.println("The number of days above average temperature: " + countAboveAverage);
        System.out.println("");
        System.out.println("--------------------------------------------------");
        scanner.close();
    }
}
