import java.util.*;

public class Array {

    public static void main(String arg[]) {
        // int marks[] = new int[100];
        // Scanner sc = new Scanner(System.in);

        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // System.out.println("phy : " + marks[0]);
        // System.out.println("chem : " + marks[1]);
        // System.out.println("math : " + marks[2]);

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int key = 56;
        int n = ls(arr, key);
        if (n == -1) {
            System.out.println("NOT");
        }
    }

    public static int ls(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
