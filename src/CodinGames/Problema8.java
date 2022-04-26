package CodinGames;

import java.util.Scanner;

public class Problema8 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt();
        int H = in.nextInt();
        String lobo = "|\\_/|";
        String buho = "(oo)";
        int lobito = 0, buhito = 0;
        if (in.hasNextLine()) {
            in.nextLine();
        }

        for (int i = 0; i < H; i++) {
            String ROW = in.nextLine();
            while (!ROW.contains("|\\_/|") && !ROW.contains(buho))
                if (ROW.contains("|\\_/|")) {
                    ROW = ROW.replace("|\\_/|", "");
                    lobito++;
                }
            if (ROW.contains(buho)) {   
                ROW = ROW.replace(buho, "");
                buhito++;
            }

        }

        System.out.println(lobito);
        System.out.println(buhito);
        System.out.println(lobo);

    }

}
