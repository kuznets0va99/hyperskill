package task_3;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int[][] arr = new int[a][b];

        for (int k = 0; k < a; k++){
            for (int o = 0; o < b; o++) {
                arr[k][o] = input.nextInt();
            }
        }

        int i = input.nextInt();
        int j = input.nextInt();

        for (int k = 0; k < a; k++){
            int col = arr[k][i];
            arr[k][i] = arr[k][j];
            arr[k][j] = col;
        }

        for (int k = 0; k < a; k++){
            for (int o = 0; o < b; o++) {
                System.out.print(arr[k][o] + " ");
            }
            System.out.println();
        }
    }
}