import java.util.Scanner;

public class Main {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); 
        int square = n * n;
        int cube = (int) Math.pow(n, 3);
        int fourth = (int) Math.pow(n, 4);

        System.out.println(square);
        System.out.println(cube);
        System.out.println(fourth);
        in.close();
    }
}
