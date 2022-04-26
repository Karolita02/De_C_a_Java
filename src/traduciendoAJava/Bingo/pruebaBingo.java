package traduciendoAJava.Bingo;
import java.util.Scanner;

import traduciendoAJava.Bingo.Carton;
public class pruebaBingo {
    public static void main(String[] args) {
        Carton carton = new Carton();
        Scanner leer = new Scanner(System.in);
        while(true)
        {
            carton.mostrarCarton();
            carton.marcarCarton(leer.nextInt());
            carton.verificarVictoria();
            
        }

        
    }
    
}
