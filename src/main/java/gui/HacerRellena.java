package gui;

        import javax.swing.*;
        import javax.swing.border.Border;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class HacerRellena extends JPanel {
    private AA_GUI ventana;

    public HacerRellena(final AA_GUI ventana){
        this.ventana=ventana;
        setLayout(null);
        setBackground(ventana.getAzulFondo());

        JPanel pnlN=new JPanel();
        JScrollPane pnlScrollC=new JScrollPane();
        JPanel pnlS=new JPanel();

        JPanel pnlC=new JPanel();
        JPanel pnlDatosCuriosos=new JPanel();
        JPanel pnlCuadro1=new JPanel();

        pnlN.setLayout(null);
        pnlS.setLayout(null);
        pnlC.setLayout(null);
        pnlDatosCuriosos.setLayout(null);
        pnlCuadro1.setLayout(null);

        pnlN.setOpaque(false);
        pnlS.setOpaque(false);
        pnlScrollC.setOpaque(false);
        pnlC.setOpaque(true);
        pnlDatosCuriosos.setOpaque(true);

        pnlN.setBounds(0,0,ventana.getWidth(),240);
        pnlScrollC.setBounds(20,240,750,360);
        pnlS.setBounds(0,615,ventana.getWidth(),70);

        pnlC.setBackground(ventana.getAzulFondo());
        pnlC.setPreferredSize(new Dimension(730,800));
        pnlDatosCuriosos.setBounds(10,420,710,130);

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

        JLabel lblTitle=new JLabel("Conociendo mi país",SwingConstants.CENTER);
        lblTitle.setForeground(ventana.getAzulLabel());
        lblTitle.setBackground(Color.white);
        lblTitle.setOpaque(true);
        lblTitle.setBorder(BorderFactory.createLineBorder(Color.black,2));
        lblTitle.setBounds(330,35,140,30);

        JLabel lblRellena=new JLabel("¡Rellena los huecos con las imágenes y textos!",SwingConstants.CENTER);
        lblRellena.setForeground(Color.black);
        lblRellena.setOpaque(false);
        lblRellena.setBounds(250,80,300,30);

        Font f=new Font("TimesRoman",Font.BOLD,20);

        JLabel lblopcion1=new JLabel("se le conoce como perro azteca",SwingConstants.CENTER);
        lblopcion1.setForeground(Color.black);
        lblopcion1.setBackground(Color.white);
        lblopcion1.setOpaque(true);
        lblopcion1.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblopcion1.setBounds(100,125,180,30);

        JLabel lblopcion2=new JLabel("El 16 de septiembre se conmemora la",SwingConstants.CENTER);
        lblopcion2.setForeground(Color.black);
        lblopcion2.setBackground(Color.white);
        lblopcion2.setOpaque(true);
        lblopcion2.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblopcion2.setBounds(370,125,220,30);

        JLabel lblopcion3=new JLabel("de México",SwingConstants.CENTER);
        lblopcion3.setForeground(Color.black);
        lblopcion3.setBackground(Color.white);
        lblopcion3.setOpaque(true);
        lblopcion3.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblopcion3.setBounds(680,125,100,30);

        JLabel lblopcion4=new JLabel("Hidalgo y costilla",SwingConstants.CENTER);
        lblopcion4.setForeground(Color.black);
        lblopcion4.setBackground(Color.white);
        lblopcion4.setOpaque(true);
        lblopcion4.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblopcion4.setBounds(100,165,180,30);

        JLabel lblopcion5=new JLabel("Xoloitzcuintle",SwingConstants.CENTER);
        lblopcion5.setForeground(Color.black);
        lblopcion5.setBackground(Color.white);
        lblopcion5.setOpaque(true);
        lblopcion5.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblopcion5.setBounds(370,165,220,30);

        JLabel lblopcion6=new JLabel("riposa",SwingConstants.CENTER);
        lblopcion6.setForeground(Color.black);
        lblopcion6.setBackground(Color.white);
        lblopcion6.setOpaque(true);
        lblopcion6.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblopcion6.setBounds(680,165,100,30);

        JLabel lblopcion7=new JLabel("independencia",SwingConstants.CENTER);
        lblopcion7.setForeground(Color.black);
        lblopcion7.setBackground(Color.white);
        lblopcion7.setOpaque(true);
        lblopcion7.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblopcion7.setBounds(100,205,180,30);

        JLabel lblopcion8=new JLabel("Ma",SwingConstants.CENTER);
        lblopcion8.setForeground(Color.black);
        lblopcion8.setBackground(Color.white);
        lblopcion8.setOpaque(true);
        lblopcion8.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblopcion8.setBounds(370,205,220,30);

        JLabel lblopcion9=new JLabel("Miguel",SwingConstants.CENTER);
        lblopcion9.setForeground(Color.black);
        lblopcion9.setBackground(Color.white);
        lblopcion9.setOpaque(true);
        lblopcion9.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblopcion9.setBounds(680,205,100,30);

        JLabel lblCuadro1=new JLabel("",SwingConstants.CENTER);
        lblCuadro1.setBackground(Color.white);
        lblCuadro1.setOpaque(true);
        lblCuadro1.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblCuadro1.setBounds(10,2,250,70);

        JLabel lblCuadro2=new JLabel("",SwingConstants.CENTER);
        lblCuadro2.setBackground(Color.white);
        lblCuadro2.setOpaque(true);
        lblCuadro2.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblCuadro2.setBounds(270,42,200,30);

        JLabel lblCuadro3=new JLabel("",SwingConstants.CENTER);
        lblCuadro3.setBackground(Color.white);
        lblCuadro3.setOpaque(true);
        lblCuadro3.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblCuadro3.setBounds(480,2,250,70);

        JLabel lblCuadro4=new JLabel("",SwingConstants.CENTER);
        lblCuadro4.setBackground(Color.white);
        lblCuadro4.setOpaque(true);
        lblCuadro4.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblCuadro4.setBounds(10,102,250,70);

        JLabel lblCuadro5=new JLabel("",SwingConstants.CENTER);
        lblCuadro5.setBackground(Color.white);
        lblCuadro5.setOpaque(true);
        lblCuadro5.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblCuadro5.setBounds(270,142,200,30);

        JLabel lblCuadro6=new JLabel("",SwingConstants.CENTER);
        lblCuadro6.setBackground(Color.white);
        lblCuadro6.setOpaque(true);
        lblCuadro6.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblCuadro6.setBounds(480,102,250,70);

        JLabel lblCuadro7=new JLabel("",SwingConstants.CENTER);
        lblCuadro7.setBackground(Color.white);
        lblCuadro7.setOpaque(true);
        lblCuadro7.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblCuadro7.setBounds(10,202,250,70);

        JLabel lblCuadro8=new JLabel("",SwingConstants.CENTER);
        lblCuadro8.setBackground(Color.white);
        lblCuadro8.setOpaque(true);
        lblCuadro8.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblCuadro8.setBounds(270,242,200,30);

        JLabel lblCuadro9=new JLabel("",SwingConstants.CENTER);
        lblCuadro9.setBackground(Color.white);
        lblCuadro9.setOpaque(true);
        lblCuadro9.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblCuadro9.setBounds(480,202,250,70);

        JLabel lblCuadro10=new JLabel("",SwingConstants.CENTER);
        lblCuadro10.setBackground(Color.white);
        lblCuadro10.setOpaque(true);
        lblCuadro10.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblCuadro10.setBounds(10,302,250,70);

        JLabel lblCuadro11=new JLabel("",SwingConstants.CENTER);
        lblCuadro11.setBackground(Color.white);
        lblCuadro11.setOpaque(true);
        lblCuadro11.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblCuadro11.setBounds(270,342,200,30);

        JLabel lblCuadro12=new JLabel("",SwingConstants.CENTER);
        lblCuadro12.setBackground(Color.white);
        lblCuadro12.setOpaque(true);
        lblCuadro12.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblCuadro12.setBounds(480,302,250,70);

        JLabel lblDatosCuriosos=new JLabel("Datos curiosos:",SwingConstants.CENTER);
        lblDatosCuriosos.setForeground(Color.white);
        lblDatosCuriosos.setBackground(ventana.getAzulLabel());
        lblDatosCuriosos.setOpaque(true);
        lblDatosCuriosos.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblDatosCuriosos.setBounds(10,390,120,30);

        JLabel lblRenglon1=new JLabel("Entre los animales autóctonos de México, se pueden encontrar: el conejo de los volcanes, xoloitzcuintle, ajolote, coralillo de");
        lblRenglon1.setForeground(Color.black);
        lblRenglon1.setBounds(0,0,710,20);

        JLabel lblRenglon2=new JLabel("balsas, tortuga de desierto y la serpiente de cascabel pigmea por mencionar algunos.");
        lblRenglon2.setForeground(Color.black);
        lblRenglon2.setBounds(2,20,710,20);

        JLabel lblRenglon3=new JLabel("México alberga uno de los santuarios de mariposa Monarca más importantes, considerándolo como segunda casa.");
        lblRenglon3.setForeground(Color.black);
        lblRenglon3.setBounds(2,40,710,20);

        JLabel lblRenglon4=new JLabel("Miguel Hidalgo no tocó la 'Campana de la Independencia', quien realmente se encargó de esta tarea durante la madrugada del");
        lblRenglon4.setForeground(Color.black);
        lblRenglon4.setBounds(2,60,710,20);

        JLabel lblRenglon5=new JLabel("16 de septiembre fue José Galván, el campanero de la parroquia, mientras Hidalgo llamaba desde la entrada de la parroquia");
        lblRenglon5.setForeground(Color.black);
        lblRenglon5.setBounds(2,80,710,20);

        JLabel lblRenglon6=new JLabel("a toda la población.");
        lblRenglon6.setForeground(Color.black);
        lblRenglon6.setBounds(2,100,710,20);

        JLabel lblDudasComentarios=new JLabel("Dudas o comentarios:",SwingConstants.CENTER);
        lblDudasComentarios.setForeground(Color.white);
        lblDudasComentarios.setBackground(ventana.getAzulLabel());
        lblDudasComentarios.setOpaque(true);
        lblDudasComentarios.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblDudasComentarios.setBounds(10,565,140,30);

        JTextArea txtaAlumnosComentarios=new JTextArea("Por favor comparte tus dudas.");
        txtaAlumnosComentarios.setForeground(Color.black);
        txtaAlumnosComentarios.setBounds(10,595,710,120);
        txtaAlumnosComentarios.setBorder(BorderFactory.createLineBorder(ventana.getAzulLabel(),2));

        JButton btnGuardarEntregar=new JButton("Guardar y entregar lección");
        btnGuardarEntregar.setBounds(275,730,160,30);
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
                ventana.getLayout().show(ventana.getContentPane(),"HacerRompecabezas");
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
                ventana.getLayout().show(ventana.getContentPane(),"IniciaSesion");
            }
        });

        pnlN.add(lblModoAdmin);
        pnlN.add(btnMenuPrincipal);
        pnlN.add(btnHacerLeccion);
        pnlN.add(btnConsultarLecciones);
        pnlN.add(btnCerrarSesion);
        pnlN.add(lblTitle);
        pnlN.add(lblRellena);
        pnlN.add(lblopcion1);
        pnlN.add(lblopcion2);
        pnlN.add(lblopcion3);
        pnlN.add(lblopcion4);
        pnlN.add(lblopcion5);
        pnlN.add(lblopcion6);
        pnlN.add(lblopcion7);
        pnlN.add(lblopcion8);
        pnlN.add(lblopcion9);

        pnlC.add(lblCuadro1);
        pnlC.add(lblCuadro2);
        pnlC.add(lblCuadro3);
        pnlC.add(lblCuadro4);
        pnlC.add(lblCuadro5);
        pnlC.add(lblCuadro6);
        pnlC.add(lblCuadro7);
        pnlC.add(lblCuadro8);
        pnlC.add(lblCuadro9);
        pnlC.add(lblCuadro10);
        pnlC.add(lblCuadro11);
        pnlC.add(lblCuadro12);

        pnlC.add(lblDatosCuriosos);
        pnlC.add(pnlDatosCuriosos);
        pnlC.add(lblDudasComentarios);
        pnlC.add(txtaAlumnosComentarios);
        pnlC.add(btnGuardarEntregar);

        pnlDatosCuriosos.add(lblRenglon1);
        pnlDatosCuriosos.add(lblRenglon2);
        pnlDatosCuriosos.add(lblRenglon3);
        pnlDatosCuriosos.add(lblRenglon4);
        pnlDatosCuriosos.add(lblRenglon5);
        pnlDatosCuriosos.add(lblRenglon6);

        pnlScrollC.setViewportView(pnlC);
        pnlS.add(btnLastPanel);
        pnlS.add(btnNextPanel);
        add(pnlN);
        add(pnlScrollC);
        add(pnlS);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d=(Graphics2D) g;
        //g2d.setColor(Color.black);
        //g2d.drawRect(420,216,133,88);
        g.drawImage(Recursos.miguelHidalgoResized,20,145,70,70,null);
        g.drawImage(Recursos.mariposaMonarcaResized,290,145,70,70,null);
        g.drawImage(Recursos.xoloResized,600,145,70,70,null);

    }
}




