import java.util.*;

public class ArrayLarge {

    public static void printPairs(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.println("(" + curr + "," + numbers[j] + ")");
            }
            System.out.println();
        }

    }

    // public static void reverse(int numbers[]) {
    // int first = 0;
    // int last = numbers.length - 1;

    // while (first < last) {
    // int temp = numbers[last];
    // numbers[last] = numbers[first];
    // numbers[first] = temp;
    // first++;
    // last--;

    // }
    // }

    // public static int binarySearch(int numbers[], int key) {
    // int start = 0;
    // int end = numbers.length - 1;
    // while (start <= end) {
    // int mid = (end + start) / 2;

    // if (numbers[mid] == key) {
    // return mid;
    // }
    // if (numbers[mid] > key) {
    // start--;
    // }
    // if (numbers[mid] < key) {
    // start++;
    // }
    // }
    // return -1;
    // }

    // public static int getLargest(int numbers[]) {
    // int largest = Integer.MIN_VALUE;
    // for (int i = 0; i < numbers.length; i++) {
    // if (largest < numbers[i]) {
    // largest = numbers[i];
    // }
    // }
    // return largest;
    // }

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10, 12 };
        printPairs(numbers);

        // reverse(numbers);
        // for (int i = 0; i < numbers.length; i++) {
        // System.out.print(numbers[i] + " ");
        // }
        // System.out.println(" ");

        // int key = 10;
        // System.out.println("index value of key is " + binarySearch(numbers, key));

        // System.out.println("largest value is " + getLargest(numbers));
    }
}
