package task_3;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int [] arr = new int[size];
        boolean flag = true;

        for (int i = 0; i < size; i++){
            arr[i] = input.nextInt();
        }
        int n = input.nextInt();
        int m = input.nextInt();

        for (int i = 0; i < size - 1; i++){
            if ((arr[i] == n && arr[i+1] == m) || (arr[i] == m && arr[i+1] == n)) {
                flag = false;
            }
        }
        System.out.println(flag);
    }
}