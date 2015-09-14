package br.com.exploringmars.model;

/**
 *
 * @author Paulinho
 */
public enum TipoDirecaoCardinal {

    N("North"),
    W("West"),
    E("East"),
    S("South");

    private String direcaoCardinal;

    private TipoDirecaoCardinal(String direcaoCardinal) {
        direcaoCardinal = direcaoCardinal;
    }
}
