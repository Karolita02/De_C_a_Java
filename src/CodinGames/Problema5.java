package CodinGames;

import java.util.*;

public class Problema5 {
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        int numero = leer.nextInt();
        int respuesta = numero;
        while(numero > 1){
            respuesta *= --numero;
        }
        System.out.println(respuesta == 0 ? 1 : respuesta);

        amadito();
    }
    static void amadito(){
        // :D :D le toca a amadito wuuuuuuu
        System.out.println(factorial(leer.nextInt())); // TRAMPAAAA :C 
    }
    static int factorial(int num){
        return num <= 1 ? 1 : num * factorial(num - 1);
    }
    
}
