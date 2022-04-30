package MasSobreJava;

public class Encapsulamiento 
{
    private int edad;
    private int hora;
    private String nombre;
    private String cumpleaños;


    public static void main(String[] args) 
    {
        Encapsulamiento a = new Encapsulamiento();
        Encapsulamiento.practica  b = a.new practica();
        Encapsulamiento.practica.practicaza c = b.new practicaza();
        
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    class practica{
        practica(){
            var a = new Encapsulamiento();
            a.setEdad(23);
            System.out.println(a.getEdad());
            
        }
        class practicaza{
            practicaza(){
                var a = new Encapsulamiento();
                a.setEdad(23);
                System.out.println(a.getEdad());
                
            }
        }
    }

}
