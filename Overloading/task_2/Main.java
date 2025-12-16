package task_2;
import java.util.*;

public class Main {
    // Method to read input from user and separate the integers
    public static int calculate(int a, int b) {
        return a * b;
    }

    public static int calculate(int a, int b, int c) {
        return (a + b) * c;
    }

    public static int processInputAndCallFunctions() {
        Scanner scn = new Scanner(System.in);
        String inputString = scn.nextLine();
        String[] strArr = inputString.split(" ");
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        // Call the appropriate function depending on the number of integers in the input
        if (intArr.length == 2) {
            // Call calculate(int, int)
            return calculate(intArr[0], intArr[1]);
        } else if (intArr.length == 3) {
            // Call calculate(int, int, int)
            return calculate(intArr[0], intArr[1], intArr[2]);
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(processInputAndCallFunctions());
    }
}