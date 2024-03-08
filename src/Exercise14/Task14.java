package Exercise14;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        System.out.println(t14());
    }

    //Write an application that reads two lowercase letters of the Latin alphabet
    // (type char)
    //and calculates how many characters is there in the alphabet between given letters.
    //Hint - use the ASCII code table and treat the characters as int numbers.

    static int t14(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jep char1: ");
        char ch1 = scanner.next().charAt(0);
        System.out.println("Jep char2: ");
        char ch2 = scanner.next().charAt(0);
        return Character.compare(ch2,ch1);
    }
}
