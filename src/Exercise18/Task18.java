package Exercise18;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task18{
    public static void main(String[] args) {
        readText();
    }
    //Write an application that reads a text from the user (type String)
    // and checks whether the
    //user sneezed, i.e. whether the text equals Ͽachooo!Ѐ with one or
    // more letter "o" at the end
    //of the expression (so both 'acho!' and 'achooooooo!Ѐ are correct).
    // Hint: use a regular
    //expression with the appropriate quantifie

    static void readText(){
        Pattern pattern;
        Matcher matcher;
        Scanner scanner = new Scanner(System.in);
        String userInput;
        while (true){
            System.out.println("Enter text: ");
            userInput = scanner.next();
            if (userInput.equalsIgnoreCase("exit")){
                break;
            }
            pattern = Pattern.compile("ach[o]", Pattern.CASE_INSENSITIVE);
            matcher = pattern.matcher(userInput);
            boolean matchFound = matcher.find();
            if(matchFound) {
                System.out.println("Match found");
            } else {
                System.out.println("Match not found");
            }
        }
    }
}

