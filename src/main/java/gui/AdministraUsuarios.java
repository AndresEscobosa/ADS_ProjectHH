package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdministraUsuarios extends JPanel {
    private AA_GUI ventana;

    public AdministraUsuarios(final AA_GUI ventana){
        this.ventana=ventana;
        setLayout(null);
        setBackground(ventana.getAzulFondo());

        JPanel pnlN=new JPanel();
        JPanel pnlC=new JPanel();
        JPanel pnlS=new JPanel();
        JScrollPane pnlScrollC=new JScrollPane();
        JPanel pnlUsuarios=new JPanel();
        JPanel pnlCrearUsuarios=new JPanel();

        pnlN.setLayout(null);
        pnlC.setLayout(null);
        pnlS.setLayout(null);
        pnlUsuarios.setLayout(null);
        pnlCrearUsuarios.setLayout(null);

        pnlN.setOpaque(false);
        pnlS.setOpaque(false);
        pnlC.setOpaque(false);
        pnlUsuarios.setOpaque(true);
        pnlScrollC.setOpaque(false);
        pnlCrearUsuarios.setOpaque(true);

        pnlN.setBounds(0,0,ventana.getWidth(),130);
        pnlC.setBounds(0,130,ventana.getWidth(),480);
        pnlS.setBounds(0,615,ventana.getWidth(),70);

        pnlScrollC.setBounds(0,0,786,200);
        pnlUsuarios.setPreferredSize(new Dimension(730,320));
        pnlCrearUsuarios.setBounds(250,240,300,230);

        pnlUsuarios.setBackground(ventana.getAzulFondo());
        pnlCrearUsuarios.setBackground(Color.white);
        pnlCrearUsuarios.setBorder(BorderFactory.createLineBorder(Color.BLUE,2));

        JLabel lblModoAdmin=new JLabel(" Modo Administrador ",SwingConstants.CENTER);
        lblModoAdmin.setBorder(BorderFactory.createLineBorder(Color.black,2));
        lblModoAdmin.setBounds(0,0,800,30);

        JButton btnCerrarSesion=new JButton(" Cerrar Sesión ");
        btnCerrarSesion.setForeground(Color.white);
        btnCerrarSesion.setBackground(Color.red);
        btnCerrarSesion.setOpaque(true);
        btnCerrarSesion.setBorder(BorderFactory.createLineBorder(Color.black,2));
        btnCerrarSesion.setBounds(688,0,100,30);

        JLabel lblTitle=new JLabel(" Usuarios ",SwingConstants.CENTER);
        lblTitle.setForeground(Color.white);
        lblTitle.setBackground(ventana.getAzulLabel());
        lblTitle.setOpaque(true);
        lblTitle.setBorder(BorderFactory.createLineBorder(Color.black,2));
        lblTitle.setBounds(350,35,100,30);

        JLabel lblOrdenar=new JLabel(" Ordenar: ",SwingConstants.CENTER);
        lblOrdenar.setForeground(Color.white);
        lblOrdenar.setBackground(ventana.getAzulLabel());
        lblOrdenar.setOpaque(true);
        lblOrdenar.setBorder(BorderFactory.createLineBorder(Color.black,2));
        lblOrdenar.setBounds(40,80,100,30);

        JButton btnPorIngreso=new JButton(" Por ingreso ");
        btnPorIngreso.setForeground(Color.black);
        btnPorIngreso.setBackground(ventana.getVerdeADS());
        btnPorIngreso.setOpaque(true);
        btnPorIngreso.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnPorIngreso.setBounds(170,80,100,30);

        JButton btnPorUsuario=new JButton(" Por tipo de usuario ");
        btnPorUsuario.setForeground(Color.black);
        btnPorUsuario.setBackground(Color.white);
        btnPorUsuario.setOpaque(true);
        btnPorUsuario.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnPorUsuario.setBounds(270,80,130,30);

        JButton btnAlfabetic=new JButton(" alfabéticamente ");
        btnAlfabetic.setForeground(Color.black);
        btnAlfabetic.setBackground(Color.white);
        btnAlfabetic.setOpaque(true);
        btnAlfabetic.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnAlfabetic.setBounds(400,80,100,30);

        JButton btnPorGrupo=new JButton(" Por grupo ");
        btnPorGrupo.setForeground(Color.black);
        btnPorGrupo.setBackground(Color.white);
        btnPorGrupo.setOpaque(true);
        btnPorGrupo.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnPorGrupo.setBounds(500,80,100,30);

        //SUBTíTULOS
        JLabel lblTipoUsuario=new JLabel("Tipo de usuario",SwingConstants.CENTER);
        lblTipoUsuario.setForeground(Color.black);
        lblTipoUsuario.setBackground(ventana.getAzulColumnTitle());
        lblTipoUsuario.setOpaque(true);
        lblTipoUsuario.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblTipoUsuario.setBounds(40,20,120,30);

        JLabel lblNombreUsuario=new JLabel("Nombre de usuario",SwingConstants.CENTER);
        lblNombreUsuario.setForeground(Color.black);
        lblNombreUsuario.setBackground(ventana.getAzulColumnTitle());
        lblNombreUsuario.setOpaque(true);
        lblNombreUsuario.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblNombreUsuario.setBounds(160,20,120,30);

        JLabel lblNombreCompleto=new JLabel("Nombre completo",SwingConstants.CENTER);
        lblNombreCompleto.setForeground(Color.black);
        lblNombreCompleto.setBackground(ventana.getAzulColumnTitle());
        lblNombreCompleto.setOpaque(true);
        lblNombreCompleto.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblNombreCompleto.setBounds(280,20,120,30);

        JLabel lblContrasena=new JLabel("Contraseña",SwingConstants.CENTER);
        lblContrasena.setForeground(Color.black);
        lblContrasena.setBackground(ventana.getAzulColumnTitle());
        lblContrasena.setOpaque(true);
        lblContrasena.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblContrasena.setBounds(400,20,120,30);

        JLabel lblGrupoActual=new JLabel("Grupo actual",SwingConstants.CENTER);
        lblGrupoActual.setForeground(Color.black);
        lblGrupoActual.setBackground(ventana.getAzulColumnTitle());
        lblGrupoActual.setOpaque(true);
        lblGrupoActual.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblGrupoActual.setBounds(520,20,120,30);

        JLabel lblHabilitado=new JLabel("Habilitado",SwingConstants.CENTER);
        lblHabilitado.setForeground(Color.black);
        lblHabilitado.setBackground(ventana.getAzulColumnTitle());
        lblHabilitado.setOpaque(true);
        lblHabilitado.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblHabilitado.setBounds(640,20,90,30);

        //USUARIOS
        //***********************************USUARIO1***********************************
        JLabel lblU1A=new JLabel("Maestro",SwingConstants.CENTER);
        lblU1A.setForeground(Color.black);
        lblU1A.setBackground(ventana.getAzulMaestro());
        lblU1A.setOpaque(true);
        lblU1A.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU1A.setBounds(40,50,120,30);

        JLabel lblU1B=new JLabel("alejandrolopez1",SwingConstants.CENTER);
        lblU1B.setForeground(Color.black);
        lblU1B.setBackground(Color.white);
        lblU1B.setOpaque(true);
        lblU1B.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU1B.setBounds(160,50,120,30);

        JLabel lblU1C=new JLabel("Alejandro López",SwingConstants.CENTER);
        lblU1C.setForeground(Color.black);
        lblU1C.setBackground(Color.white);
        lblU1C.setOpaque(true);
        lblU1C.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU1C.setBounds(280,50,120,30);

        JLabel lblU1D=new JLabel("ale123jandro",SwingConstants.CENTER);
        lblU1D.setForeground(Color.black);
        lblU1D.setBackground(Color.white);
        lblU1D.setOpaque(true);
        lblU1D.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU1D.setBounds(400,50,120,30);

        JLabel lblU1E0=new JLabel("3A",SwingConstants.CENTER);
        lblU1E0.setForeground(Color.black);
        lblU1E0.setBackground(Color.white);
        lblU1E0.setOpaque(true);
        lblU1E0.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU1E0.setBounds(520,50,30,30);

        JLabel lblU1E1=new JLabel("3B",SwingConstants.CENTER);
        lblU1E1.setForeground(Color.black);
        lblU1E1.setBackground(Color.white);
        lblU1E1.setOpaque(true);
        lblU1E1.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU1E1.setBounds(550,50,30,30);

        JLabel lblU1E2=new JLabel("3C",SwingConstants.CENTER);
        lblU1E2.setForeground(Color.black);
        lblU1E2.setBackground(Color.white);
        lblU1E2.setOpaque(true);
        lblU1E2.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU1E2.setBounds(580,50,30,30);

        JButton btnU1E3=new JButton("+");
        btnU1E3.setForeground(Color.black);
        btnU1E3.setBackground(Color.white);
        btnU1E3.setOpaque(true);
        btnU1E3.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnU1E3.setBounds(610,50,30,30);

        JButton btnU1F0=new JButton("");
        btnU1F0.setForeground(Color.black);
        btnU1F0.setBackground(ventana.getVerdeADS());
        btnU1F0.setOpaque(true);
        btnU1F0.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnU1F0.setBounds(640,50,45,30);

        JButton btnU1F1=new JButton("");
        btnU1F1.setForeground(Color.black);
        btnU1F1.setBackground(Color.white);
        btnU1F1.setOpaque(true);
        btnU1F1.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnU1F1.setBounds(685,50,45,30);

        //***********************************USUARIO2***********************************
        JLabel lblU2A=new JLabel("Maestro",SwingConstants.CENTER);
        lblU2A.setForeground(Color.black);
        lblU2A.setBackground(ventana.getAzulMaestro());
        lblU2A.setOpaque(true);
        lblU2A.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU2A.setBounds(40,80,120,30);

        JLabel lblU2B=new JLabel("Leo-1024-cundo",SwingConstants.CENTER);
        lblU2B.setForeground(Color.black);
        lblU2B.setBackground(Color.white);
        lblU2B.setOpaque(true);
        lblU2B.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU2B.setBounds(160,80,120,30);

        JLabel lblU2C=new JLabel("Leocundo Aguilar",SwingConstants.CENTER);
        lblU2C.setForeground(Color.black);
        lblU2C.setBackground(Color.white);
        lblU2C.setOpaque(true);
        lblU2C.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU2C.setBounds(280,80,120,30);

        JLabel lblU2D=new JLabel("10011101",SwingConstants.CENTER);
        lblU2D.setForeground(Color.black);
        lblU2D.setBackground(Color.white);
        lblU2D.setOpaque(true);
        lblU2D.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU2D.setBounds(400,80,120,30);

        JLabel lblU2E0=new JLabel("3B",SwingConstants.CENTER);
        lblU2E0.setForeground(Color.black);
        lblU2E0.setBackground(Color.white);
        lblU2E0.setOpaque(true);
        lblU2E0.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU2E0.setBounds(520,80,90,30);

        JButton btnU2E3=new JButton("+");
        btnU2E3.setForeground(Color.black);
        btnU2E3.setBackground(Color.white);
        btnU2E3.setOpaque(true);
        btnU2E3.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnU2E3.setBounds(610,80,30,30);

        JButton btnU2F0=new JButton("");
        btnU2F0.setForeground(Color.black);
        btnU2F0.setBackground(ventana.getVerdeADS());
        btnU2F0.setOpaque(true);
        btnU2F0.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnU2F0.setBounds(640,80,45,30);

        JButton btnU2F1=new JButton("");
        btnU2F1.setForeground(Color.black);
        btnU2F1.setBackground(Color.white);
        btnU2F1.setOpaque(true);
        btnU2F1.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnU2F1.setBounds(685,80,45,30);

        //***********************************USUARIO3***********************************
        JLabel lblU3A=new JLabel("Maestro",SwingConstants.CENTER);
        lblU3A.setForeground(Color.black);
        lblU3A.setBackground(ventana.getAzulMaestro());
        lblU3A.setOpaque(true);
        lblU3A.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU3A.setBounds(40,110,120,30);

        JLabel lblU3B=new JLabel("MikeEscobosa",SwingConstants.CENTER);
        lblU3B.setForeground(Color.black);
        lblU3B.setBackground(Color.white);
        lblU3B.setOpaque(true);
        lblU3B.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU3B.setBounds(160,110,120,30);

        JLabel lblU3C=new JLabel("Miguel Escobosa",SwingConstants.CENTER);
        lblU3C.setForeground(Color.black);
        lblU3C.setBackground(Color.white);
        lblU3C.setOpaque(true);
        lblU3C.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU3C.setBounds(280,110,120,30);

        JLabel lblU3D=new JLabel("maiki1993",SwingConstants.CENTER);
        lblU3D.setForeground(Color.black);
        lblU3D.setBackground(Color.white);
        lblU3D.setOpaque(true);
        lblU3D.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU3D.setBounds(400,110,120,30);

        JLabel lblU3E0=new JLabel("",SwingConstants.CENTER);
        lblU3E0.setForeground(Color.black);
        lblU3E0.setBackground(Color.white);
        lblU3E0.setOpaque(true);
        lblU3E0.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU3E0.setBounds(520,110,90,30);

        JButton btnU3E3=new JButton("+");
        btnU3E3.setForeground(Color.black);
        btnU3E3.setBackground(Color.white);
        btnU3E3.setOpaque(true);
        btnU3E3.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnU3E3.setBounds(610,110,30,30);

        JButton btnU3F0=new JButton("");
        btnU3F0.setForeground(Color.black);
        btnU3F0.setBackground(Color.white);
        btnU3F0.setOpaque(true);
        btnU3F0.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnU3F0.setBounds(640,110,45,30);

        JButton btnU3F1=new JButton("");
        btnU3F1.setForeground(Color.black);
        btnU3F1.setBackground(ventana.getRojoADS());
        btnU3F1.setOpaque(true);
        btnU3F1.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnU3F1.setBounds(685,110,45,30);

        //***********************************USUARIO4***********************************
        JLabel lblU4A=new JLabel("Maestro",SwingConstants.CENTER);
        lblU4A.setForeground(Color.black);
        lblU4A.setBackground(ventana.getAzulMaestro());
        lblU4A.setOpaque(true);
        lblU4A.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU4A.setBounds(40,140,120,30);

        JLabel lblU4B=new JLabel("VioletaUABC",SwingConstants.CENTER);
        lblU4B.setForeground(Color.black);
        lblU4B.setBackground(Color.white);
        lblU4B.setOpaque(true);
        lblU4B.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU4B.setBounds(160,140,120,30);

        JLabel lblU4C=new JLabel("Thelma Ocegueda",SwingConstants.CENTER);
        lblU4C.setForeground(Color.black);
        lblU4C.setBackground(Color.white);
        lblU4C.setOpaque(true);
        lblU4C.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU4C.setBounds(280,140,120,30);

        JLabel lblU4D=new JLabel("ADS4LIFE",SwingConstants.CENTER);
        lblU4D.setForeground(Color.black);
        lblU4D.setBackground(Color.white);
        lblU4D.setOpaque(true);
        lblU4D.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU4D.setBounds(400,140,120,30);

        JLabel lblU4E0=new JLabel("3A",SwingConstants.CENTER);
        lblU4E0.setForeground(Color.black);
        lblU4E0.setBackground(Color.white);
        lblU4E0.setOpaque(true);
        lblU4E0.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU4E0.setBounds(520,140,90,30);

        JButton btnU4E3=new JButton("+");
        btnU4E3.setForeground(Color.black);
        btnU4E3.setBackground(Color.white);
        btnU4E3.setOpaque(true);
        btnU4E3.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnU4E3.setBounds(610,140,30,30);

        JButton btnU4F0=new JButton("");
        btnU4F0.setForeground(Color.black);
        btnU4F0.setBackground(ventana.getVerdeADS());
        btnU4F0.setOpaque(true);
        btnU4F0.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnU4F0.setBounds(640,140,45,30);

        JButton btnU4F1=new JButton("");
        btnU4F1.setForeground(Color.black);
        btnU4F1.setBackground(Color.white);
        btnU4F1.setOpaque(true);
        btnU4F1.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnU4F1.setBounds(685,140,45,30);

        //***********************************USUARIO5***********************************
        JLabel lblU5A=new JLabel("Maestro",SwingConstants.CENTER);
        lblU5A.setForeground(Color.black);
        lblU5A.setBackground(ventana.getAzulMaestro());
        lblU5A.setOpaque(true);
        lblU5A.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU5A.setBounds(40,170,120,30);

        JLabel lblU5B=new JLabel("JaquezMates",SwingConstants.CENTER);
        lblU5B.setForeground(Color.black);
        lblU5B.setBackground(Color.white);
        lblU5B.setOpaque(true);
        lblU5B.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU5B.setBounds(160,170,120,30);

        JLabel lblU5C=new JLabel("Alberto Jaquez",SwingConstants.CENTER);
        lblU5C.setForeground(Color.black);
        lblU5C.setBackground(Color.white);
        lblU5C.setOpaque(true);
        lblU5C.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU5C.setBounds(280,170,120,30);

        JLabel lblU5D=new JLabel("elGiorgio",SwingConstants.CENTER);
        lblU5D.setForeground(Color.black);
        lblU5D.setBackground(Color.white);
        lblU5D.setOpaque(true);
        lblU5D.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU5D.setBounds(400,170,120,30);

        JLabel lblU5E0=new JLabel("4A",SwingConstants.CENTER);
        lblU5E0.setForeground(Color.black);
        lblU5E0.setBackground(Color.white);
        lblU5E0.setOpaque(true);
        lblU5E0.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU5E0.setBounds(520,170,90,30);

        JButton btnU5E3=new JButton("+");
        btnU5E3.setForeground(Color.black);
        btnU5E3.setBackground(Color.white);
        btnU5E3.setOpaque(true);
        btnU5E3.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnU5E3.setBounds(610,170,30,30);

        JButton btnU5F0=new JButton("");
        btnU5F0.setForeground(Color.black);
        btnU5F0.setBackground(ventana.getVerdeADS());
        btnU5F0.setOpaque(true);
        btnU5F0.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnU5F0.setBounds(640,170,45,30);

        JButton btnU5F1=new JButton("");
        btnU5F1.setForeground(Color.black);
        btnU5F1.setBackground(Color.white);
        btnU5F1.setOpaque(true);
        btnU5F1.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnU5F1.setBounds(685,170,45,30);

        //***********************************USUARIO6***********************************
        JLabel lblU6A=new JLabel("Maestro",SwingConstants.CENTER);
        lblU6A.setForeground(Color.black);
        lblU6A.setBackground(ventana.getAzulMaestro());
        lblU6A.setOpaque(true);
        lblU6A.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU6A.setBounds(40,200,120,30);

        JLabel lblU6B=new JLabel("CaudilloPepe1",SwingConstants.CENTER);
        lblU6B.setForeground(Color.black);
        lblU6B.setBackground(Color.white);
        lblU6B.setOpaque(true);
        lblU6B.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU6B.setBounds(160,200,120,30);

        JLabel lblU6C=new JLabel("Alberto Carrillo",SwingConstants.CENTER);
        lblU6C.setForeground(Color.black);
        lblU6C.setBackground(Color.white);
        lblU6C.setOpaque(true);
        lblU6C.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU6C.setBounds(280,200,120,30);

        JLabel lblU6D=new JLabel("BeansProyect",SwingConstants.CENTER);
        lblU6D.setForeground(Color.black);
        lblU6D.setBackground(Color.white);
        lblU6D.setOpaque(true);
        lblU6D.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU6D.setBounds(400,200,120,30);

        JLabel lblU6E0=new JLabel("1B",SwingConstants.CENTER);
        lblU6E0.setForeground(Color.black);
        lblU6E0.setBackground(Color.white);
        lblU6E0.setOpaque(true);
        lblU6E0.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU6E0.setBounds(520,200,90,30);

        JButton btnU6E3=new JButton("+");
        btnU6E3.setForeground(Color.black);
        btnU6E3.setBackground(Color.white);
        btnU6E3.setOpaque(true);
        btnU6E3.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnU6E3.setBounds(610,200,30,30);

        JButton btnU6F0=new JButton("");
        btnU6F0.setForeground(Color.black);
        btnU6F0.setBackground(ventana.getVerdeADS());
        btnU6F0.setOpaque(true);
        btnU6F0.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnU6F0.setBounds(640,200,45,30);

        JButton btnU6F1=new JButton("");
        btnU6F1.setForeground(Color.black);
        btnU6F1.setBackground(Color.white);
        btnU6F1.setOpaque(true);
        btnU6F1.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnU6F1.setBounds(685,200,45,30);

        //***********************************USUARIO7***********************************
        JLabel lblU7A=new JLabel("Alumno",SwingConstants.CENTER);
        lblU7A.setForeground(Color.black);
        lblU7A.setBackground(ventana.getAzulAlumno());
        lblU7A.setOpaque(true);
        lblU7A.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU7A.setBounds(40,230,120,30);

        JLabel lblU7B=new JLabel("CuriousGeorge",SwingConstants.CENTER);
        lblU7B.setForeground(Color.black);
        lblU7B.setBackground(Color.white);
        lblU7B.setOpaque(true);
        lblU7B.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU7B.setBounds(160,230,120,30);

        JLabel lblU7C=new JLabel("Jorge Martínez",SwingConstants.CENTER);
        lblU7C.setForeground(Color.black);
        lblU7C.setBackground(Color.white);
        lblU7C.setOpaque(true);
        lblU7C.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU7C.setBounds(280,230,120,30);

        JLabel lblU7D=new JLabel("giorgiBalloon",SwingConstants.CENTER);
        lblU7D.setForeground(Color.black);
        lblU7D.setBackground(Color.white);
        lblU7D.setOpaque(true);
        lblU7D.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU7D.setBounds(400,230,120,30);

        JLabel lblU7E0=new JLabel("1A",SwingConstants.CENTER);
        lblU7E0.setForeground(Color.black);
        lblU7E0.setBackground(Color.white);
        lblU7E0.setOpaque(true);
        lblU7E0.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU7E0.setBounds(520,230,120,30);

        JButton btnU7F0=new JButton("");
        btnU7F0.setForeground(Color.black);
        btnU7F0.setBackground(ventana.getVerdeADS());
        btnU7F0.setOpaque(true);
        btnU7F0.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnU7F0.setBounds(640,230,45,30);

        JButton btnU7F1=new JButton("");
        btnU7F1.setForeground(Color.black);
        btnU7F1.setBackground(Color.white);
        btnU7F1.setOpaque(true);
        btnU7F1.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnU7F1.setBounds(685,230,45,30);

        //***********************************USUARIO8***********************************
        JLabel lblU8A=new JLabel("Alumno",SwingConstants.CENTER);
        lblU8A.setForeground(Color.black);
        lblU8A.setBackground(ventana.getAzulAlumno());
        lblU8A.setOpaque(true);
        lblU8A.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU8A.setBounds(40,260,120,30);

        JLabel lblU8B=new JLabel("JuanVC",SwingConstants.CENTER);
        lblU8B.setForeground(Color.black);
        lblU8B.setBackground(Color.white);
        lblU8B.setOpaque(true);
        lblU8B.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU8B.setBounds(160,260,120,30);

        JLabel lblU8C=new JLabel("Juan Varela",SwingConstants.CENTER);
        lblU8C.setForeground(Color.black);
        lblU8C.setBackground(Color.white);
        lblU8C.setOpaque(true);
        lblU8C.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU8C.setBounds(280,260,120,30);

        JLabel lblU8D=new JLabel("123Caballero123",SwingConstants.CENTER);
        lblU8D.setForeground(Color.black);
        lblU8D.setBackground(Color.white);
        lblU8D.setOpaque(true);
        lblU8D.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU8D.setBounds(400,260,120,30);

        JLabel lblU8E0=new JLabel("6B",SwingConstants.CENTER);
        lblU8E0.setForeground(Color.black);
        lblU8E0.setBackground(Color.white);
        lblU8E0.setOpaque(true);
        lblU8E0.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU8E0.setBounds(520,260,120,30);

        JButton btnU8F0=new JButton("");
        btnU8F0.setForeground(Color.black);
        btnU8F0.setBackground(ventana.getVerdeADS());
        btnU8F0.setOpaque(true);
        btnU8F0.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnU8F0.setBounds(640,260,45,30);

        JButton btnU8F1=new JButton("");
        btnU8F1.setForeground(Color.black);
        btnU8F1.setBackground(Color.white);
        btnU8F1.setOpaque(true);
        btnU8F1.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnU8F1.setBounds(685,260,45,30);

        //***********************************USUARIO9***********************************
        JLabel lblU9A=new JLabel("Maestro",SwingConstants.CENTER);
        lblU9A.setForeground(Color.black);
        lblU9A.setBackground(ventana.getAzulMaestro());
        lblU9A.setOpaque(true);
        lblU9A.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU9A.setBounds(40,290,120,30);

        JLabel lblU9B=new JLabel("MauricioTheMan",SwingConstants.CENTER);
        lblU9B.setForeground(Color.black);
        lblU9B.setBackground(Color.white);
        lblU9B.setOpaque(true);
        lblU9B.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU9B.setBounds(160,290,120,30);

        JLabel lblU9C=new JLabel("Mauricio Sánchez",SwingConstants.CENTER);
        lblU9C.setForeground(Color.black);
        lblU9C.setBackground(Color.white);
        lblU9C.setOpaque(true);
        lblU9C.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU9C.setBounds(280,290,120,30);

        JLabel lblU9D=new JLabel("mauri1986",SwingConstants.CENTER);
        lblU9D.setForeground(Color.black);
        lblU9D.setBackground(Color.white);
        lblU9D.setOpaque(true);
        lblU9D.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU9D.setBounds(400,290,120,30);

        JLabel lblU9E0=new JLabel("6A",SwingConstants.CENTER);
        lblU9E0.setForeground(Color.black);
        lblU9E0.setBackground(Color.white);
        lblU9E0.setOpaque(true);
        lblU9E0.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU9E0.setBounds(520,290,45,30);

        JLabel lblU9E1=new JLabel("6B",SwingConstants.CENTER);
        lblU9E1.setForeground(Color.black);
        lblU9E1.setBackground(Color.white);
        lblU9E1.setOpaque(true);
        lblU9E1.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblU9E1.setBounds(565,290,45,30);

        JButton btnU9E3=new JButton("+");
        btnU9E3.setForeground(Color.black);
        btnU9E3.setBackground(Color.white);
        btnU9E3.setOpaque(true);
        btnU9E3.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnU9E3.setBounds(610,290,30,30);

        JButton btnU9F0=new JButton("");
        btnU9F0.setForeground(Color.black);
        btnU9F0.setBackground(ventana.getVerdeADS());
        btnU9F0.setOpaque(true);
        btnU9F0.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnU9F0.setBounds(640,290,45,30);

        JButton btnU9F1=new JButton("");
        btnU9F1.setForeground(Color.black);
        btnU9F1.setBackground(Color.white);
        btnU9F1.setOpaque(true);
        btnU9F1.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnU9F1.setBounds(685,290,45,30);

        JLabel lblCrearUsuario=new JLabel(" Crear usuario ",SwingConstants.CENTER);
        lblCrearUsuario.setForeground(Color.white);
        lblCrearUsuario.setBackground(ventana.getAzulLabel());
        lblCrearUsuario.setOpaque(true);
        lblCrearUsuario.setBorder(BorderFactory.createLineBorder(Color.black,2));
        lblCrearUsuario.setBounds(350,205,100,30);

        JLabel lblTipoUsuario2=new JLabel("Tipo de usuario:");
        lblTipoUsuario2.setForeground(Color.black);
        lblTipoUsuario2.setBackground(Color.white);
        lblTipoUsuario2.setOpaque(true);
        //lblU6B.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblTipoUsuario2.setBounds(10,6,100,25);

        JButton btnAlumno=new JButton("Alumno");
        btnAlumno.setForeground(Color.black);
        btnAlumno.setBackground(ventana.getVerdeADS());
        btnAlumno.setOpaque(true);
        btnAlumno.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnAlumno.setBounds(130,10,80,25);

        JButton btnMaestro=new JButton("Maestro");
        btnMaestro.setForeground(Color.black);
        btnMaestro.setBackground(Color.white);
        btnMaestro.setOpaque(true);
        btnMaestro.setBorder(BorderFactory.createLineBorder(Color.black,1));
        btnMaestro.setBounds(210,10,80,25);

        JLabel lblNombreUsuario2=new JLabel("Nombre de usuario:");
        lblNombreUsuario2.setForeground(Color.black);
        lblNombreUsuario2.setBackground(Color.white);
        lblNombreUsuario2.setOpaque(true);
        lblNombreUsuario2.setBounds(10,30,120,25);

        JTextField txtfnombreUsuario=new JTextField();
        txtfnombreUsuario.setBounds(10,55,280,25);
        txtfnombreUsuario.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));

        JLabel lblNombreCompleto2=new JLabel("Nombre completo:");
        lblNombreCompleto2.setForeground(Color.black);
        lblNombreCompleto2.setBackground(Color.white);
        lblNombreCompleto2.setOpaque(true);
        lblNombreCompleto2.setBounds(10,80,120,25);

        JTextField txtfNombreCompleto=new JTextField();
        txtfNombreCompleto.setBounds(10,105,280,25);
        txtfNombreCompleto.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));

        JLabel lblContrasena2=new JLabel("Contraseña:");
        lblContrasena2.setForeground(Color.black);
        lblContrasena2.setBackground(Color.white);
        lblContrasena2.setOpaque(true);
        lblContrasena2.setBounds(10,130,120,25);

        JTextField txtfContrasena=new JTextField();
        txtfContrasena.setBounds(10,155,280,25);
        txtfContrasena.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));

        JButton btnCrear=new JButton("Crear");
        btnCrear.setBounds(190,185,100,30);
        btnCrear.setForeground(Color.black);
        btnCrear.setBackground(ventana.getAzulLabel());
        btnCrear.setOpaque(true);
        btnCrear.setBorder(BorderFactory.createLineBorder(Color.black,2));

        JButton btnLastPanel=new JButton("Last Panel");
        btnLastPanel.setBounds(250,0,100,30);
        btnLastPanel.setForeground(Color.black);
        btnLastPanel.setBackground(ventana.getAzulLabel());
        btnLastPanel.setOpaque(true);
        btnLastPanel.setBorder(BorderFactory.createLineBorder(Color.black,2));
        btnLastPanel.addActionListener(new ActionListener() {
            //@Override
            public void actionPerformed(ActionEvent e) {
                ventana.getLayout().show(ventana.getContentPane(),"IniciaSesion");
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
                ventana.getLayout().show(ventana.getContentPane(),"MenuPrincipalMaestro");
            }
        });

        pnlN.add(lblModoAdmin);
        pnlN.add(btnCerrarSesion);
        pnlN.add(lblTitle);
        pnlN.add(lblOrdenar);
        pnlN.add(btnPorIngreso);
        pnlN.add(btnPorUsuario);
        pnlN.add(btnAlfabetic);
        pnlN.add(btnPorGrupo);
        pnlC.add(pnlScrollC);
        pnlC.add(pnlCrearUsuarios);
        pnlScrollC.setViewportView(pnlUsuarios);
        //SUBTíTULOS COLUMNAS
        pnlUsuarios.add(lblTipoUsuario);
        pnlUsuarios.add(lblNombreUsuario);
        pnlUsuarios.add(lblNombreCompleto);
        pnlUsuarios.add(lblContrasena);
        pnlUsuarios.add(lblGrupoActual);
        pnlUsuarios.add(lblGrupoActual);
        pnlUsuarios.add(lblHabilitado);
        //USUARIO1
        pnlUsuarios.add(lblU1A);
        pnlUsuarios.add(lblU1B);
        pnlUsuarios.add(lblU1C);
        pnlUsuarios.add(lblU1D);
        pnlUsuarios.add(lblU1E0);
        pnlUsuarios.add(lblU1E1);
        pnlUsuarios.add(lblU1E2);
        pnlUsuarios.add(btnU1E3);
        pnlUsuarios.add(btnU1F0);
        pnlUsuarios.add(btnU1F1);

        //USUARIO2
        pnlUsuarios.add(lblU2A);
        pnlUsuarios.add(lblU2B);
        pnlUsuarios.add(lblU2C);
        pnlUsuarios.add(lblU2D);
        pnlUsuarios.add(lblU2E0);
        pnlUsuarios.add(btnU2E3);
        pnlUsuarios.add(btnU2F0);
        pnlUsuarios.add(btnU2F1);
        //USUARIO3
        pnlUsuarios.add(lblU3A);
        pnlUsuarios.add(lblU3B);
        pnlUsuarios.add(lblU3C);
        pnlUsuarios.add(lblU3D);
        pnlUsuarios.add(lblU3E0);
        pnlUsuarios.add(btnU3E3);
        pnlUsuarios.add(btnU3F0);
        pnlUsuarios.add(btnU3F1);
        //USUARIO4
        pnlUsuarios.add(lblU4A);
        pnlUsuarios.add(lblU4B);
        pnlUsuarios.add(lblU4C);
        pnlUsuarios.add(lblU4D);
        pnlUsuarios.add(lblU4E0);
        pnlUsuarios.add(btnU4E3);
        pnlUsuarios.add(btnU4F0);
        pnlUsuarios.add(btnU4F1);
        //USUARIO5
        pnlUsuarios.add(lblU5A);
        pnlUsuarios.add(lblU5B);
        pnlUsuarios.add(lblU5C);
        pnlUsuarios.add(lblU5D);
        pnlUsuarios.add(lblU5E0);
        pnlUsuarios.add(btnU5E3);
        pnlUsuarios.add(btnU5F0);
        pnlUsuarios.add(btnU5F1);
        //USUARIO6
        pnlUsuarios.add(lblU6A);
        pnlUsuarios.add(lblU6B);
        pnlUsuarios.add(lblU6C);
        pnlUsuarios.add(lblU6D);
        pnlUsuarios.add(lblU6E0);
        pnlUsuarios.add(btnU6E3);
        pnlUsuarios.add(btnU6F0);
        pnlUsuarios.add(btnU6F1);
        //USUARIO7
        pnlUsuarios.add(lblU7A);
        pnlUsuarios.add(lblU7B);
        pnlUsuarios.add(lblU7C);
        pnlUsuarios.add(lblU7D);
        pnlUsuarios.add(lblU7E0);
        pnlUsuarios.add(btnU7F0);
        pnlUsuarios.add(btnU7F1);
        //USUARIO8
        pnlUsuarios.add(lblU8A);
        pnlUsuarios.add(lblU8B);
        pnlUsuarios.add(lblU8C);
        pnlUsuarios.add(lblU8D);
        pnlUsuarios.add(lblU8E0);
        pnlUsuarios.add(btnU8F0);
        pnlUsuarios.add(btnU8F1);
        //USUARIO9
        pnlUsuarios.add(lblU9A);
        pnlUsuarios.add(lblU9B);
        pnlUsuarios.add(lblU9C);
        pnlUsuarios.add(lblU9D);
        pnlUsuarios.add(lblU9E0);
        pnlUsuarios.add(lblU9E1);
        pnlUsuarios.add(btnU9E3);
        pnlUsuarios.add(btnU9F0);
        pnlUsuarios.add(btnU9F1);
        //CREAR USUARIO
        pnlC.add(lblCrearUsuario);
        pnlCrearUsuarios.add(lblTipoUsuario2);
        pnlCrearUsuarios.add(btnAlumno);
        pnlCrearUsuarios.add(btnMaestro);
        pnlCrearUsuarios.add(lblNombreUsuario2);
        pnlCrearUsuarios.add(txtfnombreUsuario);
        pnlCrearUsuarios.add(lblNombreCompleto2);
        pnlCrearUsuarios.add(txtfNombreCompleto);
        pnlCrearUsuarios.add(lblContrasena2);
        pnlCrearUsuarios.add(txtfContrasena);
        pnlCrearUsuarios.add(btnCrear);

        pnlS.add(btnLastPanel);
        pnlS.add(btnNextPanel);
        add(pnlN);
        add(pnlC);
        add(pnlS);

    }
}
