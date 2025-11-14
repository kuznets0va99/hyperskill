package task_1;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var a = scanner.nextDouble();
        int b = scanner.nextInt();
        System.out.println(b - a);
        scanner.close();
    }
}