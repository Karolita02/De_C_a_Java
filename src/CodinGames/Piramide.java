package CodinGames;
import Thais.th;

public class Piramide {
    public static void main(String[] args) {
        int numBloques = th.entero(th.leer("Ingrese el número de bloques: "));
        int auxBloques = numBloques;
        int alto = 0, restantes = 0;
        for (int i = 1; i <= numBloques; i++)
        {
            if((auxBloques - i) >= 0 )
            {
                auxBloques -= i;
                alto++;
                
            }
            else
                restantes = auxBloques;      
        }

        th.println(alto + "  " + restantes); 
    }
    
}
