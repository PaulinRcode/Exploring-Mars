package br.com.exploringmars.view;

import javax.swing.JFrame;

public class Main extends JFrame {

    public static void main(String[] args) {
        ExploringMarsIHM exploringMarsIHM = new ExploringMarsIHM("Explorando Marte", 700, 700);

        exploringMarsIHM.setVisible(true);
    }

}
