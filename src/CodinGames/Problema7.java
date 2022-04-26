package CodinGames;

import java.util.Scanner;

public class Problema7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String r = "";
        for (char c : s.toCharArray()) {
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u')
                r += c;
        }
        System.out.println(r);
    }
}
