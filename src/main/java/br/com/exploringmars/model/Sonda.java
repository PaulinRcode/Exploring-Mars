package br.com.exploringmars.model;

import java.awt.Image;
import javax.swing.ImageIcon;

public class Sonda {

    private int x, y;
    private Image imagem;
    private TipoDirecaoCardinal tipoDirecaoCardinal;

    public Sonda(int x, int y, TipoDirecaoCardinal tipoDirecaoCardinal) {
        this.x = x;
        this.y = y;
        this.tipoDirecaoCardinal = tipoDirecaoCardinal;
        
        ImageIcon path = new ImageIcon();
        imagem = path.getImage();        
    }

//region getters and setters    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public Image getImagem() {
        return imagem;
    } 
    
    public TipoDirecaoCardinal getTipoDirecaoCardinal() {
        return tipoDirecaoCardinal;
    }
//endregion

    

    
}
