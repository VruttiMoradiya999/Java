import java.util.*;

public class avg {

    public static int average(int n, int o, int p) {
        int avg = (n + o + p) / 3;
        return avg;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.print("avg is : " + average(a, b, c));
    }
}
