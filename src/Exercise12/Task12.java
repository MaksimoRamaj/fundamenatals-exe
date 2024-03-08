package Exercise12;

import java.util.Scanner;

public class Task12 {
    //Write an application that reads a text from the user (type String)
    // and counts a percentage
    //of occurrences of a space character.
    public static void main(String[] args) {
            System.out.println(t12());
    }

    static int t12(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendos user input: ");
        String userInput = scanner.nextLine();
        int count = 0;
        if (userInput.isEmpty())return 0;
        for (int i=0;i<userInput.length();i++){
            if (Character.isWhitespace(userInput.charAt(i))){
                count++;
            }
        }
        return count;
    }
}
