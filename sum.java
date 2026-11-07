import java.util.*;

public class sum {
    public static void main(String args[]) {
        int sum = 0;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while (i <= num) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }

}
