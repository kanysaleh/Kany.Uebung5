package h2;

public class H2_main {
    public static void main(String[] args) {
        int n = 299;
        int[] a = new int[9];

        int temp = n;
        int digits = 0;

        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        for (int i = 8; i >= 9 - digits; i--) {
            a[i] = n % 10;
            n /= 10;
        }

        for (int i = 0; i < 9; i++) {
            System.out.print(a[i] + " ");
        }


    }
}
