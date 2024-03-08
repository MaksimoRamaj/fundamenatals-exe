package Exercise6;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

    }

    private static void t6(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n< 0 ){
            return;
        }
        double hn = 0;
        for (int i=1;i<=n;i++){
            hn = hn + (double) 1 /i;
        }
        System.out.println("Sum: " + hn);
    }
}
