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

    public static void main() {
        System.out.println(prime(3));
    }
}
