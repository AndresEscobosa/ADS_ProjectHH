package gui;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Recursos {

    public static BufferedImage Leccion_A;
    public static Image Leccion_AResized;

    public static BufferedImage Leccion_B;
    public static Image Leccion_BResized;

    public static BufferedImage Leccion_C;
    public static Image Leccion_CResized;

    public static BufferedImage image_icon;
    public static Image image_iconResized;

    public static BufferedImage kids;
    public static Image kidsResized;

    public static BufferedImage fuera;
    public static Image fueraResized;

    public static BufferedImage dentro;
    public static Image dentroResized;

    public static BufferedImage gato;
    public static Image gatoResized;

    public static BufferedImage perro;
    public static Image perroResized;

    public static BufferedImage[] listaRompecabezas;

    public static BufferedImage arrecife;
    public static Image arrecifeResized;

    public static BufferedImage xolo;
    public static Image xoloResized;

    public static BufferedImage miguelHidalgo;
    public static Image miguelHidalgoResized;

    public static BufferedImage mariposaMonarca;
    public static Image mariposaMonarcaResized;

    public static void init(){
        Leccion_A=cargarImagen("../emparejamientos.png");
        Leccion_AResized=Leccion_A.getScaledInstance(100,100,Image.SCALE_DEFAULT);

        Leccion_B=cargarImagen("../rompecabezas.png");
        Leccion_BResized=Leccion_B.getScaledInstance(100,100,Image.SCALE_DEFAULT);

        Leccion_C=cargarImagen("../rellena.png");
        Leccion_CResized=Leccion_C.getScaledInstance(100,100,Image.SCALE_DEFAULT);

        image_icon=cargarImagen("../image_icon.png");
        image_iconResized=image_icon.getScaledInstance(100,100,Image.SCALE_DEFAULT);

        kids=cargarImagen("../kids.jpg");
        kidsResized=kids.getScaledInstance(400,224,Image.SCALE_DEFAULT);

        dentro=cargarImagen("../dentro.png");
        dentroResized=dentro.getScaledInstance(100,100,Image.SCALE_DEFAULT);

        fuera=cargarImagen("../fuera.png");
        fueraResized=fuera.getScaledInstance(100,100,Image.SCALE_DEFAULT);

        gato=cargarImagen("../gato.jpg");
        gatoResized=gato.getScaledInstance(100,100,Image.SCALE_DEFAULT);

        perro=cargarImagen("../perro.jpg");
        perroResized=perro.getScaledInstance(100,100,Image.SCALE_DEFAULT);

        arrecife=cargarImagen("../arrecife.jpg");
        arrecifeResized=arrecife.getScaledInstance(200,133,Image.SCALE_DEFAULT);

        BufferedImage rompecabezas=cargarImagen("../arrecife.jpg");
        listaRompecabezas=new BufferedImage[9];

        listaRompecabezas[0]=subImagen(rompecabezas,0,0,133,88);
        listaRompecabezas[1]=subImagen(rompecabezas,133,0,133,88);
        listaRompecabezas[2]=subImagen(rompecabezas,266,0,133,88);
        listaRompecabezas[3]=subImagen(rompecabezas,0,88,133,88);
        listaRompecabezas[4]=subImagen(rompecabezas,133,88,133,88);
        listaRompecabezas[5]=subImagen(rompecabezas,266,88,133,88);
        listaRompecabezas[6]=subImagen(rompecabezas,0,177,133,88);
        listaRompecabezas[7]=subImagen(rompecabezas,133,177,133,88);
        listaRompecabezas[8]=subImagen(rompecabezas,266,177,133,88);

        mariposaMonarca=cargarImagen("../mariposa.jpg");
        mariposaMonarcaResized=mariposaMonarca.getScaledInstance(70,70,Image.SCALE_DEFAULT);

        xolo=cargarImagen("../xolo.jpg");
        xoloResized=xolo.getScaledInstance(70,70,Image.SCALE_DEFAULT);

        miguelHidalgo=cargarImagen("../miguelHidalgo.jpeg");
        miguelHidalgoResized=miguelHidalgo.getScaledInstance(70,70,Image.SCALE_DEFAULT);
    }

    public static BufferedImage subImagen(BufferedImage imagen,int x, int y, int width, int height){
        return imagen.getSubimage(x,y,width,height);
    }

    public static BufferedImage cargarImagen(String path){
        try {
            return ImageIO.read(Recursos.class.getResource(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
