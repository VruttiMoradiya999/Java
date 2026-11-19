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

    public static void main() {
        btd(101);
    }
}
