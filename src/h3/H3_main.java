package h3;

public class H3_main {
    public static void main(String[] args) {

        int[][] einheiten = {
                {50000, 20000, 10000, 5000, 2000,
                        1000, 500, 200, 100, 50,
                        20, 10, 5, 2, 1},
                new int[15]
                };

        int input = 80000;
        int rest = input;

        for (int i = 0; i < einheiten[0].length; i++) {
                    if (rest >= einheiten[0][i]) {
                        einheiten[1][i] = rest / einheiten[0][i];
                        rest = rest % einheiten[0][i];
                    }
        }
        System.out.println("Geldwerte:");
        for (int w : einheiten[0]) System.out.print(w + " ");
        System.out.println("\nStückzahlen:");
        for (int s : einheiten[1]) System.out.print(s + " ");

        System.out.println("\n\nRestbetrag = " + rest);

    }
}
