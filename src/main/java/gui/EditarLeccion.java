package gui;

import javax.swing.*;
import java.awt.*;

public class EditarLeccion extends JPanel {

    private AA_GUI ventana;

    public EditarLeccion(final AA_GUI ventana){
        this.ventana=ventana;
        setLayout(new BorderLayout());

        JPanel pnlN=new JPanel();
        pnlN.setOpaque(false);
        JLabel lblTitle=new JLabel("Editar Lección");
        lblTitle.setForeground(Color.blue);
        pnlN.add(lblTitle);
        add(pnlN,BorderLayout.NORTH);


    }
}
