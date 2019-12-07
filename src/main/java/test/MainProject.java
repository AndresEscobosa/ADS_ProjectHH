package test;

import gui.AA_GUI;

import javax.swing.*;

public class MainProject {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                AA_GUI project=new AA_GUI();
                project.setVisible(true);
            }
        });
    }
}
