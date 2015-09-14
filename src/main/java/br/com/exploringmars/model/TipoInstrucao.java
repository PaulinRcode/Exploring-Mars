package br.com.exploringmars.model;

/**
 *
 * @author Paulinho
 */
public enum TipoInstrucao {

    L("Esquerda"),
    R("Direita"),
    M("Frente");

    private String instrucao;

    TipoInstrucao(String instrucao) {
        instrucao = instrucao;
    }
}
