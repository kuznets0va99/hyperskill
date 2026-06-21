import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        YearMonth yearMonth = YearMonth.of(year, month);
        int days = yearMonth.lengthOfMonth();

        List<LocalDate> list = new ArrayList<>();
        for (int i = 1; i <= days; i++){
            LocalDate date = LocalDate.of(year,month,i);
            if (date.getDayOfWeek() == DayOfWeek.MONDAY){
                list.add(date);
            }
        }
        list.forEach(System.out::println);
    }
}