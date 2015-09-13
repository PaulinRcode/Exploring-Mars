package br.com.exploringmars.view;

import javax.swing.JFrame;

public class Main extends JFrame {

    public static void main(String[] args) {
        ExploringMarsView exploringMarsView = new ExploringMarsView("Explorando Marte", 700, 700);

        exploringMarsView.setVisible(true);
    }

}
