package AppAccesosDirectos;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;


public class Perfiles extends JFrame {

    Perfiles() {
        setUndecorated(true);
        setVisible(true);
        setSize(new Dimension(500,700));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(Color.GRAY);
        add(panel);

        JPanel panelInferior = new JPanel();
        panelInferior.setOpaque(false);
        panel.add(panelInferior, BorderLayout.SOUTH);

        JButton salir = new JButton("Salir");
        salir.setFont(new Font(Font.SERIF,Font.BOLD,40));
        salir.setBorder(new EmptyBorder(50,0,0,0));
        panelInferior.add(salir);
        
        ActionListener accionSalir = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        };
        salir.addActionListener(accionSalir);
        
        JPanel panelSuperior = new JPanel();
        panelSuperior.setOpaque(false);
        panel.add(panelSuperior, BorderLayout.NORTH);

        JLabel tituloPerfiles = new JLabel("Perfiles");
        tituloPerfiles.setFont(new Font(Font.SERIF,Font.BOLD,30));
        tituloPerfiles.setBorder(new EmptyBorder(100,0,0,0)); // arriba, izquierda, abajo, derecha
        panelSuperior.add(tituloPerfiles);
        
        // crear panel central y ubicarlo en el centro del panel principal y hacerlo transparente
        JPanel panelCentral = new JPanel();
        panelCentral.setOpaque(false);
        panel.add(panelCentral, BorderLayout.CENTER);

        // crear el comboBox y meterlo en el panel central
        JComboBox<JLabel> lista = new JComboBox<>();
        lista.setPreferredSize(new Dimension(200,50));
        panelCentral.add(lista);
        
    }

    public static void main(String[] args) {
        new Perfiles();
    }
}
/**
 *  _________________
 * |                 |
 * |                 |
 * |     PERFILES|+| | |+| = boton de añadir
 * |     OOOOOOOO|^| | OOOOOOOOO = nombre del perfil elegido, |^| = boton para 
 * |                 | mostrar los demas perfiles vamos a intentar usar 
 * |                 | una nueva cosa q se llama JComboBox y le vamos a quitar
 * |                 | lo de cerrar minimizar y maximizar q tienen las ventanas con setUndecorated :D
 * |                 | tambien vamos a hacer q no se pueda cambiar el tamaño con setRezisable :D
 * |                 |
 * | O             X | O = abrir, X = cerrar
 * |_________________|
 */