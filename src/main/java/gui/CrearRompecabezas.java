
package gui;

        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class CrearRompecabezas extends JPanel {
    private AA_GUI ventana;

    public CrearRompecabezas(final AA_GUI ventana){
        this.ventana=ventana;
        setLayout(null);
        setBackground(ventana.getAzulFondo());

        JPanel pnlN=new JPanel();
        JPanel pnlS=new JPanel();
        JPanel pnlC=new JPanel();

        pnlN.setLayout(null);
        pnlC.setLayout(null);
        pnlS.setLayout(null);

        pnlN.setOpaque(false);
        pnlS.setOpaque(false);
        pnlC.setOpaque(false);

        pnlN.setBounds(0,0,ventana.getWidth(),220);
        pnlC.setBounds(0,220,ventana.getWidth(),385);
        pnlS.setBounds(0,615,ventana.getWidth(),70);

        JLabel lblModoAdmin=new JLabel("");
        lblModoAdmin.setBorder(BorderFactory.createLineBorder(Color.black,2));
        lblModoAdmin.setBounds(0,0,800,30);

        JButton btnMenuPrincipal=new JButton("Menú Principal");
        btnMenuPrincipal.setForeground(Color.black);
        btnMenuPrincipal.setBackground(Color.white);
        btnMenuPrincipal.setOpaque(true);
        btnMenuPrincipal.setBorder(BorderFactory.createLineBorder(Color.black,2));
        btnMenuPrincipal.setBounds(0,0,100,30);

        JButton btnCrearLeccion=new JButton("Crear Lección");
        btnCrearLeccion.setForeground(Color.white);
        btnCrearLeccion.setBackground(ventana.getVerdeADS());
        btnCrearLeccion.setOpaque(true);
        btnCrearLeccion.setBorder(BorderFactory.createLineBorder(Color.black,2));
        btnCrearLeccion.setBounds(100,0,100,30);

        JButton btnEditarLeccion=new JButton("Editar Lección");
        btnEditarLeccion.setForeground(Color.black);
        btnEditarLeccion.setBackground(Color.white);
        btnEditarLeccion.setOpaque(true);
        btnEditarLeccion.setBorder(BorderFactory.createLineBorder(Color.black,2));
        btnEditarLeccion.setBounds(200,0,100,30);

        JButton btnConsultarLeccion=new JButton("Consultar Lección");
        btnConsultarLeccion.setForeground(Color.black);
        btnConsultarLeccion.setBackground(Color.white);
        btnConsultarLeccion.setOpaque(true);
        btnConsultarLeccion.setBorder(BorderFactory.createLineBorder(Color.black,2));
        btnConsultarLeccion.setBounds(300,0,130,30);

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

        JButton btnEmparejamientos=new JButton("Emparejamientos");
        btnEmparejamientos.setForeground(Color.black);
        btnEmparejamientos.setBackground(Color.white);
        btnEmparejamientos.setOpaque(true);
        btnEmparejamientos.setBorder(BorderFactory.createLineBorder(Color.black,2));
        btnEmparejamientos.setBounds(140,175,120,30);

        JButton btnRompecabezas=new JButton("Rompecabezas");
        btnRompecabezas.setForeground(Color.black);
        btnRompecabezas.setBackground(ventana.getVerdeADS());
        btnRompecabezas.setOpaque(true);
        btnRompecabezas.setBorder(BorderFactory.createLineBorder(Color.black,2));
        btnRompecabezas.setBounds(350,175,100,30);

        JButton btnRellena=new JButton("Rellena");
        btnRellena.setForeground(Color.black);
        btnRellena.setBackground(Color.white);
        btnRellena.setOpaque(true);
        btnRellena.setBorder(BorderFactory.createLineBorder(Color.black,2));
        btnRellena.setBounds(550,175,100,30);

        JLabel lblRompecabezas=new JLabel("Rompecabezas",SwingConstants.CENTER);
        lblRompecabezas.setForeground(Color.white);
        lblRompecabezas.setBackground(ventana.getAzulLabel());
        lblRompecabezas.setOpaque(true);
        lblRompecabezas.setBorder(BorderFactory.createLineBorder(Color.black,2));
        lblRompecabezas.setBounds(340,0,120,30);

        JLabel lblTituloLeccion=new JLabel("Título de lección:",SwingConstants.CENTER);
        lblTituloLeccion.setForeground(Color.white);
        lblTituloLeccion.setBackground(ventana.getAzulLabel());
        lblTituloLeccion.setOpaque(true);
        lblTituloLeccion.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblTituloLeccion.setBounds(30,45,100,30);

        JTextField txtfTitle=new JTextField();
        txtfTitle.setBounds(130,45,220,30);
        txtfTitle.setBorder(BorderFactory.createLineBorder(Color.black,1));

        JLabel lblGruposAsignados=new JLabel("Grupos asignados:",SwingConstants.CENTER);
        lblGruposAsignados.setForeground(Color.white);
        lblGruposAsignados.setBackground(ventana.getAzulLabel());
        lblGruposAsignados.setOpaque(true);
        lblGruposAsignados.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblGruposAsignados.setBounds(530,45,120,30);

        JButton btnGrupoA=new JButton("3A");
        btnGrupoA.setForeground(Color.black);
        btnGrupoA.setBackground(ventana.getVerdeADS());
        btnGrupoA.setOpaque(true);
        btnGrupoA.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnGrupoA.setBounds(650,45,40,30);

        JButton btnGrupoB=new JButton("3B");
        btnGrupoB.setForeground(Color.black);
        btnGrupoB.setBackground(Color.white);
        btnGrupoB.setOpaque(true);
        btnGrupoB.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnGrupoB.setBounds(690,45,40,30);

        JButton btnGrupoC=new JButton("3C");
        btnGrupoC.setForeground(Color.black);
        btnGrupoC.setBackground(Color.white);
        btnGrupoC.setOpaque(true);
        btnGrupoC.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnGrupoC.setBounds(730,45,40,30);

        JButton btnSeleccionarImagen=new JButton("Seleccionar imagen");
        btnSeleccionarImagen.setForeground(Color.black);
        btnSeleccionarImagen.setBackground(ventana.getAzulLabel());
        btnSeleccionarImagen.setOpaque(true);
        btnSeleccionarImagen.setBorder(BorderFactory.createLineBorder(Color.black,2));
        btnSeleccionarImagen.setBounds(590,150,120,30);

        JLabel lblDatosCuriosos=new JLabel("Datos curiosos:",SwingConstants.CENTER);
        lblDatosCuriosos.setForeground(Color.white);
        lblDatosCuriosos.setBackground(ventana.getAzulLabel());
        lblDatosCuriosos.setOpaque(true);
        lblDatosCuriosos.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblDatosCuriosos.setBounds(30,260,120,30);

        JTextArea txtaDatosCuriosos=new JTextArea("Sabías que...");
        txtaDatosCuriosos.setBounds(30,290,500,90);
        txtaDatosCuriosos.setBorder(BorderFactory.createLineBorder(ventana.getAzulLabel(),2));

        JButton btnCrearLeccion2=new JButton("Crear lección");
        btnCrearLeccion2.setBounds(590,260,120,30);
        btnCrearLeccion2.setForeground(Color.black);
        btnCrearLeccion2.setBackground(ventana.getAzulLabel());
        btnCrearLeccion2.setOpaque(true);
        btnCrearLeccion2.setBorder(BorderFactory.createLineBorder(Color.black,2));

        JButton btnLastPanel=new JButton("Last Panel");
        btnLastPanel.setBounds(250,0,100,30);
        btnLastPanel.setForeground(Color.black);
        btnLastPanel.setBackground(ventana.getAzulLabel());
        btnLastPanel.setOpaque(true);
        btnLastPanel.setBorder(BorderFactory.createLineBorder(Color.black,2));
        btnLastPanel.addActionListener(new ActionListener() {
            //@Override
            public void actionPerformed(ActionEvent e) {
                ventana.getLayout().show(ventana.getContentPane(),"CrearEmparejamientos");
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
                ventana.getLayout().show(ventana.getContentPane(),"CrearRellena");
            }
        });

        pnlN.add(lblModoAdmin);
        pnlN.add(btnMenuPrincipal);
        pnlN.add(btnCrearLeccion);
        pnlN.add(btnEditarLeccion);
        pnlN.add(btnConsultarLeccion);
        pnlN.add(btnCerrarSesion);
        pnlN.add(lblLecciones);
        pnlN.add(btnEmparejamientos);
        pnlN.add(btnRompecabezas);
        pnlN.add(btnRellena);

        pnlC.add(lblRompecabezas);
        pnlC.add(lblTituloLeccion);
        pnlC.add(txtfTitle);
        pnlC.add(lblGruposAsignados);
        pnlC.add(btnGrupoA);
        pnlC.add(btnGrupoB);
        pnlC.add(btnGrupoC);
        pnlC.add(btnSeleccionarImagen);
        pnlC.add(lblDatosCuriosos);
        pnlC.add(txtaDatosCuriosos);
        pnlC.add(btnCrearLeccion2);

        pnlS.add(btnLastPanel);
        pnlS.add(btnNextPanel);
        add(pnlN);
        add(pnlC);
        add(pnlS);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d=(Graphics2D) g;
        g2d.setColor(Color.white);
        g2d.fillRect(30,300,500,170);
        g2d.setColor(ventana.getAzulLabel());
        g2d.drawRect(30,300,500,170);
        g.drawImage(Recursos.Leccion_AResized,150,70,null);
        g.drawImage(Recursos.Leccion_BResized,350,70,null);
        g.drawImage(Recursos.Leccion_CResized,550,70,null);
        g.drawImage(Recursos.image_iconResized,230,320,null);


    }
}



