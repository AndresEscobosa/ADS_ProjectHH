package gui;

import javax.swing.*;
import java.awt.*;

public class ConsultarLeccionesAlumno extends JPanel {

    private AA_GUI ventana;

    public ConsultarLeccionesAlumno(final AA_GUI ventana){
        this.ventana=ventana;
        setLayout(new BorderLayout());

        JPanel pnlN=new JPanel();
        pnlN.setOpaque(false);
        JLabel lblTitle=new JLabel("Consultar Lecciones Alumno");
        lblTitle.setForeground(Color.blue);
        pnlN.add(lblTitle);
        add(pnlN,BorderLayout.NORTH);


    }
}
