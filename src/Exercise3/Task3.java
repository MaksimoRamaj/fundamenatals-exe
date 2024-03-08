package Exercise3;

public class Task3 {
    public static void main(String[] args) {

    }
    static double[] solveQuadratic(int a,int b,int c){
        double delta = Math.pow(b,2);
        if (delta < 0)throw new RuntimeException("No negative delta allowed!");
        double firstRoot = (-b-Math.sqrt(delta))/(2*a);
        double secondRoot = (-b+Math.sqrt(delta))/(2*a);
        double[] roots = new double[2];
        roots[0] = firstRoot;
        roots[1] = secondRoot;
        return roots;
    }
}
