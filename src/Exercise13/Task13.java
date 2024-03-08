package Exercise13;

import java.util.Scanner;
import java.util.Set;

public class Task13 {
    public static void main(String[] args) {
        t13();
    }
    //Write an application that "stutters", that is,
    // reads the user's text (type String), and prints
    //the given text, in which each word is printed twice.
    //For example, for the input:
    // "This is my test" the application should print "This This is is
    //my my test test".
    static void t13(){
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        String[] strings = userInput.split("\\s");

        for (String str:strings){
            System.out.print(str +" " +str);
        }


    }
}
