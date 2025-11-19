package task_1;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int high = scanner.nextInt();
        int bridges = scanner.nextInt();
        boolean willCrash = false;

        for (int i = 1; i != bridges; i++) {
            int highBridge = scanner.nextInt();
            if (highBridge <= high) {
                System.out.println("Will crash on bridge" + " " + i);
                willCrash = true;
                break;
            }
        }
        if (!willCrash) {
            System.out.println("Will not crash");
        }
    }
}