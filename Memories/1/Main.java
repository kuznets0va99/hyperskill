import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] dir = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        // Read the input character
            char inputChar = scanner.next().charAt(0);
            for (int i = 0; i < dir.length; i++){
                if (dir[i] == inputChar){
                    System.out.println(dir[(i + 1) % dir.length]);
                }
            }
    }
}