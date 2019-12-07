package mouseListener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Raton implements MouseListener {
    private boolean isClick;
    private boolean isPressed;
    private boolean isReleased;
    private int posX;
    private int posY;

    public Raton() {
        isClick = false;
        isPressed = false;
        isReleased = true;
        posX = 0;
        posY = 0;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    //@Override
    public void mouseClicked(MouseEvent e) {
        //posX = e.getLocationOnScreen().x;
        // posY = e.getLocationOnScreen().y;
        //posX = e.getPoint().x;
        //posY = e.getPoint().y;
        posX=e.getX();
        posY=e.getY();
        //System.out.println("Mouse Clicked at X: "+posX+" - Y:"+posY);
        /*
        if (!isClick) {
            isClick = true;
            isReleased = false;
        }
        */
        //System.out.println(isClick);
        isClick=true;
        //System.out.println(isClick);
    }

    //@Override
    public void mousePressed(MouseEvent e) {
        //posX = e.getPoint().x;
        //posY = e.getPoint().y;
        posX=e.getX();
        posY=e.getY();
        /*
        if (!isPressed){
            isClick = false;
            isPressed = true;
            isReleased = false;
        }
        */

    }

    //@Override
    public void mouseReleased(MouseEvent e) {
        //posX = e.getLocationOnScreen().x;
        //posY = e.getLocationOnScreen().y;
        posX=e.getX();
        posY=e.getY();
        /*
        if (!isReleased){
            isReleased = true;
            isPressed = false;
            isClick = false;
        }
        */
    }

    //@Override
    public void mouseEntered(MouseEvent e) {
    }

    //@Override
    public void mouseExited(MouseEvent e) {
    }

    public void setClick(boolean click) {
        isClick = click;
    }

    public void setPressed(boolean pressed) {
        isPressed = pressed;
    }

    public void setReleased(boolean released) {
        isReleased = released;
    }

    public boolean isClick() {
        return isClick;
    }

    public boolean isPressed() {
        return isPressed;
    }

    public boolean isReleased() {
        return isReleased;
    }
}
