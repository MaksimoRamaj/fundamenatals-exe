package Exercise11;

import java.util.Scanner;

public class Task11 {
    //Write an application that will read texts (variables of the String type)
    // until the user gives
    //the text "Enough!" and then writes the longest of the given
    // texts (not including the text
    //"Enough!"). If the user does not provide any text, write "No text provided".
    public static void main(String[] args) {
        t11();;
    }
    static void t11(){
        Scanner scanner = new Scanner(System.in);
        String userInput = null;
        String longestString = " ";
        do {
            System.out.println("Jep text input: ");
            userInput = scanner.next();
            if (!userInput.equalsIgnoreCase("enough")){
                if(userInput.length()>longestString.length()){
                    longestString = userInput;
                }
            }else {
                break;
            }
        }while (true);
            System.out.println("String me gjatesi me te madhe: " + longestString);
    }
}
