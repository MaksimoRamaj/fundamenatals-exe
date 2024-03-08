package Exercise7;

public class Task7 {

    public static void main(String[] args) {
        int numb = fibo(13);
        System.out.println("Fibo in 8: " +numb);
    }


    static int fibo(int n) {
        int num1 = 0;
        int num2 = 1;
        int num3 = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(num1 + " ");
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        return num3;
    }
}
