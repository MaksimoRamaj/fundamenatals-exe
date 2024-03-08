package Exercise16;

import java.util.Random;

public class Task16 {
    //Write an application that takes 10 numbers from the user (type int)
    // and write the length
    //of the longest such subsequence of these numbers, which is increasing.
    //For example, for the numbers: "1, 3, 8, 4, 2, 5, 6, 11, 13, 7"
    // the program should write "5"
    //as the length of the longest increasing subsequence (underlined in the example).
    public static void main(String[] args) {
        t16();
    }
    static void t16(){
        int[] intArray = {1, 0, 8, 6, 7, 5, 4, 3, 2, 1};
        int count = 1;
        int maxCount = 1;
        for (int i=0;i< intArray.length-1;i++){
            if (intArray[i]<intArray[i+1]){
                count++;
            }else {
                if (maxCount < count){
                    maxCount = count;
                }
                count = 1;
            }
        }
        System.out.println(maxCount);
    }
}
