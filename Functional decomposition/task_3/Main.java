package task_3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(f(num));
        scanner.close();
    }

    public static String f(int x) {
        if ((x % 3 == 0) && (x % 5 == 0)){
            return isDivByThreeAndFive();
        } else if (x % 3 == 0) {
            return isDivByThree();
        } else if (x % 5 == 0){
            return isDivByFive();
        }
        else {
            return "None";
        }
    }

    public static String isDivByThreeAndFive() {
        return "FizzBuzz";
    }

    public static String isDivByThree() {
        return "Fizz";
    }

    public static String isDivByFive() {
        return "Buzz";
    }
}