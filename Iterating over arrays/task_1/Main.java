import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        int[] arr = new int[size];
        int sum = 0;

        for (int i = 0; i < size; i++){
            arr[i] = input.nextInt();
        }

        int n = input.nextInt();

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > n) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}