package gui;

        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class MenuPrincipalAlumno extends JPanel {
    private AA_GUI ventana;

    public MenuPrincipalAlumno(final AA_GUI ventana){
        this.ventana=ventana;
        setLayout(null);
        setBackground(ventana.getAzulFondo());

        JPanel pnlN=new JPanel();
        JPanel pnlS=new JPanel();
        JScrollPane pnlScrollC=new JScrollPane();
        JPanel pnlC=new JPanel();
        JPanel pnlAviso1=new JPanel();
        JPanel pnlAviso2=new JPanel();

        pnlN.setLayout(null);
        pnlC.setLayout(null);
        pnlS.setLayout(null);
        pnlAviso1.setLayout(null);
        pnlAviso2.setLayout(null);

        pnlN.setOpaque(false);
        pnlS.setOpaque(false);
        pnlScrollC.setOpaque(false);
        pnlC.setOpaque(false);
        pnlAviso1.setOpaque(true);
        pnlAviso2.setOpaque(true);

        pnlN.setBounds(0,0,ventana.getWidth(),220);
        pnlScrollC.setBounds(20,230,750,370);
        pnlS.setBounds(0,615,ventana.getWidth(),70);
        pnlC.setPreferredSize(new Dimension(730,440));
        pnlAviso1.setBounds(0,0,732,220);
        pnlAviso1.setBorder(BorderFactory.createLineBorder(Color.black,2));
        pnlAviso2.setBounds(0,220,732,220);
        pnlAviso2.setBorder(BorderFactory.createLineBorder(Color.black,2));
        pnlAviso1.setBackground(Color.white);
        pnlAviso2.setBackground(Color.white);
        JLabel lblModoAdmin=new JLabel("");
        lblModoAdmin.setBorder(BorderFactory.createLineBorder(Color.black,2));
        lblModoAdmin.setBounds(0,0,800,30);

        JButton btnMenuPrincipal=new JButton("Menú Principal");
        btnMenuPrincipal.setForeground(Color.white);
        btnMenuPrincipal.setBackground(ventana.getVerdeADS());
        btnMenuPrincipal.setOpaque(true);
        btnMenuPrincipal.setBorder(BorderFactory.createLineBorder(Color.black,2));
        btnMenuPrincipal.setBounds(0,0,100,30);

        JButton btnHacerLeccion=new JButton("Hacer Lección");
        btnHacerLeccion.setForeground(Color.black);
        btnHacerLeccion.setBackground(Color.white);
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

        JLabel lblPerfil=new JLabel("Perfil",SwingConstants.CENTER);
        lblPerfil.setForeground(Color.white);
        lblPerfil.setBackground(ventana.getAzulLabel());
        lblPerfil.setOpaque(true);
        lblPerfil.setBorder(BorderFactory.createLineBorder(Color.black,2));
        lblPerfil.setBounds(350,35,100,30);

        JLabel lblNombre=new JLabel("Nombre:",SwingConstants.CENTER);
        lblNombre.setForeground(Color.white);
        lblNombre.setBackground(ventana.getAzulLabel());
        lblNombre.setOpaque(true);
        lblNombre.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblNombre.setBounds(40,80,100,30);

        JLabel lblAlumnoNombre=new JLabel("Miguel Saavedra",SwingConstants.CENTER);
        lblAlumnoNombre.setForeground(Color.black);
        lblAlumnoNombre.setBackground(Color.white);
        lblAlumnoNombre.setOpaque(true);
        lblAlumnoNombre.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblAlumnoNombre.setBounds(140,80,120,30);

        JLabel lblNombreUsuario=new JLabel("Nombre de usuario:",SwingConstants.CENTER);
        lblNombreUsuario.setForeground(Color.white);
        lblNombreUsuario.setBackground(ventana.getAzulLabel());
        lblNombreUsuario.setOpaque(true);
        lblNombreUsuario.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblNombreUsuario.setBounds(520,80,120,30);

        JLabel lblAlumnoNombreUsuario=new JLabel("Miguelingui2010",SwingConstants.CENTER);
        lblAlumnoNombreUsuario.setForeground(Color.black);
        lblAlumnoNombreUsuario.setBackground(Color.white);
        lblAlumnoNombreUsuario.setOpaque(true);
        lblAlumnoNombreUsuario.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblAlumnoNombreUsuario.setBounds(640,80,120,30);

        JLabel lblGrupo=new JLabel("Grupo:",SwingConstants.CENTER);
        lblGrupo.setForeground(Color.white);
        lblGrupo.setBackground(ventana.getAzulLabel());
        lblGrupo.setOpaque(true);
        lblGrupo.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblGrupo.setBounds(40,125,60,30);

        JLabel lblAlumnoGrupo=new JLabel("3A",SwingConstants.CENTER);
        lblAlumnoGrupo.setForeground(Color.black);
        lblAlumnoGrupo.setBackground(Color.white);
        lblAlumnoGrupo.setOpaque(true);
        lblAlumnoGrupo.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblAlumnoGrupo.setBounds(100,125,40,30);

        JLabel lblMaestros=new JLabel("Maestros:",SwingConstants.CENTER);
        lblMaestros.setForeground(Color.white);
        lblMaestros.setBackground(ventana.getAzulLabel());
        lblMaestros.setOpaque(true);
        lblMaestros.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblMaestros.setBounds(560,125,80,30);

        JLabel lblAlumnoMaestros=new JLabel("Mauricio Sánchez",SwingConstants.CENTER);
        lblAlumnoMaestros.setForeground(Color.black);
        lblAlumnoMaestros.setBackground(Color.white);
        lblAlumnoMaestros.setOpaque(true);
        lblAlumnoMaestros.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblAlumnoMaestros.setBounds(640,125,120,30);

        JLabel lblAvisos=new JLabel("Avisos",SwingConstants.CENTER);
        lblAvisos.setForeground(Color.white);
        lblAvisos.setBackground(ventana.getAzulLabel());
        lblAvisos.setOpaque(true);
        lblAvisos.setBorder(BorderFactory.createLineBorder(Color.black,2));
        lblAvisos.setBounds(350,170,100,30);

        //PNL AVISOS
        //PNL AVISO1
        JLabel lblA1DeBlue=new JLabel("Maestro:",SwingConstants.CENTER);
        lblA1DeBlue.setForeground(Color.white);
        lblA1DeBlue.setBackground(ventana.getAzulLabel());
        lblA1DeBlue.setOpaque(true);
        lblA1DeBlue.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblA1DeBlue.setBounds(2,2,80,30);

        JLabel lblA1DeWhite=new JLabel("Mauricio Sánchez",SwingConstants.CENTER);
        lblA1DeWhite.setForeground(Color.black);
        lblA1DeWhite.setBackground(Color.white);
        lblA1DeWhite.setOpaque(true);
        lblA1DeWhite.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblA1DeWhite.setBounds(82,2,120,30);

        JLabel lblA1FechaBlue=new JLabel("Fecha:",SwingConstants.CENTER);
        lblA1FechaBlue.setForeground(Color.white);
        lblA1FechaBlue.setBackground(ventana.getAzulLabel());
        lblA1FechaBlue.setOpaque(true);
        lblA1FechaBlue.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblA1FechaBlue.setBounds(530,2,80,30);

        JLabel lblA1FechaWhite=new JLabel("Noviembre 08, 2019",SwingConstants.CENTER);
        lblA1FechaWhite.setForeground(Color.black);
        lblA1FechaWhite.setBackground(Color.white);
        lblA1FechaWhite.setOpaque(true);
        lblA1FechaWhite.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblA1FechaWhite.setBounds(610,2,120,30);

        JLabel lblA1AsuntoBlue=new JLabel("Asunto:",SwingConstants.CENTER);
        lblA1AsuntoBlue.setForeground(Color.white);
        lblA1AsuntoBlue.setBackground(ventana.getAzulLabel());
        lblA1AsuntoBlue.setOpaque(true);
        lblA1AsuntoBlue.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblA1AsuntoBlue.setBounds(2,32,80,30);

        JLabel lblA1AsuntoWhite=new JLabel("Lección sobre planetas",SwingConstants.CENTER);
        lblA1AsuntoWhite.setForeground(Color.black);
        lblA1AsuntoWhite.setBackground(Color.white);
        lblA1AsuntoWhite.setOpaque(true);
        lblA1AsuntoWhite.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblA1AsuntoWhite.setBounds(82,32,140,30);

        JLabel lblA1Renglon1=new JLabel("Muy buenos días, alumnos.");
        lblA1Renglon1.setForeground(Color.black);
        lblA1Renglon1.setBackground(Color.white);
        lblA1Renglon1.setOpaque(true);
        lblA1Renglon1.setBounds(2,62,728,30);

        JLabel lblA1Renglon2=new JLabel("El lunes les activaré  la lección de los planetas de nuestro sistema solar. Por favor repasen con sus padres como vimos en clase,");
        lblA1Renglon2.setForeground(Color.black);
        lblA1Renglon2.setBackground(Color.white);
        lblA1Renglon2.setOpaque(true);
        lblA1Renglon2.setBounds(2,92,728,30);

        JLabel lblA1Renglon3=new JLabel("por orden de cercanía al sol con la canción que practicamos. Nos vemos pronto. Quedo a su disposición en la sección de dudas");
        lblA1Renglon3.setForeground(Color.black);
        lblA1Renglon3.setBackground(Color.white);
        lblA1Renglon3.setOpaque(true);
        lblA1Renglon3.setBounds(2,122,728,30);

        JLabel lblA1Renglon4=new JLabel(" y comentarios. Saludos y feliz fin de semana.");
        lblA1Renglon4.setForeground(Color.black);
        lblA1Renglon4.setBackground(Color.white);
        lblA1Renglon4.setOpaque(true);
        lblA1Renglon4.setBounds(2,152,728,30);

        JLabel lblA1Renglon5=new JLabel("P.D: No olviden leer la sección de Datos Curiosos de la lección.");
        lblA1Renglon5.setForeground(Color.black);
        lblA1Renglon5.setBackground(Color.white);
        lblA1Renglon5.setOpaque(true);
        lblA1Renglon5.setBounds(2,182,728,30);

        //PNL AVISO2
        JLabel lblA2DeBlue=new JLabel("Maestro:",SwingConstants.CENTER);
        lblA2DeBlue.setForeground(Color.white);
        lblA2DeBlue.setBackground(ventana.getAzulLabel());
        lblA2DeBlue.setOpaque(true);
        lblA2DeBlue.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblA2DeBlue.setBounds(2,2,80,30);

        JLabel lblA2DeWhite=new JLabel("Mauricio Sánchez",SwingConstants.CENTER);
        lblA2DeWhite.setForeground(Color.black);
        lblA2DeWhite.setBackground(Color.white);
        lblA2DeWhite.setOpaque(true);
        lblA2DeWhite.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblA2DeWhite.setBounds(82,2,120,30);

        JLabel lblA2FechaBlue=new JLabel("Fecha:",SwingConstants.CENTER);
        lblA2FechaBlue.setForeground(Color.white);
        lblA2FechaBlue.setBackground(ventana.getAzulLabel());
        lblA2FechaBlue.setOpaque(true);
        lblA2FechaBlue.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblA2FechaBlue.setBounds(530,2,80,30);

        JLabel lblA2FechaWhite=new JLabel("Octubre 31, 2019",SwingConstants.CENTER);
        lblA2FechaWhite.setForeground(Color.black);
        lblA2FechaWhite.setBackground(Color.white);
        lblA2FechaWhite.setOpaque(true);
        lblA2FechaWhite.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblA2FechaWhite.setBounds(610,2,120,30);

        JLabel lblA2AsuntoBlue=new JLabel("Asunto:",SwingConstants.CENTER);
        lblA2AsuntoBlue.setForeground(Color.white);
        lblA2AsuntoBlue.setBackground(ventana.getAzulLabel());
        lblA2AsuntoBlue.setOpaque(true);
        lblA2AsuntoBlue.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblA2AsuntoBlue.setBounds(2,32,80,30);

        JLabel lblA2AsuntoWhite=new JLabel("Lección sobre festividades",SwingConstants.CENTER);
        lblA2AsuntoWhite.setForeground(Color.black);
        lblA2AsuntoWhite.setBackground(Color.white);
        lblA2AsuntoWhite.setOpaque(true);
        lblA2AsuntoWhite.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblA2AsuntoWhite.setBounds(82,32,160,30);

        JLabel lblA2Renglon1=new JLabel("Feliz Halloween, queridos alumnos.");
        lblA2Renglon1.setForeground(Color.black);
        lblA2Renglon1.setBackground(Color.white);
        lblA2Renglon1.setOpaque(true);
        lblA2Renglon1.setBounds(2,62,728,30);

        JLabel lblA2Renglon2=new JLabel("Mañana subiré la lección sobre festividades típicas de esta época y espero sepan responder con lo visto en clase y con el apoyo");
        lblA2Renglon2.setForeground(Color.black);
        lblA2Renglon2.setBackground(Color.white);
        lblA2Renglon2.setOpaque(true);
        lblA2Renglon2.setBounds(2,92,728,30);

        JLabel lblA2Renglon3=new JLabel("de sus familiares o conocidos. Hoy se celebró Halloween y el sábado se celebrará el Día de los Muertos. Dos festividades que");
        lblA2Renglon3.setForeground(Color.black);
        lblA2Renglon3.setBackground(Color.white);
        lblA2Renglon3.setOpaque(true);
        lblA2Renglon3.setBounds(2,122,728,30);

        JLabel lblA2Renglon4=new JLabel("en la frontera podemos celebrar sin problemas. Felices fiestas, disfruten el fin de semana.");
        lblA2Renglon4.setForeground(Color.black);
        lblA2Renglon4.setBackground(Color.white);
        lblA2Renglon4.setOpaque(true);
        lblA2Renglon4.setBounds(2,152,728,30);

        JLabel lblA2Renglon5=new JLabel("P.D: No olviden leer la sección de Datos Curiosos de la lección y comentar dudas si llegan a tener..");
        lblA2Renglon5.setForeground(Color.black);
        lblA2Renglon5.setBackground(Color.white);
        lblA2Renglon5.setOpaque(true);
        lblA2Renglon5.setBounds(2,182,728,30);

        JButton btnLastPanel=new JButton("Last Panel");
        btnLastPanel.setBounds(250,0,100,30);
        btnLastPanel.setForeground(Color.black);
        btnLastPanel.setBackground(ventana.getAzulLabel());
        btnLastPanel.setOpaque(true);
        btnLastPanel.setBorder(BorderFactory.createLineBorder(Color.black,2));
        btnLastPanel.addActionListener(new ActionListener() {
            //@Override
            public void actionPerformed(ActionEvent e) {
                ventana.getLayout().show(ventana.getContentPane(),"CrearRellena");
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
                ventana.getLayout().show(ventana.getContentPane(),"HacerLeccion");
            }
        });

        pnlN.add(lblModoAdmin);
        pnlN.add(btnMenuPrincipal);
        pnlN.add(btnHacerLeccion);
        pnlN.add(btnConsultarLecciones);
        pnlN.add(btnCerrarSesion);
        pnlN.add(lblPerfil);
        pnlN.add(lblNombre);
        pnlN.add(lblAlumnoNombre);
        pnlN.add(lblNombreUsuario);
        pnlN.add(lblAlumnoNombreUsuario);
        pnlN.add(lblGrupo);
        pnlN.add(lblAlumnoGrupo);
        pnlN.add(lblMaestros);
        pnlN.add(lblAlumnoMaestros);
        pnlN.add(lblAvisos);

        pnlC.add(pnlAviso1);
        pnlC.add(pnlAviso2);

        pnlAviso1.add(lblA1DeBlue);
        pnlAviso1.add(lblA1DeWhite);
        pnlAviso1.add(lblA1FechaBlue);
        pnlAviso1.add(lblA1FechaWhite);
        pnlAviso1.add(lblA1AsuntoBlue);
        pnlAviso1.add(lblA1AsuntoWhite);
        pnlAviso1.add(lblA1Renglon1);
        pnlAviso1.add(lblA1Renglon2);
        pnlAviso1.add(lblA1Renglon3);
        pnlAviso1.add(lblA1Renglon4);
        pnlAviso1.add(lblA1Renglon5);

        pnlAviso2.add(lblA2DeBlue);
        pnlAviso2.add(lblA2DeWhite);
        pnlAviso2.add(lblA2FechaBlue);
        pnlAviso2.add(lblA2FechaWhite);
        pnlAviso2.add(lblA2AsuntoBlue);
        pnlAviso2.add(lblA2AsuntoWhite);
        pnlAviso2.add(lblA2Renglon1);
        pnlAviso2.add(lblA2Renglon2);
        pnlAviso2.add(lblA2Renglon3);
        pnlAviso2.add(lblA2Renglon4);
        pnlAviso2.add(lblA2Renglon5);

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
        //g.drawImage(Recursos.Leccion_AResized,150,70,null);
        //g.drawImage(Recursos.Leccion_BResized,350,70,null);
        //g.drawImage(Recursos.Leccion_CResized,550,70,null);
    }
}



