package Review;

import jdk.jshell.execution.LoaderDelegate;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.util.Date;

public class Tasks {
    public static void main(String[] args) {
        task30();
    }
    //Shkruani një program Java për të marrë datën dhe orën aktuale.
    static void task28(){
        Date date = new Date();
        System.out.println(date);
    }
    static void task29(){
        LocalDate localDate = LocalDate.now();
        LocalDate lastDayOfMonth = localDate.withDayOfMonth(localDate.lengthOfMonth());
        System.out.println(lastDayOfMonth);
    }

    static void task30(){
        YearMonth yearMonth = YearMonth.now();
        System.out.println(yearMonth.lengthOfMonth());
    }
}
