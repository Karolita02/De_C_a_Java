package CodinGames;

import java.util.Scanner;

public class Problema6 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int suma = 0;
        for (int i = 1; i < N; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                suma += i;
            }

        }
        System.out.println(suma);
    }
}
