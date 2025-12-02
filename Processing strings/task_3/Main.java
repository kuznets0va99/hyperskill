package task_3;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] inp = scanner.next().toCharArray();
        int count = 1;
        for (int i = 1; i < inp.length; i++){
            if (inp[i] == inp[i-1]){
                count ++;
            }
            else{
                System.out.printf("%c%d", inp[i-1], count);
                count = 1;
            }
        }
        System.out.printf("%c%d%n", inp[inp.length - 1], count);
    }
}