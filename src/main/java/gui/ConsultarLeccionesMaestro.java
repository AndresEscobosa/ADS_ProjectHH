package gui;

import javax.swing.*;
import java.awt.*;

public class ConsultarLeccionesMaestro  extends JPanel {

    private AA_GUI ventana;

    public ConsultarLeccionesMaestro(final AA_GUI ventana){
        this.ventana=ventana;
        setLayout(new BorderLayout());

        JPanel pnlN=new JPanel();
        pnlN.setOpaque(false);
        JLabel lblTitle=new JLabel("Consultar Lecciones Maestro");
        lblTitle.setForeground(Color.blue);
        pnlN.add(lblTitle);
        add(pnlN,BorderLayout.NORTH);


    }
}
