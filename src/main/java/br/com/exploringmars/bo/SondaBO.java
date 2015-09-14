package br.com.exploringmars.bo;

import br.com.exploringmars.model.SondaDTO;
import br.com.exploringmars.model.TipoInstrucao;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JTextField;

public class SondaBO {

    private int abscissa, ordenada;
    private TipoInstrucao tipoInstrucao;

    public void posicionarN1(int x, int y, String direcaoCardinal) {

        x += abscissa;
        y += ordenada;
        // TODO implementar a direção da nave conforme a rosa dos ventos

    }

    public void posicionarN2(int x, int y, String direcaoCardinal) {

        x += abscissa;
        y += ordenada;
        // TODO implementar a direção da nave conforme a rosa dos ventos

    }

    public void explorar(TipoInstrucao tipoInstrucao) {

    /*    switch (tipoInstrucao)
        {
            case L:
                posicaoAtual;
                break;
            case R:
                posicaoAtual;
                break;
            case M:
                posicaoAtual;
                break;
        }
    */        
    }
    

}
