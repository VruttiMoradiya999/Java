// import java.util.*;

// public class pattern {
//     public static void main(String args[]) {
//         for (int i = 1; i <= 4; i++) {
//             System.out.println("****");
//         }
//     }
// }

import java.util.*;

public class pattern {
    public static void main(String args[]) {
        int num = 170806;
        int rev = 0;

        while (num > 0) {
            int ld = num % 10;
            rev = rev * 10 + ld;
            num = num / 10;
        }
        System.out.println(rev);
    }
}