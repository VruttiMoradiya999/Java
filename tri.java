public class tri {
    public static void trin(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }

            }
            System.out.println(" ");
        }
    }

    public static void find(int arr[], int n) {
        for (int i = 1; i <= n; i++) {
        }
        for (int i = 1; i <= n; i++) {
        }
    }

    public static void main(String arg[]) {
        int arr[] = { 1, 2, 3, 5, 6 };
        find(arr, 5);
    }
}
