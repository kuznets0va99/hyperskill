import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        int factorial = 1;
        int loop = inputScanner.nextInt();
        for  (int i = 1; i <= loop; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}