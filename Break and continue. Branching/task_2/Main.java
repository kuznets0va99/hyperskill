package task_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take the integer 'n' as input from user
        int n = sc.nextInt();
        System.out.print(2);
        // Loop from 1 to 'n' to print the numbers
        for(int i = 4; i <= n; i+=2) {
            // Include condition to check if 'i' is even
            // If 'i' is 10, skip this number and the next five numbers
            if (i == 10 && n > 16) {
                i = 16;
                System.out.print(" " + i);
                continue;
            } else if (i == 10) {
                continue;
            }
            else{
                System.out.print(" " + i);
            }
        }

        sc.close();
    }
}