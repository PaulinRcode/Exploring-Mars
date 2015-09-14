package br.com.exploringmars.bean;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Paulinho
 */
public class MalhaBean implements ActionListener {

    public MalhaBean(JButton btnExplorar) {
        btnExplorar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
