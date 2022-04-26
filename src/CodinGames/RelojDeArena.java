package CodinGames;
import Thais.th;

public class RelojDeArena {
    public static void main(String[] args) {

        String lineas = th.leer("Ingrese las lineas: ").replace(" ","");
        int valor = lineas.length();
        String linea = "- ";
        for (int i = 0; i < valor; i++)
        {
            th.println(lineas);
            lineas = lineas.substring(linea.length()-2);
        }
        
    }
    
}
