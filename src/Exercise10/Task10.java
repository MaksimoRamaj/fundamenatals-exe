package Exercise10;

import java.util.Scanner;

public class Task10 {
    //Write an application that gets one positive number (type int) from the user
    // and calculates
    //a sum of digits of the given number. Hint: to make some operations
    // on every single digit
    //of the number (digit by digit), you can calculate the remainder
    // of dividing the number by
    //10 (to get the value of the last digit) and divide
    // the number by 10 (to "move" to the next
    //digit).

    public static void main(String[] args) {
        System.out.println("Shuma: " + calculator());
        //12345 = 15
    }

    static int calculator(){
        System.out.println("Vendos numrin: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int remainder = 0;
        int sum = 0;
        while (number > 0) {
            remainder = number % 10;
            number = number / 10;
            sum = sum + remainder;
        }
        return sum;
    }
}
