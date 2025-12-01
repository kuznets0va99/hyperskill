import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");
        int k = 0;
        int o = 0;
        for (int i = 0; i < words.length; i++){
            if (words[i].length() > k) {
                k = words[i].length();
                o = i;
            }
        }
        System.out.println(words[o]);
    }
}