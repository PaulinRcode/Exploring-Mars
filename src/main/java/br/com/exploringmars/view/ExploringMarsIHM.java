package br.com.exploringmars.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class ExploringMarsIHM extends JFrame {
	
	public ExploringMarsIHM(String titulo, int altura, int largura) {
		setTitle(titulo);
		setSize(largura, altura);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
}
