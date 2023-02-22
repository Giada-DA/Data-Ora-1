import java.time.LocalDate;
import java.time.Year;

public class Start {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        Year thisYear = Year.of(2023);
        System.out.println("We are in the year " + Year.now());
        System.out.println((date.lengthOfMonth() - date.getDayOfMonth()) + " days left until the end of the month");
        System.out.println((thisYear.length()-date.getDayOfYear()) + " days left until the end of the year");
    }
}