import java.util.*;

public class op {

    public static boolean prime(int n) {
        boolean isprime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void pr(int n) {
        for (int i = 2; i <= n; i++) {
            if (prime(i) == true) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main() {
        pr(8);
    }
}
