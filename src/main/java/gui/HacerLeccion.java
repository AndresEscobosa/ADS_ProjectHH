package gui;

        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class HacerLeccion extends JPanel {
    private AA_GUI ventana;

    public HacerLeccion(final AA_GUI ventana){
        this.ventana=ventana;
        setLayout(null);
        setBackground(ventana.getAzulFondo());

        JPanel pnlN=new JPanel();
        JPanel pnlS=new JPanel();
        JScrollPane pnlScrollLecciones=new JScrollPane();
        JPanel pnlLecciones=new JPanel();

        pnlN.setLayout(null);
        pnlLecciones.setLayout(null);
        pnlS.setLayout(null);

        pnlN.setOpaque(false);
        pnlS.setOpaque(false);
        pnlScrollLecciones.setOpaque(false);
        pnlLecciones.setOpaque(true);

        pnlN.setBounds(0,0,ventana.getWidth(),615);
        pnlScrollLecciones.setBounds(270,100,260,150);
        pnlS.setBounds(0,615,ventana.getWidth(),70);
        pnlLecciones.setPreferredSize(new Dimension(240,360));
        JLabel lblModoAdmin=new JLabel("");
        lblModoAdmin.setBorder(BorderFactory.createLineBorder(Color.black,2));
        lblModoAdmin.setBounds(0,0,800,30);

        JButton btnMenuPrincipal=new JButton("Menú Principal");
        btnMenuPrincipal.setForeground(Color.black);
        btnMenuPrincipal.setBackground(Color.white);
        btnMenuPrincipal.setOpaque(true);
        btnMenuPrincipal.setBorder(BorderFactory.createLineBorder(Color.black,2));
        btnMenuPrincipal.setBounds(0,0,100,30);

        JButton btnHacerLeccion=new JButton("Hacer Lección");
        btnHacerLeccion.setForeground(Color.white);
        btnHacerLeccion.setBackground(ventana.getVerdeADS());
        btnHacerLeccion.setOpaque(true);
        btnHacerLeccion.setBorder(BorderFactory.createLineBorder(Color.black,2));
        btnHacerLeccion.setBounds(100,0,100,30);

        JButton btnConsultarLecciones=new JButton("Consultar Lecciones");
        btnConsultarLecciones.setForeground(Color.black);
        btnConsultarLecciones.setBackground(Color.white);
        btnConsultarLecciones.setOpaque(true);
        btnConsultarLecciones.setBorder(BorderFactory.createLineBorder(Color.black,2));
        btnConsultarLecciones.setBounds(200,0,120,30);

        JButton btnCerrarSesion=new JButton(" Cerrar Sesión ");
        btnCerrarSesion.setForeground(Color.white);
        btnCerrarSesion.setBackground(Color.red);
        btnCerrarSesion.setOpaque(true);
        btnCerrarSesion.setBorder(BorderFactory.createLineBorder(Color.black,2));
        btnCerrarSesion.setBounds(688,0,100,30);

        JLabel lblLecciones=new JLabel("Lecciones",SwingConstants.CENTER);
        lblLecciones.setForeground(Color.white);
        lblLecciones.setBackground(ventana.getAzulLabel());
        lblLecciones.setOpaque(true);
        lblLecciones.setBorder(BorderFactory.createLineBorder(Color.black,2));
        lblLecciones.setBounds(350,35,100,30);

        JLabel lblLeccion1=new JLabel("TIJUANA",SwingConstants.CENTER);
        lblLeccion1.setForeground(Color.black);
        lblLeccion1.setBackground(Color.white);
        lblLeccion1.setOpaque(true);
        lblLeccion1.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblLeccion1.setBounds(0,0,140,30);

        JLabel lblLeccion2=new JLabel("Planetas",SwingConstants.CENTER);
        lblLeccion2.setForeground(Color.black);
        lblLeccion2.setBackground(Color.white);
        lblLeccion2.setOpaque(true);
        lblLeccion2.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblLeccion2.setBounds(0,30,140,30);

        JLabel lblLeccion3=new JLabel("Fracciones",SwingConstants.CENTER);
        lblLeccion3.setForeground(Color.black);
        lblLeccion3.setBackground(Color.white);
        lblLeccion3.setOpaque(true);
        lblLeccion3.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblLeccion3.setBounds(0,60,140,30);

        JLabel lblLeccion4=new JLabel("Adjetivos calificativos",SwingConstants.CENTER);
        lblLeccion4.setForeground(Color.black);
        lblLeccion4.setBackground(Color.white);
        lblLeccion4.setOpaque(true);
        lblLeccion4.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblLeccion4.setBounds(0,90,140,30);

        JLabel lblLeccion5=new JLabel("Festividades",SwingConstants.CENTER);
        lblLeccion5.setForeground(Color.black);
        lblLeccion5.setBackground(Color.white);
        lblLeccion5.setOpaque(true);
        lblLeccion5.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblLeccion5.setBounds(0,120,140,30);

        JLabel lblLeccion6=new JLabel("Personajes históricos",SwingConstants.CENTER);
        lblLeccion6.setForeground(Color.black);
        lblLeccion6.setBackground(Color.white);
        lblLeccion6.setOpaque(true);
        lblLeccion6.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblLeccion6.setBounds(0,150,140,30);

        JLabel lblLeccion7=new JLabel("Mapa de México",SwingConstants.CENTER);
        lblLeccion7.setForeground(Color.black);
        lblLeccion7.setBackground(Color.white);
        lblLeccion7.setOpaque(true);
        lblLeccion7.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblLeccion7.setBounds(0,180,140,30);

        JLabel lblLeccion8=new JLabel("Animales endémicos",SwingConstants.CENTER);
        lblLeccion8.setForeground(Color.black);
        lblLeccion8.setBackground(Color.white);
        lblLeccion8.setOpaque(true);
        lblLeccion8.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblLeccion8.setBounds(0,210,140,30);

        JLabel lblLeccion9=new JLabel("Números reales",SwingConstants.CENTER);
        lblLeccion9.setForeground(Color.black);
        lblLeccion9.setBackground(Color.white);
        lblLeccion9.setOpaque(true);
        lblLeccion9.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblLeccion9.setBounds(0,240,140,30);

        JLabel lblLeccion10=new JLabel("Regla de la tortilla",SwingConstants.CENTER);
        lblLeccion10.setForeground(Color.black);
        lblLeccion10.setBackground(Color.white);
        lblLeccion10.setOpaque(true);
        lblLeccion10.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblLeccion10.setBounds(0,270,140,30);

        JLabel lblLeccion11=new JLabel("Antónimos",SwingConstants.CENTER);
        lblLeccion11.setForeground(Color.black);
        lblLeccion11.setBackground(Color.white);
        lblLeccion11.setOpaque(true);
        lblLeccion11.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblLeccion11.setBounds(0,300,140,30);

        JLabel lblLeccion12=new JLabel("Profesiones",SwingConstants.CENTER);
        lblLeccion12.setForeground(Color.black);
        lblLeccion12.setBackground(Color.white);
        lblLeccion12.setOpaque(true);
        lblLeccion12.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblLeccion12.setBounds(0,330,140,30);

        //JBUTTONS que se llaman lbl
        JButton lblSeleccionar1=new JButton("Seleccionar");
        lblSeleccionar1.setForeground(Color.black);
        lblSeleccionar1.setBackground(ventana.getAzulLabel());
        lblSeleccionar1.setOpaque(true);
        lblSeleccionar1.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblSeleccionar1.setBounds(140,0,100,30);

        JButton lblSeleccionar2=new JButton("Seleccionar");
        lblSeleccionar2.setForeground(Color.black);
        lblSeleccionar2.setBackground(ventana.getAzulLabel());
        lblSeleccionar2.setOpaque(true);
        lblSeleccionar2.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblSeleccionar2.setBounds(140,30,100,30);

        JButton lblSeleccionar3=new JButton("Seleccionar");
        lblSeleccionar3.setForeground(Color.black);
        lblSeleccionar3.setBackground(ventana.getAzulLabel());
        lblSeleccionar3.setOpaque(true);
        lblSeleccionar3.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblSeleccionar3.setBounds(140,60,100,30);

        JButton lblSeleccionar4=new JButton("Seleccionar");
        lblSeleccionar4.setForeground(Color.black);
        lblSeleccionar4.setBackground(ventana.getAzulLabel());
        lblSeleccionar4.setOpaque(true);
        lblSeleccionar4.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblSeleccionar4.setBounds(140,90,100,30);

        JButton lblSeleccionar5=new JButton("Seleccionar");
        lblSeleccionar5.setForeground(Color.black);
        lblSeleccionar5.setBackground(ventana.getAzulLabel());
        lblSeleccionar5.setOpaque(true);
        lblSeleccionar5.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblSeleccionar5.setBounds(140,120,100,30);

        JButton lblSeleccionar6=new JButton("Seleccionar");
        lblSeleccionar6.setForeground(Color.black);
        lblSeleccionar6.setBackground(ventana.getAzulLabel());
        lblSeleccionar6.setOpaque(true);
        lblSeleccionar6.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblSeleccionar6.setBounds(140,150,100,30);

        JButton lblSeleccionar7=new JButton("Seleccionar");
        lblSeleccionar7.setForeground(Color.black);
        lblSeleccionar7.setBackground(ventana.getAzulLabel());
        lblSeleccionar7.setOpaque(true);
        lblSeleccionar7.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblSeleccionar7.setBounds(140,180,100,30);

        JButton lblSeleccionar8=new JButton("Seleccionar");
        lblSeleccionar8.setForeground(Color.black);
        lblSeleccionar8.setBackground(ventana.getAzulLabel());
        lblSeleccionar8.setOpaque(true);
        lblSeleccionar8.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblSeleccionar8.setBounds(140,210,100,30);

        JButton lblSeleccionar9=new JButton("Seleccionar");
        lblSeleccionar9.setForeground(Color.black);
        lblSeleccionar9.setBackground(ventana.getAzulLabel());
        lblSeleccionar9.setOpaque(true);
        lblSeleccionar9.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblSeleccionar9.setBounds(140,240,100,30);

        JButton lblSeleccionar10=new JButton("Seleccionar");
        lblSeleccionar10.setForeground(Color.black);
        lblSeleccionar10.setBackground(ventana.getAzulLabel());
        lblSeleccionar10.setOpaque(true);
        lblSeleccionar10.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblSeleccionar10.setBounds(140,270,100,30);

        JButton lblSeleccionar11=new JButton("Seleccionar");
        lblSeleccionar11.setForeground(Color.black);
        lblSeleccionar11.setBackground(ventana.getAzulLabel());
        lblSeleccionar11.setOpaque(true);
        lblSeleccionar11.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblSeleccionar11.setBounds(140,300,100,30);

        JButton lblSeleccionar12=new JButton("Seleccionar");
        lblSeleccionar12.setForeground(Color.black);
        lblSeleccionar12.setBackground(ventana.getAzulLabel());
        lblSeleccionar12.setOpaque(true);
        lblSeleccionar12.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblSeleccionar12.setBounds(140,330,100,30);

        Font f=new Font("TimesRoman",Font.BOLD,15);
        JLabel lblSeleccionaLeccion=new JLabel("¡Selecciona una lección para comenzar a divertirnos aprendiendo!",SwingConstants.CENTER);
        lblSeleccionaLeccion.setFont(f);
        lblSeleccionaLeccion.setForeground(Color.black);
        //lblSeleccionaLeccion.setBackground(ventana.getAzulLabel();
        lblSeleccionaLeccion.setOpaque(false);
        //lblSeleccionaLeccion.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblSeleccionaLeccion.setBounds(0,270,800,30);

        JButton btnLastPanel=new JButton("Last Panel");
        btnLastPanel.setBounds(250,0,100,30);
        btnLastPanel.setForeground(Color.black);
        btnLastPanel.setBackground(ventana.getAzulLabel());
        btnLastPanel.setOpaque(true);
        btnLastPanel.setBorder(BorderFactory.createLineBorder(Color.black,2));
        btnLastPanel.addActionListener(new ActionListener() {
            //@Override
            public void actionPerformed(ActionEvent e) {
                ventana.getLayout().show(ventana.getContentPane(),"MenuPrincipalAlumno");
            }
        });

        JButton btnNextPanel=new JButton("Next Panel");
        btnNextPanel.setBounds(450,0,100,30);
        btnNextPanel.setForeground(Color.black);
        btnNextPanel.setBackground(ventana.getAzulLabel());
        btnNextPanel.setOpaque(true);
        btnNextPanel.setBorder(BorderFactory.createLineBorder(Color.black,2));
        btnNextPanel.addActionListener(new ActionListener() {
            //@Override
            public void actionPerformed(ActionEvent e) {
                ventana.getLayout().show(ventana.getContentPane(),"HacerEmparejamientos");
            }
        });

        pnlN.add(lblModoAdmin);
        pnlN.add(btnMenuPrincipal);
        pnlN.add(btnHacerLeccion);
        pnlN.add(btnConsultarLecciones);
        pnlN.add(btnCerrarSesion);
        pnlN.add(lblLecciones);
        pnlN.add(pnlScrollLecciones);
        pnlN.add(lblSeleccionaLeccion);

        pnlLecciones.add(lblLeccion1);
        pnlLecciones.add(lblLeccion2);
        pnlLecciones.add(lblLeccion3);
        pnlLecciones.add(lblLeccion4);
        pnlLecciones.add(lblLeccion5);
        pnlLecciones.add(lblLeccion6);
        pnlLecciones.add(lblLeccion7);
        pnlLecciones.add(lblLeccion8);
        pnlLecciones.add(lblLeccion9);
        pnlLecciones.add(lblLeccion10);
        pnlLecciones.add(lblLeccion11);
        pnlLecciones.add(lblLeccion12);

        pnlLecciones.add(lblSeleccionar1);
        pnlLecciones.add(lblSeleccionar2);
        pnlLecciones.add(lblSeleccionar3);
        pnlLecciones.add(lblSeleccionar4);
        pnlLecciones.add(lblSeleccionar5);
        pnlLecciones.add(lblSeleccionar6);
        pnlLecciones.add(lblSeleccionar7);
        pnlLecciones.add(lblSeleccionar8);
        pnlLecciones.add(lblSeleccionar9);
        pnlLecciones.add(lblSeleccionar10);
        pnlLecciones.add(lblSeleccionar11);
        pnlLecciones.add(lblSeleccionar12);

        pnlScrollLecciones.setViewportView(pnlLecciones);
        pnlS.add(btnLastPanel);
        pnlS.add(btnNextPanel);
        add(pnlN);
        add(pnlScrollLecciones);
        add(pnlS);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(Recursos.kidsResized,200,330,null);
    }
}



