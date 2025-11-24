package task_2;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        int[] arr = new int[size];
        boolean flag = true;
        for (int i = 0; i < size; i++){
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                flag = false;
            }
        }
        System.out.println(flag);
    }
}