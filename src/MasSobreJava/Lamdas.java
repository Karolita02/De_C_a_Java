package MasSobreJava;

public class Lamdas // para crear lamdas necesitamos una interfaz
{ 
    /**
     * Pasos para usar lamda
     * 1. crear una interfaz
     * 2. crear una funcion abstracta en la interfaz
     * 3. crear una funcion dentro de la clase que pida por parámetro la interfaz
     * 4. En el paramétro donde se pidio la intefaz debemos aplicar el lamda
     * 5. Recordar la estructura del lamda
     * -(argumentos si los hay)-> le damos la funcionalidad
     * - si es largo: (argumentos si los hay)-> {
     * le damos la funcionalidad en varias lineas
     * });
    */

    public static void main(String[] args) 
    {
        int c = new Lamdas().calcularOperacion(4, 4, (a,b)-> (int)Math.pow(a,b));
        System.out.println(c);

        int d = new Lamdas().calcularOperacion(3, 6, (a,b)->{ 
            int multiplicar =1;
            for (int i = 0; i < b; i++)
            {
                multiplicar*=a;

            }
            return multiplicar;
        });
        System.out.println(d);

    }

    int calcularOperacion(int num1, int num2, Accion suma) 
    {
        return suma.operacion(num1,num2);
    }

interface Accion 
{
    int operacion(int num1, int num2); // metodo abstracto es asi porque está  dentro de la interfaz
}

}

/*
 * Atributos de los metodos,variables o de las clases
 * public : desde cualquier parte siempre que la clase sea importada
 * protected: solo en su clase y subclases de otros paquetes y en el propio
 * default: en este archivo y el mismo paquete
 * private: solo en su clase
 * 
 */