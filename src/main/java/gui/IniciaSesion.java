package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IniciaSesion extends JPanel {

    private AA_GUI ventana;

    private MiBoton btnNext=new MiBoton("Next",Color.blue.brighter(),Color.WHITE);

    public IniciaSesion(final AA_GUI ventana){
        this.ventana=ventana;
        setLayout(null);
        setBackground(ventana.getAzulFondo());

        JPanel pnlN=new JPanel();
        JPanel pnlS=new JPanel();
        JPanel pnlC=new JPanel();

        pnlN.setLayout(null);
        pnlS.setLayout(null);
        pnlC.setLayout(null);

        pnlN.setOpaque(false);
        pnlS.setOpaque(false);
        pnlC.setOpaque(true);

        pnlN.setBounds(0,0,ventana.getWidth(),100);
        pnlC.setBounds(ventana.getWidth()/4,100,ventana.getWidth()/2,300);
        pnlS.setBounds(0,400,ventana.getWidth(),300);

        pnlC.setBackground(Color.white);
        pnlC.setBorder(BorderFactory.createLineBorder(Color.BLUE,2));

        JLabel lblTitle=new JLabel(" Iniciar Sesión ",SwingConstants.CENTER);
        lblTitle.setForeground(Color.white);
        lblTitle.setBackground(ventana.getAzulLabel());
        lblTitle.setOpaque(true);
        lblTitle.setBorder(BorderFactory.createLineBorder(Color.black,2));
        lblTitle.setBounds(350,35,100,30);

        JLabel lblNombreUsuario=new JLabel("Nombre de usuario:",SwingConstants.CENTER);
        lblNombreUsuario.setBounds(20,0,130,50);

        JTextField txtfNombreUsuario=new JTextField();
        txtfNombreUsuario.setBounds(20,50,360,50);
        txtfNombreUsuario.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));

        JLabel lblIntroduceContrasena=new JLabel("Introduce contraseña:",SwingConstants.CENTER);
        lblIntroduceContrasena.setBounds(20,100,130,50);

        JPasswordField passfContrasena=new JPasswordField();
        passfContrasena.setBounds(20,150,360,50);
        passfContrasena.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));

        JButton btnSiguiente=new JButton("Siguiente");
        btnSiguiente.setBounds(280,202,100,30);
        btnSiguiente.setForeground(Color.black);
        btnSiguiente.setBackground(ventana.getAzulLabel());
        btnSiguiente.setOpaque(true);
        btnSiguiente.setBorder(BorderFactory.createLineBorder(Color.black,2));

        JButton btnNextPanel=new JButton("Next Panel");
        btnNextPanel.setBounds(350,25,100,30);
        btnNextPanel.setForeground(Color.black);
        btnNextPanel.setBackground(ventana.getAzulLabel());
        btnNextPanel.setOpaque(true);
        btnNextPanel.setBorder(BorderFactory.createLineBorder(Color.black,2));

        btnNextPanel.addActionListener(new ActionListener() {
            //@Override
            public void actionPerformed(ActionEvent e) {
                ventana.getLayout().show(ventana.getContentPane(),"AdministraUsuarios");
            }
        });

        pnlN.add(lblTitle);
        pnlC.add(lblNombreUsuario);
        pnlC.add(txtfNombreUsuario);
        pnlC.add(lblIntroduceContrasena);
        pnlC.add(passfContrasena);
        pnlC.add(btnSiguiente);
        pnlS.add(btnNextPanel);
        add(pnlN);
        add(pnlC);
        add(pnlS);
    }
}
