package task_2;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        scanner.nextLine();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (int i = 0; i != n; i++){
            String inp = scanner.nextLine();
            if ("A".equals(inp)) a++;
            else if ("B".equals(inp)) b++;
            else if ("C".equals(inp)) c++;
            else if ("D".equals(inp)) d++;
        }
        System.out.printf("%d %d %d %d", d, c, b, a);
    }
}