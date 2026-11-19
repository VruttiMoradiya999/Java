import java.util.*;

public class factorial {

    public static int fac(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {

            f = i * f;
        }

        return (f);
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = fac(n);
        System.out.println(f);
    }

}
