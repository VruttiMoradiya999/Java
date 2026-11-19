public class binToDec {

    public static void btd(int binum) {
        int dec = 0;
        int pow = 0;
        while (binum > 0) {
            int lastDigit = binum % 10;
            dec = dec + (lastDigit * (int) Math.pow(2, pow));

            pow++;
            binum = binum / 10;
            System.out.print(dec);
        }
    }

    public static void dtb(int n) {
        int bin = 0;
        int pow = 0;

        while (n > 0) {
            int rem = n % 2;
            bin = bin + (rem * (int) Math.pow(10, pow));

            pow++;
            n = n / 2;

        }
    }

    public static void main() {
        btd(101);
    }
}
