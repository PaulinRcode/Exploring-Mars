package br.com.exploringmars.bean;

import br.com.exploringmars.bo.MalhaBO;
import java.util.List;
import javax.swing.JTextField;

/**
 *
 * @author Paulinho
 */
public class MalhaBean {

    public void carregarCenario() {
        
        

    }

    public void explorar(JTextField tf3, JTextField tf5) {
        String instrucaoSondaI = tf3.getText();
        String instrucaoSondaII = tf5.getText();

        MalhaBO malhaBO = new MalhaBO();
        malhaBO.explorar(instrucaoSondaI, instrucaoSondaII);

    }
}
