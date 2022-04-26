package ViejosTiempos;

import java.awt.Font;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JPanel;

public class TextoConCuadro extends JPanel{
    Texto texto;
    CuadroDeTexto cuadro;
    public TextoConCuadro(String texto, int tamañoLetra){
        setOpaque(false);
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 5));
        this.texto = new Texto(texto,tamañoLetra);
        cuadro = new CuadroDeTexto();
        cuadro.setFont(new Font(Font.SERIF,Font.ITALIC,tamañoLetra));// name style size
        this.texto.setFont(new Font(Font.SERIF,Font.BOLD,tamañoLetra));
        cuadro.setPreferredSize(new Dimension(tamañoLetra * tamañoLetra / 4, tamañoLetra + 10));
        
        add(this.texto);
        add(cuadro);
    }
    
}
