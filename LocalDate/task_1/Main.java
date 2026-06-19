import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LocalDate input = LocalDate.parse(scanner.nextLine());
        LocalDate yearsMinus = input.minusYears(30);
        LocalDate yearsPlus = input.plusYears(30);
        System.out.println(yearsMinus + " " + yearsPlus);
    }
}