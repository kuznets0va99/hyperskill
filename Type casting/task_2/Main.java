package task_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(java.util.Locale.US);
        // Read the number as a double.
        // TODO: Write your code here to read a double from the console
        double x =  scanner.nextDouble();
        // Convert and print the number to an integer.
        System.out.println((int) x);
        // TODO: Write your code here to convert the double to an integer and print it out to the console

        scanner.close();
    }
}