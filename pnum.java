import java.util.*;

public class pnum {

    public static void floyds_triangle(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println(" ");
        }
    }

    public static void main(String args[]) {
        int r = 5;
        int c = 5;

        for (int i = 0; i < r; i++) {
            for (int j = 1; j < r - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }

    }
}

// 12345
// 1234
// 123
// 12
// 1