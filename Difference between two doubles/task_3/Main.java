package task_3;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distance = scanner.nextDouble();
        double time = scanner.nextDouble();
        double averageSpeed = distance / time;
        System.out.println(averageSpeed);
        scanner.close();
    }
}