package gui;

        import javax.swing.*;
        import javax.swing.border.Border;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class HacerRompecabezas extends JPanel {
    private AA_GUI ventana;

    public HacerRompecabezas(final AA_GUI ventana){
        this.ventana=ventana;
        setLayout(null);
        setBackground(ventana.getAzulFondo());

        JPanel pnlN=new JPanel();
        JPanel pnlS=new JPanel();
        JPanel pnlC=new JPanel();
        JPanel pnlDatosCuriosos=new JPanel();

        pnlN.setLayout(null);
        pnlC.setLayout(null);
        pnlS.setLayout(null);
        pnlDatosCuriosos.setLayout(null);

        pnlN.setOpaque(false);
        pnlS.setOpaque(false);
        pnlC.setOpaque(false);
        pnlDatosCuriosos.setOpaque(true);

        pnlN.setBounds(0,0,ventana.getWidth(),120);
        pnlC.setBounds(0,120,ventana.getWidth(),480);
        pnlS.setBounds(0,615,ventana.getWidth(),70);
        pnlDatosCuriosos.setBounds(420,320,350,150);

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

        JLabel lblTitle=new JLabel("Arrecifes",SwingConstants.CENTER);
        lblTitle.setForeground(ventana.getAzulLabel());
        lblTitle.setBackground(Color.white);
        lblTitle.setOpaque(true);
        lblTitle.setBorder(BorderFactory.createLineBorder(Color.black,2));
        lblTitle.setBounds(330,35,140,30);

        JLabel lblRompecabezas=new JLabel("¡Arma el rompecabezas!",SwingConstants.CENTER);
        lblRompecabezas.setForeground(Color.black);
        lblRompecabezas.setOpaque(false);
        lblRompecabezas.setBounds(320,80,160,30);

        Font f=new Font("TimesRoman",Font.BOLD,20);

        JLabel lblDatosCuriosos=new JLabel("Datos curiosos:",SwingConstants.CENTER);
        lblDatosCuriosos.setForeground(Color.white);
        lblDatosCuriosos.setBackground(ventana.getAzulLabel());
        lblDatosCuriosos.setOpaque(true);
        lblDatosCuriosos.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblDatosCuriosos.setBounds(420,290,120,30);

        JLabel lblRenglon1=new JLabel("¿Suena raro? Se calcula que más del 90% de las especies");
        lblRenglon1.setForeground(Color.black);
        lblRenglon1.setBounds(2,0,330,20);

        JLabel lblRenglon2=new JLabel("marinas dependen directa o indirectamente de los arrecifes");
        lblRenglon2.setForeground(Color.black);
        lblRenglon2.setBounds(2,20,330,20);

        JLabel lblRenglon3=new JLabel("de coral. Sin embargo los arrecifes comprenden menos del");
        lblRenglon3.setForeground(Color.black);
        lblRenglon3.setBounds(2,40,330,20);

        JLabel lblRenglon4=new JLabel("0.5% del fondo del mar.");
        lblRenglon4.setForeground(Color.black);
        lblRenglon4.setBounds(2,60,330,20);

        JLabel lblRenglon5=new JLabel("Se calcula que existen unas 4000 especies de peces en los");
        lblRenglon5.setForeground(Color.black);
        lblRenglon5.setBounds(2,80,330,20);

        JLabel lblRenglon6=new JLabel("arrecifes de coral de todo el mundo. Representan una");
        lblRenglon6.setForeground(Color.black);
        lblRenglon6.setBounds(2,100,330,20);

        JLabel lblRenglon7=new JLabel("cuarta parte del total de especies de pez que se conocen.");
        lblRenglon7.setForeground(Color.black);
        lblRenglon7.setBounds(2,120,330,20);

        JLabel lblDudasComentarios=new JLabel("Dudas o comentarios:",SwingConstants.CENTER);
        lblDudasComentarios.setForeground(Color.white);
        lblDudasComentarios.setBackground(ventana.getAzulLabel());
        lblDudasComentarios.setOpaque(true);
        lblDudasComentarios.setBorder(BorderFactory.createLineBorder(Color.black,1));
        lblDudasComentarios.setBounds(10,290,140,30);

        JTextArea txtaAlumnosComentarios=new JTextArea("Por favor comparte tus dudas.");
        txtaAlumnosComentarios.setForeground(Color.black);
        txtaAlumnosComentarios.setBounds(10,320,400,150);
        txtaAlumnosComentarios.setBorder(BorderFactory.createLineBorder(ventana.getAzulLabel(),2));

        JButton btnGuardarEntregar=new JButton("Guardar y entregar lección");
        btnGuardarEntregar.setBounds(520,240,160,30);
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
                ventana.getLayout().show(ventana.getContentPane(),"HacerEmparejamientos");
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
                ventana.getLayout().show(ventana.getContentPane(),"HacerRellena");
            }
        });

        pnlN.add(lblModoAdmin);
        pnlN.add(btnMenuPrincipal);
        pnlN.add(btnHacerLeccion);
        pnlN.add(btnConsultarLecciones);
        pnlN.add(btnCerrarSesion);
        pnlN.add(lblTitle);
        pnlN.add(lblRompecabezas);

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
        pnlDatosCuriosos.add(lblRenglon7);

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
        g2d.setColor(Color.black);
        g2d.drawRect(420,216,133,88);

        int x=0;
        int y=0;
        int k=0;
        for(int i=0;i<3;i++){
            x=0;
            for(int j=0;j<3;j++){
                g.drawImage(Recursos.listaRompecabezas[k],x+10,y+140,133,88,null);
                x=x+133;
                k++;
            }
            y=y+88;

        }

        x=0;
        y=0;
        k=0;
        g2d.setColor(Color.black);
        for(int i=0;i<3;i++){
            x=0;
            for(int j=0;j<3;j++){
                g2d.drawRect(x+10,y+140,133,88);
                x=x+133;
                k++;
            }
            y=y+88;
        }
        g.drawImage(Recursos.arrecifeResized,573,193,null);
    }
}



