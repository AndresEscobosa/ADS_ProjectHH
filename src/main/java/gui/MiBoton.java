package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class MiBoton extends JButton {

    private String text;
    private Color color_base;
    private Color color_alterno;

    public MiBoton(String text){
        super(text);
        color_base = Color.green;
        color_alterno = Color.gray;
        this.text=text;
        //this.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
        setOpaque(false);
        setForeground(Color.white);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setRolloverEnabled(true);
    }

    public MiBoton(String text, Color color_base){
        super(text);
        this.color_base = color_base;
        this.text=text;
        this.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
        setOpaque(false);
        setForeground(Color.white);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setRolloverEnabled(true);
    }

    public MiBoton(String text, Color color_base, Color color_alterno){
        super(text);
        this.color_base = color_base;
        this.color_alterno = color_alterno;
        this.text=text;
        this.setFont(new Font("Comic Sans MS", Font.PLAIN, 24));
        setOpaque(false);
        setForeground(Color.white);
        setBorderPainted(false);
        setContentAreaFilled(false);
        setRolloverEnabled(true);
    }

    public void paintComponent(Graphics g){
        ButtonModel model=getModel();
        g.setColor(color_base);
        FontMetrics estilo=getFontMetrics(getFont());
        g.setFont(getFont());
        Rectangle2D medidas=estilo.getStringBounds(text,g);

        int x=(int)(getWidth() / 2 - (medidas.getWidth() / 2));
        int y=(int)(getHeight() / 2 + (medidas.getHeight() / 2));

        if(model.isPressed() && model.isArmed()){
            g.setColor( color_base.darker().darker());
            //g.fillOval(x-5,0,(int)medidas.getWidth()+5,30);
            g.fillRect(x,y-20,(int)medidas.getWidth(),(int)medidas.getHeight());
        }
        if(model.isRollover()){
            g.setColor(color_alterno);
            g.drawString(">", x-11, y);
            g.drawString("<",(int)(x+medidas.getWidth()+5),y);
        }
        g.drawString(text,x,y);
    }
}
