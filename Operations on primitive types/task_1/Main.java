package task_1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt() % 2;
        System.out.println(input);
        input *= 3;
        System.out.println(input);
        scanner.close();
    }
}