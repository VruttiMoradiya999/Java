import java.util.*;

public class bc {
    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return (f);
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int a = fact(n);
        int b = fact(r);
        int c = fact(n - b);

        int bc = a / (b * c);
        System.out.println(bc);

    }

}
