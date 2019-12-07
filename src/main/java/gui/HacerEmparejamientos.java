package gui;

        import javax.swing.*;
        import javax.swing.border.Border;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class HacerEmparejamientos extends JPanel {
    private AA_GUI ventana;

    public HacerEmparejamientos(final AA_GUI ventana){
        this.ventana=ventana;
        setLayout(null);
        setBackground(ventana.getAzulFondo());

        JPanel pnlN=new JPanel();
        JPanel pnlS=new JPanel();
        JPanel pnlE=new JPanel();
        JPanel pnlW=new JPanel();
        JPanel pnlDatosCuriosos=new JPanel();
        JPanel pnlCuadro1=new JPanel();
        JPanel pnlCuadro2=new JPanel();
        JPanel pnlCuadro3=new JPanel();
        JPanel pnlCuadro4=new JPanel();

        pnlN.setLayout(null);
        pnlE.setLayout(null);
        pnlW.setLayout(null);
        pnlS.setLayout(null);
        pnlDatosCuriosos.setLayout(null);
        pnlCuadro1.setLayout(null);
        pnlCuadro2.setLayout(null);
        pnlCuadro3.setLayout(null);
        pnlCuadro4.setLayout(null);

        pnlN.setOpaque(false);
        pnlS.setOpaque(false);
        pnlE.setOpaque(false);
        pnlW.setOpaque(false);
        pnlDatosCuriosos.setOpaque(true);
        pnlCuadro1.setOpaque(true);
        pnlCuadro2.setOpaque(true);
        pnlCuadro3.setOpaque(true);
        pnlCuadro4.setOpaque(true);

        pnlN.setBounds(0,0,ventana.getWidth(),120);
        pnlW.setBounds(0,120,455,480);
        pnlE.setBounds(455,120,345,480);
        pnlS.setBounds(0,615,ventana.getWidth(),70);
        pnlDatosCuriosos.setBounds(0,30,320,200);
        pnlCuadro1.setBounds(175,300,70,70);
        pnlCuadro2.setBounds(345,300,70,70);
        pnlCuadro3.setBounds(90,380,70,70);
        pnlCuadro4.setBounds(345,380,70,70);

        pnlCuadro1.setBackground(Color.white);
        pnlCuadro2.setBackground(Color.black);
        pnlCuadro3.setBackground(Color.white);
        pnlCuadro4.setBackground(Color.white);
        pnlDatosCuriosos.setBorder(BorderFactory.createLineBorder(ventana.getAzulLabel(),2));
        pnlDatosCuriosos.setBackground(Color.white);

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

        JLabel lblTitle=new JLabel("Antónimos",SwingConstants.CENTER);
        lblTitle.setForeground(ventana.getAzulLabel());
        lblTitle.setBackground(Color.white);
        lblTitle.setOpaque(true);
        lblTitle.setBorder(BorderFactory.createLineBorder(Color.black,2));
        lblTitle.setBounds(330,35,140,30);

        JLabel lblEmparejaElementos=new JLabel("¡Empareja los elementos!",SwingConstants.CENTER);
        lblEmparejaElementos.setForeground(Color.black);
        lblEmparejaElementos.setOpaque(false);
        lblEmparejaElementos.setBounds(320,80,160,30);

        Font f=new Font("TimesRoman",Font.BOLD,20);
        //FLECHAS
        JLabel lblFlecha1=new JLabel("------------------------------>",SwingConstants.CENTER);
        lblFlecha1.setFont(f);
        lblFlecha1.setForeground(ventana.getRojoADS());
        lblFlecha1.setOpaque(false);
        lblFlecha1.setBounds(135,20,210,30);

        JLabel lblFlecha2=new JLabel("------------------------------>",SwingConstants.CENTER);
        lblFlecha2.setFont(f);
        lblFlecha2.setForeground(ventana.getRojoADS());
        lblFlecha2.setOpaque(false);
        lblFlecha2.setBounds(135,90,210,30);

        JLabel lblFlecha3=new JLabel("------------------------------>",SwingConstants.CENTER);
        lblFlecha3.setFont(f);
        lblFlecha3.setForeground(ventana.getRojoADS());
        lblFlecha3.setOpaque(false);
        lblFlecha3.setBounds(135,160,210,30);

        JLabel lblFlecha4=new JLabel("------------------------------>",SwingConstants.CENTER);
        lblFlecha4.setFont(f);
        lblFlecha4.setForeground(ventana.getRojoADS());
        lblFlecha4.setOpaque(false);
        lblFlecha4.setBounds(135,230,210,30);

        JLabel lblDatosCuriosos=new JLabel("Datos curiosos:",SwingConstants.CENTER);
        lblDatosCuriosos.setForeground(Color.white);
        lblDatosCuriosos.setBackground(ventana.getAzulLabel());
        lblDatosCuriosos.setOpaque(true);
        lblDatosCuriosos.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblDatosCuriosos.setBounds(0,0,120,30);

        JLabel lblRenglon1=new JLabel("El antónimo de 'Deja Vu' es 'Jamais Vu'.");
        lblRenglon1.setForeground(Color.black);
        lblRenglon1.setBounds(2,0,310,20);

        JLabel lblRenglon2=new JLabel("Como probablemente ya sabes, un Deja Vu es una ex-");
        lblRenglon2.setForeground(Color.black);
        lblRenglon2.setBounds(2,20,310,20);

        JLabel lblRenglon3=new JLabel("traña sensación de familiaridad con una experiencia no");
        lblRenglon3.setForeground(Color.black);
        lblRenglon3.setBounds(2,40,310,20);

        JLabel lblRenglon4=new JLabel("familiar. La sensación contraria también es posible y");
        lblRenglon4.setForeground(Color.black);
        lblRenglon4.setBounds(2,60,310,20);

        JLabel lblRenglon5=new JLabel("tiene un nombre: Jamais Vu.");
        lblRenglon5.setForeground(Color.black);
        lblRenglon5.setBounds(2,80,310,20);

        JLabel lblRenglon6=new JLabel("Esto significa 'Nunca visto' en francés, se refiere a");
        lblRenglon6.setForeground(Color.black);
        lblRenglon6.setBounds(2,100,310,20);

        JLabel lblRenglon7=new JLabel("cuando una persona no puede recordar temporalmen-");
        lblRenglon7.setForeground(Color.black);
        lblRenglon7.setBounds(2,120,310,20);

        JLabel lblRenglon8=new JLabel("te algo con lo que está familiarizado. Un ejemplo de es-");
        lblRenglon8.setForeground(Color.black);
        lblRenglon8.setBounds(2,140,310,20);

        JLabel lblRenglon9=new JLabel("te fenómeno es cuando una persona no puede recordar");
        lblRenglon9.setForeground(Color.black);
        lblRenglon9.setBounds(2,160,310,20);

        JLabel lblRenglon10=new JLabel("una palabra de uso común.");
        lblRenglon10.setForeground(Color.black);
        lblRenglon10.setBounds(2,180,310,20);

        JLabel lblDudasComentarios=new JLabel("Dudas o comentarios:",SwingConstants.CENTER);
        lblDudasComentarios.setForeground(Color.white);
        lblDudasComentarios.setBackground(ventana.getAzulLabel());
        lblDudasComentarios.setOpaque(true);
        lblDudasComentarios.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblDudasComentarios.setBounds(0,235,140,30);

        JTextArea txtaAlumnosComentarios=new JTextArea("Por favor comparte tus dudas.");
        txtaAlumnosComentarios.setForeground(Color.black);
        txtaAlumnosComentarios.setBounds(0,265,320,170);
        txtaAlumnosComentarios.setBorder(BorderFactory.createLineBorder(ventana.getAzulLabel(),2));

        JButton btnGuardarEntregar=new JButton("Guardar y entregar lección");
        btnGuardarEntregar.setBounds(90,440,160,30);
        btnGuardarEntregar.setForeground(Color.black);
        btnGuardarEntregar.setBackground(ventana.getAzulLabel());
        btnGuardarEntregar.setOpaque(true);
        btnGuardarEntregar.setBorder(BorderFactory.createLineBorder(Color.black,2));

        JLabel lblFrio=new JLabel("Frío",SwingConstants.CENTER);
        lblFrio.setForeground(Color.black);
        lblFrio.setOpaque(false);
        lblFrio.setBounds(0,20,70,30);

        JLabel lblCalor=new JLabel("Calor",SwingConstants.CENTER);
        lblCalor.setForeground(Color.black);
        lblCalor.setOpaque(false);
        lblCalor.setBounds(0,20,70,30);

        JButton btnLastPanel=new JButton("Last Panel");
        btnLastPanel.setBounds(250,0,100,30);
        btnLastPanel.setForeground(Color.black);
        btnLastPanel.setBackground(ventana.getAzulLabel());
        btnLastPanel.setOpaque(true);
        btnLastPanel.setBorder(BorderFactory.createLineBorder(Color.black,2));
        btnLastPanel.addActionListener(new ActionListener() {
            //@Override
            public void actionPerformed(ActionEvent e) {
                ventana.getLayout().show(ventana.getContentPane(),"HacerLeccion");
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
                ventana.getLayout().show(ventana.getContentPane(),"HacerRompecabezas");
            }
        });

        pnlN.add(lblModoAdmin);
        pnlN.add(btnMenuPrincipal);
        pnlN.add(btnHacerLeccion);
        pnlN.add(btnConsultarLecciones);
        pnlN.add(btnCerrarSesion);
        pnlN.add(lblTitle);
        pnlN.add(lblEmparejaElementos);

        pnlW.add(lblFlecha1);
        pnlW.add(lblFlecha2);
        pnlW.add(lblFlecha3);
        pnlW.add(lblFlecha4);
        pnlW.add(pnlCuadro1);
        pnlW.add(pnlCuadro2);
        pnlW.add(pnlCuadro3);
        pnlW.add(pnlCuadro4);

        pnlCuadro1.add(lblFrio);
        pnlCuadro4.add(lblCalor);

        pnlE.add(lblDatosCuriosos);
        pnlE.add(pnlDatosCuriosos);
        pnlE.add(lblDudasComentarios);
        pnlE.add(txtaAlumnosComentarios);
        pnlE.add(btnGuardarEntregar);

        pnlDatosCuriosos.add(lblRenglon1);
        pnlDatosCuriosos.add(lblRenglon2);
        pnlDatosCuriosos.add(lblRenglon3);
        pnlDatosCuriosos.add(lblRenglon4);
        pnlDatosCuriosos.add(lblRenglon5);
        pnlDatosCuriosos.add(lblRenglon6);
        pnlDatosCuriosos.add(lblRenglon7);
        pnlDatosCuriosos.add(lblRenglon8);
        pnlDatosCuriosos.add(lblRenglon9);
        pnlDatosCuriosos.add(lblRenglon10);

        pnlS.add(btnLastPanel);
        pnlS.add(btnNextPanel);
        add(pnlN);
        add(pnlW);
        add(pnlE);
        add(pnlS);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d=(Graphics2D) g;
        g2d.setColor(Color.white);
        g2d.fillRect(45,120,70,280);
        g2d.fillRect(365,120,70,280);
        g2d.setColor(Color.black);
        g2d.drawRect(45,120,70,70);
        g2d.drawRect(45,190,70,70);
        g2d.drawRect(45,260,70,70);
        g2d.drawRect(45,330,70,70);
        g2d.drawRect(365,120,70,70);
        g2d.drawRect(365,190,70,70);
        g2d.drawRect(365,260,70,70);
        g2d.drawRect(365,330,70,70);

        //1
        g.drawImage(Recursos.perroResized,90,420,70,70,null);
        //2
        //g2d.setColor(Color.black);
        //g2d.fillRect(175,420,70,70);
        //3
        g.drawImage(Recursos.dentroResized,260,420,70,70,null);
        //4
        //g2d.setColor(Color.white);
        //g2d.fillRect(345,420,70,70);

        //5
        //g2d.setColor(Color.white);
        //g2d.fillRect(90,500,70,70);
        //6
        g.drawImage(Recursos.gatoResized,175,500,70,70,null);
        //7
        g.drawImage(Recursos.fueraResized,260,500,70,70,null);
        //8
        //g2d.setColor(Color.white);
        //g2d.fillRect(345,500,70,70);
        //g.drawImage(Recursos.Leccion_AResized,150,70,null);
        //g.drawImage(Recursos.Leccion_BResized,350,70,null);
        //g.drawImage(Recursos.Leccion_CResized,550,70,null);


    }
}



