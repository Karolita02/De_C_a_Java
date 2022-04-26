package ViejosTiempos;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Ventana extends JFrame{
    public Ventana(int ancho, int alto){
        // hay q hacer la ventana visible y darle un tamaño :D  grax :D 
        setVisible(true);
        setSize(new Dimension(ancho, alto));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        
    }
}
