package Exercise17;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        System.out.println(t17().getDays());
    }
    //Write an application that will read from the user the date of your next
    // SDA classes and
    //calculate how many days are left to them.
    //Hint: read the date as String and parse it to LocalDate. Get the current date using
    //LocalDate.now() method.

    static Period t17(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jep daten ne formatin day-month-year!");
        String date = scanner.next();
        String[] dates = date.split("-");
        LocalDate localDate = LocalDate.of(Integer.parseInt(dates[2]),
                Integer.parseInt(dates[1]),Integer.parseInt(dates[0]));

        return Period.between(LocalDate.now(),localDate);
    }
}
