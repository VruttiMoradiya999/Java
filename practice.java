import java.util.*;

public class practice {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("number is positive");
        } else if (num < 0) {
            System.out.println("number is negative");

        } else {
            System.out.println("number is neither positive nor negative");

        }

    }
}
