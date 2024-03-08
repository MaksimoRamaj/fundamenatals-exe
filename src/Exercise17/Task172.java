package Exercise17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task172 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the date of your next SDA classes (yyyy-MM-dd): ");
            String dateString = scanner.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate nextSDAClassesDate = LocalDate.parse(dateString, formatter);

            LocalDate currentDate = LocalDate.now();

            long daysLeft = currentDate.until(nextSDAClassesDate).getDays();
            System.out.println("There are " + daysLeft + " days left until your next SDA classes.");

        } catch (Exception e) {
            System.out.println("Invalid input or date format. Please enter the date in the format yyyy-MM-dd.");
        }
}}
