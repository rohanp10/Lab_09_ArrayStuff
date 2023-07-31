import java.util.Scanner;
import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        int[] dataPoints = new int[100];

        Scanner in = new Scanner(System.in);

        Random rnd = new Random();


        // Part 1


         for (int i = 0; i < dataPoints.length; i++) {

            int val = rnd.nextInt(100) + 1;
            dataPoints[i] = val;
        }


        /*

        for (int i = 0; i < dataPoints.length; i++) {

            System.out.print(dataPoints[i] + " | ");
        }

         */

        /*

        int sum = 0;

        for (int i = 0; i < dataPoints.length; i++) {

            sum = sum + dataPoints[i];
        }

        System.out.println("\nInline Test: The sum of the random array dataPoints is: " + sum);
        System.out.println("Method Test: The sum of the random array dataPoints is: " + sum(dataPoints));


        double average = (double) sum / dataPoints.length;

        System.out.println("The average of the random array dataPoints is: " + average);

         */




        // Part 2

        /*

        int userValue = SafeInput.getRangedInt(in, "Enter an integer value", 1, 100);
        int counter = 0;

        for (int i = 0; i < dataPoints.length; i++) {

            if (dataPoints[i] == userValue) {
                counter += 1;
            }
        }

        System.out.println("\nInline Test: Your value of " + userValue + " was found " + counter + " times within the dataPoints array");
        System.out.println("Method Test: Your value of " + userValue + " was found " + occuranceScan(dataPoints, userValue) + " times within the dataPoints array");

         */


        /*

        int userNumber = SafeInput.getRangedInt(in, "Enter an integer value", 1, 100);

        boolean foundValue = false;

        for (int i = 0; i < dataPoints.length; i++) {

            if (dataPoints[i] == userNumber) {

                foundValue = true;
                // System.out.println("\nThe value " + userNumber + " was found at array index " + i + " in dataPoints");
                break;
            }
        }

        System.out.println("");

        boolean foundNumber = contains(dataPoints, userNumber);

        if (foundValue)
        {
            System.out.println("Inline Test: The array contains the target of " + userNumber);
        }
        else
        {
            System.out.println("Inline Test: The array does not contain the target of " + userNumber);
        }

        if (foundNumber)
        {
            System.out.println("Method Test: The array contains the target of " + userNumber);
        }
        else
        {
            System.out.println("Method Test: The array does not contain the target of " + userNumber);
        }

         */

        /*

        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int i = 0; i < dataPoints.length; i++) {

            if (min > dataPoints[i]) {
                min = dataPoints[i];
            }
            if (max < dataPoints[i]) {
                max = dataPoints[i];
            }
        }



        System.out.println("\nInline Test: The minimum value in the dataPoints array is " + min);
        System.out.println("Method Test: The minimum value in the dataPoints array is " + min(dataPoints));

        System.out.println("\nInline Test: The maximum value in the dataPoints array is " + max);
        System.out.println("Method Test: The minimum value in the dataPoints array is " + max(dataPoints));

         */


        /*
        System.out.println("\nAverage of dataPoints is: " + getAverage(dataPoints));

         */


    }
    public static double getAverage(int values[])
    {

        int sum = 0;

        for (int i = 0; i < values.length; i++) {

            sum = sum + values[i];
        }

        double average = (double) sum / values.length;

        return average;
    }

    public static int min(int values[])
    {

        int minValue = values[0];

        for (int i = 0; i < values.length; i++) {

            if (minValue > values[i]) {
                minValue = values[i];
            }
        }

        return minValue;

    }

    public static int max(int values[])
    {

        int maxValue = values[0];

        for (int i = 0; i < values.length; i++) {

            if (maxValue < values[i]) {
                maxValue = values[i];
            }
        }

        return maxValue;

    }

    public static int occuranceScan(int values[], int target)
    {

        int counter = 0;

        for (int i = 0; i < values.length; i++) {

            if (values[i] == target) {
                counter += 1;
            }
        }

        return counter;

    }

    public static int sum(int values[])
    {

        int sum = 0;

        for (int i = 0; i < values.length; i++) {

            sum = sum + values[i];
        }

        return sum;

    }

    public static boolean contains(int values[], int target)
    {

        boolean foundValue = false;

        for (int i = 0; i < values.length; i++) {

            if (values[i] == target) {

                foundValue = true;
                break;
            }
        }

       return foundValue;

    }


}