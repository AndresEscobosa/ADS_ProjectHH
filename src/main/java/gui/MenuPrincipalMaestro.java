package gui;

        import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class MenuPrincipalMaestro extends JPanel {
    private AA_GUI ventana;

    public MenuPrincipalMaestro(final AA_GUI ventana){
        this.ventana=ventana;
        setLayout(null);
        setBackground(ventana.getAzulFondo());

        JPanel pnlN=new JPanel();
        JPanel pnlE=new JPanel();
        JPanel pnlW=new JPanel();
        JPanel pnlS=new JPanel();
        JScrollPane pnlScrollW=new JScrollPane();
        JPanel pnlAlumnos=new JPanel();

        pnlN.setLayout(null);
        pnlE.setLayout(null);
        pnlW.setLayout(null);
        pnlS.setLayout(null);
        pnlAlumnos.setLayout(null);

        pnlN.setOpaque(false);
        pnlS.setOpaque(false);
        pnlE.setOpaque(false);
        pnlW.setOpaque(false);
        pnlScrollW.setOpaque(false);
        pnlAlumnos.setOpaque(false);

        pnlN.setBounds(0,0,ventana.getWidth(),130);
        pnlE.setBounds(400,70,ventana.getWidth()/2,540);
        pnlW.setBounds(0,70,ventana.getWidth()/2,530);
        pnlS.setBounds(0,615,ventana.getWidth(),70);

        pnlScrollW.setBounds(40,220,320,340);
        pnlAlumnos.setPreferredSize(new Dimension(300,630));

        pnlAlumnos.setBackground(ventana.getAzulFondo());
        JLabel lblModoAdmin=new JLabel("");
        lblModoAdmin.setBorder(BorderFactory.createLineBorder(Color.black,2));
        lblModoAdmin.setBounds(0,0,800,30);

        JButton btnMenuPrincipal=new JButton("Menú Principal");
        btnMenuPrincipal.setForeground(Color.white);
        btnMenuPrincipal.setBackground(ventana.getVerdeADS());
        btnMenuPrincipal.setOpaque(true);
        btnMenuPrincipal.setBorder(BorderFactory.createLineBorder(Color.black,2));
        btnMenuPrincipal.setBounds(0,0,100,30);

        JButton btnCrearLeccion=new JButton("Crear Lección");
        btnCrearLeccion.setForeground(Color.black);
        btnCrearLeccion.setBackground(Color.white);
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

        JLabel lblPerfil=new JLabel("Perfil",SwingConstants.CENTER);
        lblPerfil.setForeground(Color.white);
        lblPerfil.setBackground(ventana.getAzulLabel());
        lblPerfil.setOpaque(true);
        lblPerfil.setBorder(BorderFactory.createLineBorder(Color.black,2));
        lblPerfil.setBounds(150,35,100,30);

        JLabel lblAvisos=new JLabel("Avisos",SwingConstants.CENTER);
        lblAvisos.setForeground(Color.white);
        lblAvisos.setBackground(ventana.getAzulLabel());
        lblAvisos.setOpaque(true);
        lblAvisos.setBorder(BorderFactory.createLineBorder(Color.black,2));
        lblAvisos.setBounds(550,35,100,30);

        JLabel lblNombreCompleto=new JLabel("Nombre completo:",SwingConstants.CENTER);
        lblNombreCompleto.setForeground(Color.white);
        lblNombreCompleto.setBackground(ventana.getAzulLabel());
        lblNombreCompleto.setOpaque(true);
        lblNombreCompleto.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblNombreCompleto.setBounds(40,20,120,30);

        JLabel lblMaestroNombre=new JLabel("Miguel Escobosa",SwingConstants.CENTER);
        lblMaestroNombre.setForeground(Color.black);
        lblMaestroNombre.setBackground(Color.white);
        lblMaestroNombre.setOpaque(true);
        lblMaestroNombre.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblMaestroNombre.setBounds(160,20,200,30);

        JLabel lblNombreUsuario=new JLabel("Nombre de usuario:",SwingConstants.CENTER);
        lblNombreUsuario.setForeground(Color.white);
        lblNombreUsuario.setBackground(ventana.getAzulLabel());
        lblNombreUsuario.setOpaque(true);
        lblNombreUsuario.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblNombreUsuario.setBounds(40,70,120,30);

        JLabel lblMaestroUsuario=new JLabel("Miguelingui85",SwingConstants.CENTER);
        lblMaestroUsuario.setForeground(Color.black);
        lblMaestroUsuario.setBackground(Color.white);
        lblMaestroUsuario.setOpaque(true);
        lblMaestroUsuario.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblMaestroUsuario.setBounds(160,70,200,30);

        JLabel lblGruposAsignados=new JLabel("Grupos asignados:",SwingConstants.CENTER);
        lblGruposAsignados.setForeground(Color.white);
        lblGruposAsignados.setBackground(ventana.getAzulLabel());
        lblGruposAsignados.setOpaque(true);
        lblGruposAsignados.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblGruposAsignados.setBounds(40,120,120,30);

        JButton btnGrupoA=new JButton("3A");
        btnGrupoA.setForeground(Color.black);
        btnGrupoA.setBackground(Color.white);
        btnGrupoA.setOpaque(true);
        btnGrupoA.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnGrupoA.setBounds(160,120,40,30);

        JButton btnGrupoB=new JButton("3B");
        btnGrupoB.setForeground(Color.black);
        btnGrupoB.setBackground(ventana.getVerdeADS());
        btnGrupoB.setOpaque(true);
        btnGrupoB.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnGrupoB.setBounds(200,120,40,30);

        JButton btnGrupoC=new JButton("3C");
        btnGrupoC.setForeground(Color.black);
        btnGrupoC.setBackground(Color.white);
        btnGrupoC.setOpaque(true);
        btnGrupoC.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnGrupoC.setBounds(240,120,40,30);

        JLabel lblAlumnos=new JLabel("Alumnos:",SwingConstants.CENTER);
        lblAlumnos.setForeground(Color.white);
        lblAlumnos.setBackground(ventana.getAzulLabel());
        lblAlumnos.setOpaque(true);
        lblAlumnos.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblAlumnos.setBounds(40,170,100,30);

        JLabel lblTitle=new JLabel("Título:",SwingConstants.CENTER);
        lblTitle.setForeground(Color.white);
        lblTitle.setBackground(ventana.getAzulLabel());
        lblTitle.setOpaque(true);
        lblTitle.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblTitle.setBounds(40,20,100,30);

        JTextField txtfTitle=new JTextField();
        txtfTitle.setBounds(140,20,220,30);
        txtfTitle.setBorder(BorderFactory.createLineBorder(Color.black,1));

        JLabel lblDestinatarios=new JLabel("Destinatarios:",SwingConstants.CENTER);
        lblDestinatarios.setForeground(Color.white);
        lblDestinatarios.setBackground(ventana.getAzulLabel());
        lblDestinatarios.setOpaque(true);
        lblDestinatarios.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblDestinatarios.setBounds(40,70,100,30);

        JButton btnGrupoA2=new JButton("3A");
        btnGrupoA2.setForeground(Color.black);
        btnGrupoA2.setBackground(ventana.getVerdeADS());
        btnGrupoA2.setOpaque(true);
        btnGrupoA2.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnGrupoA2.setBounds(140,70,40,30);

        JButton btnGrupoB2=new JButton("3B");
        btnGrupoB2.setForeground(Color.black);
        btnGrupoB2.setBackground(ventana.getVerdeADS());
        btnGrupoB2.setOpaque(true);
        btnGrupoB2.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnGrupoB2.setBounds(180,70,40,30);

        JButton btnGrupoC2=new JButton("3C");
        btnGrupoC2.setForeground(Color.black);
        btnGrupoC2.setBackground(Color.white);
        btnGrupoC2.setOpaque(true);
        btnGrupoC2.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnGrupoC2.setBounds(220,70,40,30);

        JLabel lblCuerpoAviso=new JLabel("Cuerpo de aviso:",SwingConstants.CENTER);
        lblCuerpoAviso.setForeground(Color.white);
        lblCuerpoAviso.setBackground(ventana.getAzulLabel());
        lblCuerpoAviso.setOpaque(true);
        lblCuerpoAviso.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblCuerpoAviso.setBounds(40,120,120,30);

        JTextArea txtaCuerpo=new JTextArea();
        txtaCuerpo.setBounds(40,170,320,320);
        txtaCuerpo.setBorder(BorderFactory.createLineBorder(ventana.getAzulLabel(),2));

        JButton btnEnviarAviso=new JButton("Enviar aviso");
        btnEnviarAviso.setBounds(150,505,100,30);
        btnEnviarAviso.setForeground(Color.black);
        btnEnviarAviso.setBackground(ventana.getAzulLabel());
        btnEnviarAviso.setOpaque(true);
        btnEnviarAviso.setBorder(BorderFactory.createLineBorder(Color.black,2));

        //USUARIOS
        JLabel lblU1=new JLabel("Alejandro López",SwingConstants.CENTER);
        lblU1.setForeground(Color.black);
        lblU1.setBackground(Color.white);
        lblU1.setOpaque(true);
        lblU1.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU1.setBounds(0,0,300,30);

        JLabel lblU2=new JLabel("Manuel Estover",SwingConstants.CENTER);
        lblU2.setForeground(Color.black);
        lblU2.setBackground(Color.white);
        lblU2.setOpaque(true);
        lblU2.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU2.setBounds(0,30,300,30);

        JLabel lblU3=new JLabel("Miguel de la Cruz",SwingConstants.CENTER);
        lblU3.setForeground(Color.black);
        lblU3.setBackground(Color.white);
        lblU3.setOpaque(true);
        lblU3.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU3.setBounds(0,60,300,30);

        JLabel lblU4=new JLabel("Juan Arroyo",SwingConstants.CENTER);
        lblU4.setForeground(Color.black);
        lblU4.setBackground(Color.white);
        lblU4.setOpaque(true);
        lblU4.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU4.setBounds(0,90,300,30);

        JLabel lblU5=new JLabel("Manuel Turizo",SwingConstants.CENTER);
        lblU5.setForeground(Color.black);
        lblU5.setBackground(Color.white);
        lblU5.setOpaque(true);
        lblU5.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU5.setBounds(0,120,300,30);

        JLabel lblU6=new JLabel("Jennifer Olivas",SwingConstants.CENTER);
        lblU6.setForeground(Color.black);
        lblU6.setBackground(Color.white);
        lblU6.setOpaque(true);
        lblU6.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU6.setBounds(0,150,300,30);

        JLabel lblU7=new JLabel("Loaiza Estivalis",SwingConstants.CENTER);
        lblU7.setForeground(Color.black);
        lblU7.setBackground(Color.white);
        lblU7.setOpaque(true);
        lblU7.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU7.setBounds(0,180,300,30);

        JLabel lblU8=new JLabel("Victor Antuna",SwingConstants.CENTER);
        lblU8.setForeground(Color.black);
        lblU8.setBackground(Color.white);
        lblU8.setOpaque(true);
        lblU8.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU8.setBounds(0,210,300,30);

        JLabel lblU9=new JLabel("Olivia Hernández",SwingConstants.CENTER);
        lblU9.setForeground(Color.black);
        lblU9.setBackground(Color.white);
        lblU9.setOpaque(true);
        lblU9.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU9.setBounds(0,240,300,30);

        JLabel lblU10=new JLabel("Heriberto Noriega",SwingConstants.CENTER);
        lblU10.setForeground(Color.black);
        lblU10.setBackground(Color.white);
        lblU10.setOpaque(true);
        lblU10.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU10.setBounds(0,270,300,30);

        JLabel lblU11=new JLabel("Aristea Sánchez",SwingConstants.CENTER);
        lblU11.setForeground(Color.black);
        lblU11.setBackground(Color.white);
        lblU11.setOpaque(true);
        lblU11.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU11.setBounds(0,300,300,30);

        JLabel lblU12=new JLabel("Héctor Godínez",SwingConstants.CENTER);
        lblU12.setForeground(Color.black);
        lblU12.setBackground(Color.white);
        lblU12.setOpaque(true);
        lblU12.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU12.setBounds(0,330,300,30);

        JLabel lblU13=new JLabel("Alvin Gutiérrez",SwingConstants.CENTER);
        lblU13.setForeground(Color.black);
        lblU13.setBackground(Color.white);
        lblU13.setOpaque(true);
        lblU13.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU13.setBounds(0,360,300,30);

        JLabel lblU14=new JLabel("Poncho Ramírez",SwingConstants.CENTER);
        lblU14.setForeground(Color.black);
        lblU14.setBackground(Color.white);
        lblU14.setOpaque(true);
        lblU14.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU14.setBounds(0,390,300,30);

        JLabel lblU15=new JLabel("Leticia Aguilar",SwingConstants.CENTER);
        lblU15.setForeground(Color.black);
        lblU15.setBackground(Color.white);
        lblU15.setOpaque(true);
        lblU15.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU15.setBounds(0,420,300,30);

        JLabel lblU16=new JLabel("Raymundo Aguilera",SwingConstants.CENTER);
        lblU16.setForeground(Color.black);
        lblU16.setBackground(Color.white);
        lblU16.setOpaque(true);
        lblU16.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU16.setBounds(0,450,300,30);

        JLabel lblU17=new JLabel("Margarita Contreras",SwingConstants.CENTER);
        lblU17.setForeground(Color.black);
        lblU17.setBackground(Color.white);
        lblU17.setOpaque(true);
        lblU17.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU17.setBounds(0,480,300,30);

        JLabel lblU18=new JLabel("Jesús García",SwingConstants.CENTER);
        lblU18.setForeground(Color.black);
        lblU18.setBackground(Color.white);
        lblU18.setOpaque(true);
        lblU18.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU18.setBounds(0,510,300,30);

        JLabel lblU19=new JLabel("Violeta Villanueva",SwingConstants.CENTER);
        lblU19.setForeground(Color.black);
        lblU19.setBackground(Color.white);
        lblU19.setOpaque(true);
        lblU19.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU19.setBounds(0,540,300,30);

        JLabel lblU20=new JLabel("Luis Lutgard",SwingConstants.CENTER);
        lblU20.setForeground(Color.black);
        lblU20.setBackground(Color.white);
        lblU20.setOpaque(true);
        lblU20.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU20.setBounds(0,570,300,30);

        JButton btnLastPanel=new JButton("Last Panel");
        btnLastPanel.setBounds(250,0,100,30);
        btnLastPanel.setForeground(Color.black);
        btnLastPanel.setBackground(ventana.getAzulLabel());
        btnLastPanel.setOpaque(true);
        btnLastPanel.setBorder(BorderFactory.createLineBorder(Color.black,2));
        btnLastPanel.addActionListener(new ActionListener() {
            //@Override
            public void actionPerformed(ActionEvent e) {
                ventana.getLayout().show(ventana.getContentPane(),"AdministraUsuarios");
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
                ventana.getLayout().show(ventana.getContentPane(),"CrearEmparejamientos");
            }
        });

        pnlN.add(lblModoAdmin);
        pnlN.add(btnMenuPrincipal);
        pnlN.add(btnCrearLeccion);
        pnlN.add(btnEditarLeccion);
        pnlN.add(btnConsultarLeccion);
        pnlN.add(btnCerrarSesion);
        pnlN.add(lblPerfil);
        pnlN.add(lblAvisos);

        pnlW.add(lblNombreCompleto);
        pnlW.add(lblMaestroNombre);
        pnlW.add(lblNombreUsuario);
        pnlW.add(lblMaestroUsuario);
        pnlW.add(lblGruposAsignados);
        pnlW.add(btnGrupoA);
        pnlW.add(btnGrupoB);
        pnlW.add(btnGrupoC);
        pnlW.add(lblAlumnos);

        pnlE.add(lblTitle);
        pnlE.add(txtfTitle);
        pnlE.add(lblDestinatarios);
        pnlE.add(btnGrupoA2);
        pnlE.add(btnGrupoB2);
        pnlE.add(btnGrupoC2);
        pnlE.add(lblCuerpoAviso);
        pnlE.add(txtaCuerpo);
        pnlE.add(btnEnviarAviso);

        pnlW.add(pnlScrollW);
        pnlScrollW.setViewportView(pnlAlumnos);
        pnlAlumnos.add(lblU1);
        pnlAlumnos.add(lblU2);
        pnlAlumnos.add(lblU3);
        pnlAlumnos.add(lblU4);
        pnlAlumnos.add(lblU5);
        pnlAlumnos.add(lblU6);
        pnlAlumnos.add(lblU7);
        pnlAlumnos.add(lblU8);
        pnlAlumnos.add(lblU9);
        pnlAlumnos.add(lblU10);
        pnlAlumnos.add(lblU11);
        pnlAlumnos.add(lblU12);
        pnlAlumnos.add(lblU13);
        pnlAlumnos.add(lblU14);
        pnlAlumnos.add(lblU15);
        pnlAlumnos.add(lblU16);
        pnlAlumnos.add(lblU17);
        pnlAlumnos.add(lblU18);
        pnlAlumnos.add(lblU19);
        pnlAlumnos.add(lblU20);

        pnlS.add(btnLastPanel);
        pnlS.add(btnNextPanel);
        add(pnlN);
        add(pnlW);
        add(pnlE);
        add(pnlS);
    }
}

