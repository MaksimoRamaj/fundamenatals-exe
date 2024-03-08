package Exercise1;

import java.util.Scanner;

//Write an application that will read diameter of a circle (variable of type float) and
//calculate perimeter of given circle.
//Firstly, assume π = 3.14. Later, use value of π from built-in Math class.
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vendos diametrin: ");
        float radius = sc.nextFloat() / 2;
        System.out.println("Perimeter: " + 2*Math.PI*radius);
    }
}
