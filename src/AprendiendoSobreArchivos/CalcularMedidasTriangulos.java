package AprendiendoSobreArchivos;
import java.io.File;
import java.io.IOException;

import Thais.th;

public class CalcularMedidasTriangulos {
    public static void main(String[] args) {
        // abriendo archivo
        try {
            th.asignarArchivoLectura("src\\AprendiendoSobreArchivos\\MedidasTriangulos.txt");
            File respuesta = new File("src\\AprendiendoSobreArchivos\\Respuesta.txt");
            th.asignarArchivoEscritura(respuesta);
            String b;
            int triangulo = 1;
            while(( b = th.archivoLectura.readLine()) != null)
            {
                String[] a = b.split("base: |, altura: ");
                float base = Float.parseFloat(a[1]);
                float altura = Float.parseFloat(a[2]);
                float hip = (float)Math.sqrt(Math.pow(base,2) + Math.pow(altura,2));
                float perimetro = base + altura + hip;
                float area = (base * altura) / 2;
                th.archivoEscritura.write(String.format("Triangulo %d\n", triangulo++));
                th.archivoEscritura.write(String.format("Hipotenusa: %.2f\n", hip));
                th.archivoEscritura.write(String.format("Perimetro: %.2f\n", perimetro));
                th.archivoEscritura.write(String.format("Area: %.2f\n\n", area));
            }
            th.archivoLectura.close();
            th.archivoEscritura.close();
        } catch (IOException e) {
            th.println("no funciona");
        }
    }
    
}
