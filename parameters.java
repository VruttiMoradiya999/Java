import java.util.*;

public class parameters {

    public static int calculateSum(int c, int d) {
        int sum = c + d;
        return sum;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculateSum(a, b);
        System.out.println("Sum is : " + sum);
    }
}
