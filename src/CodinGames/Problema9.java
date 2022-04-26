package CodinGames;

import Thais.th;

public class Problema9 {

        public static void main(String args[]) {
            
            long num = th.enteroG(th.leer());

            int digitos = Long.toString(num).length();
            long numero = num;
            int suma = 0;

            for(int i=0; i<digitos; i++)
            {
                suma +=(int)Math.pow(num%10,digitos);    
                num/=10;
            }
    
             System.out.println(suma==numero);
    
        }
}
    

// Se dice que un número natural es un número narcisista si la suma de sus dígitos elevados a la potencia del número total de dígitos es igual a ese número.

//p.ej. 153 = 1 ^ 3 + 5 ^ 3 + 3 ^ 3 = 153
//Por lo tanto, 153 es un número narcisista.