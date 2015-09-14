package br.com.exploringmars.bean;

import br.com.exploringmars.bo.SondaBO;
import javax.swing.JTextField;

public class SondaBean {

    public void posicionarN1(JTextField tf2) {
        String strX = tf2.getText().substring(0, 1);
        String strY = tf2.getText().substring(1, 2);
        String direcaoCardinal = tf2.getText().substring(2, 3);

        int x = Integer.parseInt(strX);
        int y = Integer.parseInt(strY);

        SondaBO sondaBO = new SondaBO();
        sondaBO.posicionarN1(x, y, direcaoCardinal);
    }

    public void posicionarN2(JTextField tf4) {
        String strX = tf4.getText().substring(0, 1);
        String strY = tf4.getText().substring(1, 2);
        String direcaoCardinal = tf4.getText().substring(2, 3);

        int x = Integer.parseInt(strX);
        int y = Integer.parseInt(strY);

        SondaBO sondaBO = new SondaBO();
        sondaBO.posicionarN2(x, y, direcaoCardinal);
    }

    public static void validaDados() {

    }

}
