package task_4;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        double c = Double.parseDouble(s.replace(',', '.'));
        double F = c * 1.8 + 32;
        System.out.println(F);
        scanner.close();
    }
}