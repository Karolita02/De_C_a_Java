package CodinGames;

import java.util.Scanner;

/**
 * Problema1
 */
public class Problema1 {
    // declarar aki las variables las hace globales
    // ponerles STATIC te permite usarlas en el main directamente
    // si no le pones STATIC tendrias q crear un objeto Problema1 para poder usarlo

    // para String se usa length()
    // para arreglos se usa length
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        char[] palabra = leer.nextLine().toCharArray();
        System.out.println(palabra);
        for (int i = palabra.length-1; i >= 0 ; i--) {
            palabra[i] = '*';
            System.out.println(palabra); 
        }

        amadito();
        
    }

    public static void amadito(){
        char[] palabra = leer.nextLine().toCharArray();
        for (int i = palabra.length-1; i >= -1; i--) {
            System.out.println(palabra);
            palabra[i == -1 ? 0 : i] = '*';
        }
    }

    
    
}
