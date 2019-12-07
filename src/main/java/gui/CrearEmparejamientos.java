package gui;

        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class CrearEmparejamientos extends JPanel {
    private AA_GUI ventana;

    public CrearEmparejamientos(final AA_GUI ventana){
        this.ventana=ventana;
        setLayout(null);
        setBackground(ventana.getAzulFondo());

        JPanel pnlN=new JPanel();
        JPanel pnlS=new JPanel();
        JScrollPane pnlScrollC=new JScrollPane();
        JPanel pnlC=new JPanel();
        JPanel pnlLeccion=new JPanel();
        JPanel pnlCuadro1=new JPanel();
        JPanel pnlCuadro2=new JPanel();
        JPanel pnlCuadro3=new JPanel();
        JPanel pnlCuadro4=new JPanel();
        JPanel pnlCuadro5=new JPanel();
        JPanel pnlCuadro6=new JPanel();
        JPanel pnlCuadro7=new JPanel();
        JPanel pnlCuadro8=new JPanel();
        JPanel pnlCuadro9=new JPanel();
        JPanel pnlCuadro10=new JPanel();

        pnlN.setLayout(null);
        pnlC.setLayout(null);
        pnlS.setLayout(null);
        pnlLeccion.setLayout(null);
        pnlCuadro1.setLayout(null);
        pnlCuadro2.setLayout(null);
        pnlCuadro3.setLayout(null);
        pnlCuadro4.setLayout(null);
        pnlCuadro5.setLayout(null);
        pnlCuadro6.setLayout(null);
        pnlCuadro7.setLayout(null);
        pnlCuadro8.setLayout(null);
        pnlCuadro9.setLayout(null);
        pnlCuadro10.setLayout(null);

        pnlN.setOpaque(false);
        pnlS.setOpaque(false);
        pnlScrollC.setOpaque(false);
        pnlC.setOpaque(false);
        pnlLeccion.setOpaque(true);
        pnlCuadro1.setOpaque(true);
        pnlCuadro2.setOpaque(true);
        pnlCuadro3.setOpaque(true);
        pnlCuadro4.setOpaque(true);
        pnlCuadro5.setOpaque(true);
        pnlCuadro6.setOpaque(true);
        pnlCuadro7.setOpaque(true);
        pnlCuadro8.setOpaque(true);
        pnlCuadro9.setOpaque(true);
        pnlCuadro10.setOpaque(true);

        pnlN.setBounds(0,0,ventana.getWidth(),220);
        pnlC.setBounds(0,220,ventana.getWidth(),385);
        pnlScrollC.setBounds(20,90,750,230);
        pnlS.setBounds(0,615,ventana.getWidth(),70);
        pnlLeccion.setPreferredSize(new Dimension(730,600));
        pnlCuadro1.setBounds(30,10,100,80);
        pnlCuadro2.setBounds(610,10,100,80);
        pnlCuadro3.setBounds(30,100,100,80);
        pnlCuadro4.setBounds(610,100,100,80);
        pnlCuadro5.setBounds(30,190,100,80);
        pnlCuadro6.setBounds(610,190,100,80);
        pnlCuadro7.setBounds(30,280,100,80);
        pnlCuadro8.setBounds(610,280,100,80);
        pnlCuadro9.setBounds(30,370,100,80);
        pnlCuadro10.setBounds(610,370,100,80);
        pnlLeccion.setBackground(ventana.getAzulFondo());
        pnlCuadro1.setBackground(Color.white);
        pnlCuadro2.setBackground(Color.white);
        pnlCuadro3.setBackground(Color.white);
        pnlCuadro4.setBackground(Color.white);
        pnlCuadro5.setBackground(Color.white);
        pnlCuadro6.setBackground(Color.white);
        pnlCuadro7.setBackground(Color.white);
        pnlCuadro8.setBackground(Color.white);
        pnlCuadro9.setBackground(Color.white);
        pnlCuadro10.setBackground(Color.white);
        pnlCuadro1.setBorder(BorderFactory.createLineBorder(ventana.getAzulLabel(),2));
        pnlCuadro2.setBorder(BorderFactory.createLineBorder(ventana.getAzulLabel(),2));
        pnlCuadro3.setBorder(BorderFactory.createLineBorder(ventana.getAzulLabel(),2));
        pnlCuadro4.setBorder(BorderFactory.createLineBorder(ventana.getAzulLabel(),2));
        pnlCuadro5.setBorder(BorderFactory.createLineBorder(ventana.getAzulLabel(),2));
        pnlCuadro6.setBorder(BorderFactory.createLineBorder(ventana.getAzulLabel(),2));
        pnlCuadro7.setBorder(BorderFactory.createLineBorder(ventana.getAzulLabel(),2));
        pnlCuadro8.setBorder(BorderFactory.createLineBorder(ventana.getAzulLabel(),2));
        pnlCuadro9.setBorder(BorderFactory.createLineBorder(ventana.getAzulLabel(),2));
        pnlCuadro10.setBorder(BorderFactory.createLineBorder(ventana.getAzulLabel(),2));
        //pnlUsuarios.setBackground(ventana.getAzulFondo());
        //pnlCrearUsuarios.setBackground(Color.white);
        //pnlCrearUsuarios.setBorder(BorderFactory.createLineBorder(Color.BLUE,2));

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
        btnEmparejamientos.setBackground(ventana.getVerdeADS());
        btnEmparejamientos.setOpaque(true);
        btnEmparejamientos.setBorder(BorderFactory.createLineBorder(Color.black,2));
        btnEmparejamientos.setBounds(140,175,120,30);

        JButton btnRompecabezas=new JButton("Rompecabezas");
        btnRompecabezas.setForeground(Color.black);
        btnRompecabezas.setBackground(Color.white);
        btnRompecabezas.setOpaque(true);
        btnRompecabezas.setBorder(BorderFactory.createLineBorder(Color.black,2));
        btnRompecabezas.setBounds(350,175,100,30);

        JButton btnRellena=new JButton("Rellena");
        btnRellena.setForeground(Color.black);
        btnRellena.setBackground(Color.white);
        btnRellena.setOpaque(true);
        btnRellena.setBorder(BorderFactory.createLineBorder(Color.black,2));
        btnRellena.setBounds(550,175,100,30);

        JLabel lblEmparejamientos=new JLabel("Emparejamientos",SwingConstants.CENTER);
        lblEmparejamientos.setForeground(Color.white);
        lblEmparejamientos.setBackground(ventana.getAzulLabel());
        lblEmparejamientos.setOpaque(true);
        lblEmparejamientos.setBorder(BorderFactory.createLineBorder(Color.black,2));
        lblEmparejamientos.setBounds(340,0,120,30);

        JLabel lblTituloLeccion=new JLabel("Título de lección:",SwingConstants.CENTER);
        lblTituloLeccion.setForeground(Color.white);
        lblTituloLeccion.setBackground(ventana.getAzulLabel());
        lblTituloLeccion.setOpaque(true);
        lblTituloLeccion.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblTituloLeccion.setBounds(20,45,100,30);

        JTextField txtfTitle=new JTextField();
        txtfTitle.setBounds(120,45,220,30);
        txtfTitle.setBorder(BorderFactory.createLineBorder(Color.black,1));

        JLabel lblGruposAsignados=new JLabel("Grupos asignados:",SwingConstants.CENTER);
        lblGruposAsignados.setForeground(Color.white);
        lblGruposAsignados.setBackground(ventana.getAzulLabel());
        lblGruposAsignados.setOpaque(true);
        lblGruposAsignados.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblGruposAsignados.setBounds(530,45,120,30);

        JButton btnGrupoA=new JButton("3A");
        btnGrupoA.setForeground(Color.black);
        btnGrupoA.setBackground(Color.white);
        btnGrupoA.setOpaque(true);
        btnGrupoA.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnGrupoA.setBounds(650,45,40,30);

        JButton btnGrupoB=new JButton("3B");
        btnGrupoB.setForeground(Color.black);
        btnGrupoB.setBackground(ventana.getVerdeADS());
        btnGrupoB.setOpaque(true);
        btnGrupoB.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnGrupoB.setBounds(690,45,40,30);

        JButton btnGrupoC=new JButton("3C");
        btnGrupoC.setForeground(Color.black);
        btnGrupoC.setBackground(Color.white);
        btnGrupoC.setOpaque(true);
        btnGrupoC.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnGrupoC.setBounds(730,45,40,30);

        Font f=new Font("TimesRoman",Font.BOLD,25);
        //FLECHAS
        JLabel lblFlecha1=new JLabel("---------------------------------------->",SwingConstants.CENTER);
        lblFlecha1.setFont(f);
        lblFlecha1.setForeground(ventana.getRojoADS());
        lblFlecha1.setBackground(null);
        lblFlecha1.setOpaque(true);
        lblFlecha1.setBounds(195,30,350,30);

        JLabel lblFlecha2=new JLabel("---------------------------------------->",SwingConstants.CENTER);
        lblFlecha2.setFont(f);
        lblFlecha2.setForeground(ventana.getRojoADS());
        lblFlecha2.setBackground(null);
        lblFlecha2.setOpaque(true);
        lblFlecha2.setBounds(195,120,350,30);

        JLabel lblFlecha3=new JLabel("---------------------------------------->",SwingConstants.CENTER);
        lblFlecha3.setFont(f);
        lblFlecha3.setForeground(ventana.getRojoADS());
        lblFlecha3.setBackground(null);
        lblFlecha3.setOpaque(true);
        lblFlecha3.setBounds(195,210,350,30);

        JLabel lblFlecha4=new JLabel("---------------------------------------->",SwingConstants.CENTER);
        lblFlecha4.setFont(f);
        lblFlecha4.setForeground(ventana.getRojoADS());
        lblFlecha4.setBackground(null);
        lblFlecha4.setOpaque(true);
        lblFlecha4.setBounds(195,300,350,30);

        JLabel lblFlecha5=new JLabel("---------------------------------------->",SwingConstants.CENTER);
        lblFlecha5.setFont(f);
        lblFlecha5.setForeground(ventana.getRojoADS());
        lblFlecha5.setBackground(null);
        lblFlecha5.setOpaque(true);
        lblFlecha5.setBounds(195,390,350,30);

        //CUADROS
        //1er cuadro
        JButton btnTexto1=new JButton("+");
        btnTexto1.setForeground(Color.black);
        btnTexto1.setBackground(Color.white);
        btnTexto1.setOpaque(true);
        btnTexto1.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnTexto1.setBounds(10,10,30,30);

        JLabel lblTexto1=new JLabel("texto",SwingConstants.CENTER);
        lblTexto1.setForeground(Color.black);
        lblTexto1.setBackground(Color.white);
        lblTexto1.setOpaque(true);
        lblTexto1.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblTexto1.setBounds(40,10,50,30);

        JButton btnImagen1=new JButton("+");
        btnImagen1.setForeground(Color.black);
        btnImagen1.setBackground(Color.white);
        btnImagen1.setOpaque(true);
        btnImagen1.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnImagen1.setBounds(10,40,30,30);

        JLabel lblImagen1=new JLabel("imagen",SwingConstants.CENTER);
        lblImagen1.setForeground(Color.black);
        lblImagen1.setBackground(Color.white);
        lblImagen1.setOpaque(true);
        lblImagen1.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblImagen1.setBounds(40,40,50,30);

        //2do cuadro
        JButton btnTexto2=new JButton("+");
        btnTexto2.setForeground(Color.black);
        btnTexto2.setBackground(Color.white);
        btnTexto2.setOpaque(true);
        btnTexto2.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnTexto2.setBounds(10,10,30,30);

        JLabel lblTexto2=new JLabel("texto",SwingConstants.CENTER);
        lblTexto2.setForeground(Color.black);
        lblTexto2.setBackground(Color.white);
        lblTexto2.setOpaque(true);
        lblTexto2.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblTexto2.setBounds(40,10,50,30);

        JButton btnImagen2=new JButton("+");
        btnImagen2.setForeground(Color.black);
        btnImagen2.setBackground(Color.white);
        btnImagen2.setOpaque(true);
        btnImagen2.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnImagen2.setBounds(10,40,30,30);

        JLabel lblImagen2=new JLabel("imagen",SwingConstants.CENTER);
        lblImagen2.setForeground(Color.black);
        lblImagen2.setBackground(Color.white);
        lblImagen2.setOpaque(true);
        lblImagen2.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblImagen2.setBounds(40,40,50,30);

        //3er cuadro
        JButton btnTexto3=new JButton("+");
        btnTexto3.setForeground(Color.black);
        btnTexto3.setBackground(Color.white);
        btnTexto3.setOpaque(true);
        btnTexto3.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnTexto3.setBounds(10,10,30,30);

        JLabel lblTexto3=new JLabel("texto",SwingConstants.CENTER);
        lblTexto3.setForeground(Color.black);
        lblTexto3.setBackground(Color.white);
        lblTexto3.setOpaque(true);
        lblTexto3.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblTexto3.setBounds(40,10,50,30);

        JButton btnImagen3=new JButton("+");
        btnImagen3.setForeground(Color.black);
        btnImagen3.setBackground(Color.white);
        btnImagen3.setOpaque(true);
        btnImagen3.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnImagen3.setBounds(10,40,30,30);

        JLabel lblImagen3=new JLabel("imagen",SwingConstants.CENTER);
        lblImagen3.setForeground(Color.black);
        lblImagen3.setBackground(Color.white);
        lblImagen3.setOpaque(true);
        lblImagen3.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblImagen3.setBounds(40,40,50,30);

        //4to cuadro
        JButton btnTexto4=new JButton("+");
        btnTexto4.setForeground(Color.black);
        btnTexto4.setBackground(Color.white);
        btnTexto4.setOpaque(true);
        btnTexto4.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnTexto4.setBounds(10,10,30,30);

        JLabel lblTexto4=new JLabel("texto",SwingConstants.CENTER);
        lblTexto4.setForeground(Color.black);
        lblTexto4.setBackground(Color.white);
        lblTexto4.setOpaque(true);
        lblTexto4.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblTexto4.setBounds(40,10,50,30);

        JButton btnImagen4=new JButton("+");
        btnImagen4.setForeground(Color.black);
        btnImagen4.setBackground(Color.white);
        btnImagen4.setOpaque(true);
        btnImagen4.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnImagen4.setBounds(10,40,30,30);

        JLabel lblImagen4=new JLabel("imagen",SwingConstants.CENTER);
        lblImagen4.setForeground(Color.black);
        lblImagen4.setBackground(Color.white);
        lblImagen4.setOpaque(true);
        lblImagen4.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblImagen4.setBounds(40,40,50,30);

        //5to cuadro
        JButton btnTexto5=new JButton("+");
        btnTexto5.setForeground(Color.black);
        btnTexto5.setBackground(Color.white);
        btnTexto5.setOpaque(true);
        btnTexto5.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnTexto5.setBounds(10,10,30,30);

        JLabel lblTexto5=new JLabel("texto",SwingConstants.CENTER);
        lblTexto5.setForeground(Color.black);
        lblTexto5.setBackground(Color.white);
        lblTexto5.setOpaque(true);
        lblTexto5.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblTexto5.setBounds(40,10,50,30);

        JButton btnImagen5=new JButton("+");
        btnImagen5.setForeground(Color.black);
        btnImagen5.setBackground(Color.white);
        btnImagen5.setOpaque(true);
        btnImagen5.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnImagen5.setBounds(10,40,30,30);

        JLabel lblImagen5=new JLabel("imagen",SwingConstants.CENTER);
        lblImagen5.setForeground(Color.black);
        lblImagen5.setBackground(Color.white);
        lblImagen5.setOpaque(true);
        lblImagen5.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblImagen5.setBounds(40,40,50,30);

        //6to cuadro
        JButton btnTexto6=new JButton("+");
        btnTexto6.setForeground(Color.black);
        btnTexto6.setBackground(Color.white);
        btnTexto6.setOpaque(true);
        btnTexto6.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnTexto6.setBounds(10,10,30,30);

        JLabel lblTexto6=new JLabel("texto",SwingConstants.CENTER);
        lblTexto6.setForeground(Color.black);
        lblTexto6.setBackground(Color.white);
        lblTexto6.setOpaque(true);
        lblTexto6.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblTexto6.setBounds(40,10,50,30);

        JButton btnImagen6=new JButton("+");
        btnImagen6.setForeground(Color.black);
        btnImagen6.setBackground(Color.white);
        btnImagen6.setOpaque(true);
        btnImagen6.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnImagen6.setBounds(10,40,30,30);

        JLabel lblImagen6=new JLabel("imagen",SwingConstants.CENTER);
        lblImagen6.setForeground(Color.black);
        lblImagen6.setBackground(Color.white);
        lblImagen6.setOpaque(true);
        lblImagen6.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblImagen6.setBounds(40,40,50,30);

        //7mo cuadro
        JButton btnTexto7=new JButton("+");
        btnTexto7.setForeground(Color.black);
        btnTexto7.setBackground(Color.white);
        btnTexto7.setOpaque(true);
        btnTexto7.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnTexto7.setBounds(10,10,30,30);

        JLabel lblTexto7=new JLabel("texto",SwingConstants.CENTER);
        lblTexto7.setForeground(Color.black);
        lblTexto7.setBackground(Color.white);
        lblTexto7.setOpaque(true);
        lblTexto7.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblTexto7.setBounds(40,10,50,30);

        JButton btnImagen7=new JButton("+");
        btnImagen7.setForeground(Color.black);
        btnImagen7.setBackground(Color.white);
        btnImagen7.setOpaque(true);
        btnImagen7.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnImagen7.setBounds(10,40,30,30);

        JLabel lblImagen7=new JLabel("imagen",SwingConstants.CENTER);
        lblImagen7.setForeground(Color.black);
        lblImagen7.setBackground(Color.white);
        lblImagen7.setOpaque(true);
        lblImagen7.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblImagen7.setBounds(40,40,50,30);

        //8vo cuadro
        JButton btnTexto8=new JButton("+");
        btnTexto8.setForeground(Color.black);
        btnTexto8.setBackground(Color.white);
        btnTexto8.setOpaque(true);
        btnTexto8.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnTexto8.setBounds(10,10,30,30);

        JLabel lblTexto8=new JLabel("texto",SwingConstants.CENTER);
        lblTexto8.setForeground(Color.black);
        lblTexto8.setBackground(Color.white);
        lblTexto8.setOpaque(true);
        lblTexto8.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblTexto8.setBounds(40,10,50,30);

        JButton btnImagen8=new JButton("+");
        btnImagen8.setForeground(Color.black);
        btnImagen8.setBackground(Color.white);
        btnImagen8.setOpaque(true);
        btnImagen8.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnImagen8.setBounds(10,40,30,30);

        JLabel lblImagen8=new JLabel("imagen",SwingConstants.CENTER);
        lblImagen8.setForeground(Color.black);
        lblImagen8.setBackground(Color.white);
        lblImagen8.setOpaque(true);
        lblImagen8.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblImagen8.setBounds(40,40,50,30);

        JButton btnImagenTexto1=new JButton("+");
        btnImagenTexto1.setForeground(Color.black);
        btnImagenTexto1.setBackground(Color.white);
        btnImagenTexto1.setOpaque(true);
        btnImagenTexto1.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnImagenTexto1.setBounds(30,20,40,40);

        JButton btnImagenTexto2=new JButton("+");
        btnImagenTexto2.setForeground(Color.black);
        btnImagenTexto2.setBackground(Color.white);
        btnImagenTexto2.setOpaque(true);
        btnImagenTexto2.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnImagenTexto2.setBounds(30,20,40,40);

        JLabel lblDatosCuriosos=new JLabel("Datos curiosos:",SwingConstants.CENTER);
        lblDatosCuriosos.setForeground(Color.white);
        lblDatosCuriosos.setBackground(ventana.getAzulLabel());
        lblDatosCuriosos.setOpaque(true);
        lblDatosCuriosos.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblDatosCuriosos.setBounds(30,460,120,30);

        JTextArea txtaDatosCuriosos=new JTextArea("Sabías que...");
        txtaDatosCuriosos.setBounds(30,490,680,108);
        txtaDatosCuriosos.setBorder(BorderFactory.createLineBorder(ventana.getAzulLabel(),2));

        JButton btnCrearLeccion2=new JButton("Crear lección");
        btnCrearLeccion2.setBounds(650,335,120,30);
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
                ventana.getLayout().show(ventana.getContentPane(),"MenuPrincipalMaestro");
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
                ventana.getLayout().show(ventana.getContentPane(),"CrearRompecabezas");
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

        pnlC.add(lblEmparejamientos);
        pnlC.add(lblTituloLeccion);
        pnlC.add(txtfTitle);
        pnlC.add(pnlScrollC);
        pnlC.add(lblGruposAsignados);
        pnlC.add(btnGrupoA);
        pnlC.add(btnGrupoB);
        pnlC.add(btnGrupoC);
        pnlC.add(btnCrearLeccion2);


        pnlLeccion.add(lblFlecha1);
        pnlLeccion.add(lblFlecha2);
        pnlLeccion.add(lblFlecha3);
        pnlLeccion.add(lblFlecha4);
        pnlLeccion.add(lblFlecha5);
        pnlLeccion.add(pnlCuadro1);
        pnlLeccion.add(pnlCuadro2);
        pnlLeccion.add(pnlCuadro3);
        pnlLeccion.add(pnlCuadro4);
        pnlLeccion.add(pnlCuadro5);
        pnlLeccion.add(pnlCuadro6);
        pnlLeccion.add(pnlCuadro7);
        pnlLeccion.add(pnlCuadro8);
        pnlLeccion.add(pnlCuadro9);
        pnlLeccion.add(pnlCuadro10);
        pnlLeccion.add(lblDatosCuriosos);
        pnlLeccion.add(txtaDatosCuriosos);

        pnlCuadro1.add(btnTexto1);
        pnlCuadro1.add(lblTexto1);
        pnlCuadro1.add(btnImagen1);
        pnlCuadro1.add(lblImagen1);
        pnlCuadro2.add(btnTexto2);
        pnlCuadro2.add(lblTexto2);
        pnlCuadro2.add(btnImagen2);
        pnlCuadro2.add(lblImagen2);
        pnlCuadro3.add(btnTexto3);
        pnlCuadro3.add(lblTexto3);
        pnlCuadro3.add(btnImagen3);
        pnlCuadro3.add(lblImagen3);
        pnlCuadro4.add(btnTexto4);
        pnlCuadro4.add(lblTexto4);
        pnlCuadro4.add(btnImagen4);
        pnlCuadro4.add(lblImagen4);
        pnlCuadro5.add(btnTexto5);
        pnlCuadro5.add(lblTexto5);
        pnlCuadro5.add(btnImagen5);
        pnlCuadro5.add(lblImagen5);
        pnlCuadro6.add(btnTexto6);
        pnlCuadro6.add(lblTexto6);
        pnlCuadro6.add(btnImagen6);
        pnlCuadro6.add(lblImagen6);
        pnlCuadro7.add(btnTexto7);
        pnlCuadro7.add(lblTexto7);
        pnlCuadro7.add(btnImagen7);
        pnlCuadro7.add(lblImagen7);
        pnlCuadro8.add(btnTexto8);
        pnlCuadro8.add(lblTexto8);
        pnlCuadro8.add(btnImagen8);
        pnlCuadro8.add(lblImagen8);
        pnlCuadro9.add(btnImagenTexto1);
        pnlCuadro10.add(btnImagenTexto2);

        pnlScrollC.setViewportView(pnlLeccion);
        pnlS.add(btnLastPanel);
        pnlS.add(btnNextPanel);
        add(pnlN);
        add(pnlC);
        add(pnlS);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(Recursos.Leccion_AResized,150,70,null);
        g.drawImage(Recursos.Leccion_BResized,350,70,null);
        g.drawImage(Recursos.Leccion_CResized,550,70,null);
        //g.drawImage(Recursos.flecha_rojaResized,550,270,null);


    }
}


