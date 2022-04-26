package CodinGames;

import java.util.*;

public class Problema4 {
   static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        amadito();
    }

    static void amadito(){
        char[] W = in.nextLine().toCharArray(); // palabra
        char[] L = in.nextLine().toCharArray(); // lista letras

        Map<Character, Integer> palabra = new HashMap<>();
        Map<Character, Integer> letras = new HashMap<>();

        for (char i : W) {
            if(palabra.containsKey(i))
                palabra.put(i, palabra.get(i) + 1);
            else
                palabra.put(i, 1);
        }

        for (char i : L) {
            if(letras.containsKey(i))
                letras.put(i, letras.get(i) + 1); 
            else
                letras.put(i, 1); // a -> 1
        }
        List<Integer> cantidades = new ArrayList<>(); // hhsal
        for (char i : W) { // h o l a
            cantidades.add(letras.get(i) / palabra.get(i)); // 2, 0, 1, 1
        }
        Collections.sort(cantidades); 
        System.out.println(cantidades.get(0));
    }
    
}
