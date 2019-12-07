package gui;

import mouseListener.Raton;

import javax.swing.*;
import java.awt.*;

public class AA_GUI extends JFrame {

    int width=800;
    int height=700;

    public Raton mouseListener;
    //https://www.rapidtables.com/web/color/RGB_Color.html
    //crear tus propios colores fácilmente
    public Color azulFondo =new Color(102,230,255);
    public Color azulLabel=new Color(0,128,255);
    public Color azulColumnTitle=new Color(102,178,255);
    public Color azulAlumno=new Color(0,204,204);
    public Color azulMaestro=new Color(0,102,204);

    public Color verdeADS=new Color(0,255,0);
    public Color rojoADS=new Color(255,0,0);

    public AA_GUI(){

        setTitle("My Project");
        setBounds(100,100,width,height);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        JPanel pnlPrincipal=(JPanel) getContentPane();
        pnlPrincipal.setLayout(new CardLayout());

        Recursos.init();
        mouseListener = new Raton();
        addMouseListener(mouseListener);

        IniciaSesion iniciaSesion=new IniciaSesion(this);
        pnlPrincipal.add(iniciaSesion,"IniciaSesion");

        AdministraUsuarios administraUsuarios=new AdministraUsuarios(this);
        pnlPrincipal.add(administraUsuarios,"AdministraUsuarios");

        MenuPrincipalMaestro menuPrincipalMaestro=new MenuPrincipalMaestro(this);
        pnlPrincipal.add(menuPrincipalMaestro,"MenuPrincipalMaestro");

        CrearEmparejamientos crearEmparejamientos=new CrearEmparejamientos(this);
        pnlPrincipal.add(crearEmparejamientos,"CrearEmparejamientos");

        CrearRompecabezas crearRompecabezas=new CrearRompecabezas(this);
        pnlPrincipal.add(crearRompecabezas,"CrearRompecabezas");

        CrearRellena crearRellena=new CrearRellena(this);
        pnlPrincipal.add(crearRellena,"CrearRellena");

        EditarRompecabezas editarRompecabezas=new EditarRompecabezas(this);
        pnlPrincipal.add(editarRompecabezas,"EditarRompecabezas");

        EditarEmparejamientos editarEmparejamientos=new EditarEmparejamientos(this);
        pnlPrincipal.add(editarEmparejamientos,"EditarEmparejamientos");

        EditarRellena editarRellena=new EditarRellena(this);
        pnlPrincipal.add(editarRellena,"EditarRellena");

        ConsultarLeccionesMaestro consultarLeccionesMaestro=new ConsultarLeccionesMaestro(this);
        pnlPrincipal.add(consultarLeccionesMaestro,"ConsultarLeccionesMaestro");

        MenuPrincipalAlumno menuPrincipalAlumno=new MenuPrincipalAlumno(this);
        pnlPrincipal.add(menuPrincipalAlumno,"MenuPrincipalAlumno");

        HacerLeccion hacerLeccion=new HacerLeccion(this);
        pnlPrincipal.add(hacerLeccion,"HacerLeccion");

        HacerRompecabezas hacerRompecabezas=new HacerRompecabezas(this);
        pnlPrincipal.add(hacerRompecabezas,"HacerRompecabezas");

        HacerEmparejamientos hacerEmparejamientos=new HacerEmparejamientos(this);
        pnlPrincipal.add(hacerEmparejamientos,"HacerEmparejamientos");

        HacerRellena hacerRellena=new HacerRellena(this);
        pnlPrincipal.add(hacerRellena,"HacerRellena");
    }
    public CardLayout getLayout(){
        return (CardLayout) getContentPane().getLayout();
    }

    public Color getAzulFondo(){
        return azulFondo;
    }
    public Color getAzulLabel(){
        return azulLabel;
    }
    public Color getAzulColumnTitle(){
        return azulColumnTitle;
    }
    public Color getAzulAlumno() {
        return azulAlumno;
    }
    public Color getAzulMaestro() {
        return azulMaestro;
    }
    public Color getVerdeADS() {
        return verdeADS;
    }
    public Color getRojoADS() {
        return rojoADS;
    }

    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
}
