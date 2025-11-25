package task_4;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int [size];

        for (int i = 0; i < size; i++){
            arr[i] = input.nextInt();
        }

        int num = 0;

        for (int i = 0; i < (size - 1); i++){
            if (arr[i] * arr[i+1] > num){
                num = arr[i] * arr[i + 1];
            }
        }

        System.out.println(num);
    }
}