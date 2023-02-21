import java.time.LocalDate;
import java.time.Year;

public class Start {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Today is " + date.getDayOfMonth() + " of the month: " + date.getMonth());
        System.out.println((date.lengthOfMonth() - date.getDayOfMonth()) + " days left until the end of the month");
        System.out.println((date.lengthOfYear() - date.getDayOfYear()) + " days left until the end of the year");
        System.out.println("We are in the year " + Year.now());
    }
}