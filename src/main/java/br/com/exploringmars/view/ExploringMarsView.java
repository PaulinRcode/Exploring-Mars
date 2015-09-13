package br.com.exploringmars.view;

import br.com.exploringmars.bean.SondaBean;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ExploringMarsView extends JFrame implements ActionListener {

    private JLabel lbl1 = new JLabel("<html>Insira a coordenada referente ao ponto <br>superior direito da malha do planalto: <br><i>(ex: X Y -> 5 5)</i>.</html>", JLabel.LEFT);
    private JLabel lbl2 = new JLabel("<html>Indique a posição inicial da Nave: <br><i>(ex: X Y N (onde o último representa a direção cardinal North,South,West,East) -> 1 2 N)</i>.</html>", JLabel.LEFT);
    private JLabel lbl3 = new JLabel("<html>Coloque as instruções para controlar a sonda I no planalto de Marte: <br><i>(instruções: L - virar no próprio eixo 90º à esquerda, R - virar no próprio eixo 90º à direita, M - segue em frente)</i>.</html>", JLabel.LEFT);
    private JLabel lbl4 = new JLabel("<html>Indique a posição inicial da segunda Nave: <br><i>(ex: X Y N (onde o último representa a direção cardinal North,South,West,East) -> 3 3 E)</i>.</html>", JLabel.LEFT);
    private JLabel lbl5 = new JLabel("<html>Coloque as instruções para controlar a sonda II no planalto de Marte: <br><i>(instruções: L - virar no próprio eixo 90º à esquerda, R - virar no próprio eixo 90º à direita, M - segue em frente)</i>.</html>", JLabel.LEFT);

    private JTextField tf1 = new JTextField(7);
    private JTextField tf2 = new JTextField(7);
    private JTextField tf3 = new JTextField(7);
    private JTextField tf4 = new JTextField(7);
    private JTextField tf5 = new JTextField(7);

    private JButton btnPosicionarN1 = new JButton("Posicionar Nave I");
    private JButton btnPosicionarN2 = new JButton("Posicionar Nave II");
    private JButton btnExplorar = new JButton("Explorar");

    private JPanel p1 = new JPanel(new GridLayout(6, 1));
    private JPanel p2 = new JPanel(new GridLayout(1, 1));

    public ExploringMarsView(String titulo, int altura, int largura) {
        setTitle(titulo);
        setSize(largura, altura);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnExplorar.addActionListener(this);
        btnPosicionarN1.addActionListener(this);
        btnPosicionarN2.addActionListener(this);

        p1.add(lbl1);
        p1.add(tf1);
        p1.add(lbl2);
        p1.add(tf2);
        p1.add(btnPosicionarN1);
        p1.add(lbl3);
        p1.add(tf3);
        p1.add(lbl4);
        p1.add(tf4);
        p1.add(btnPosicionarN2);
        p1.add(lbl5);
        p1.add(tf5);

        p2.add(btnExplorar);

        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);
    }

    public void posicionarN1(TextField tf2) {
        SondaBean sondaBean = new SondaBean();

        sondaBean.posicionarN1(tf2);
        SondaBean.validaDados();
        abrirMalhaPlanalto();
    }

    public void posicionarN2(TextField tf4) {
        SondaBean sondaBean = new SondaBean();

        sondaBean.posicionarN2(tf4);
        SondaBean.validaDados();
    }

    public void explorar() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnExplorar) {
            abrirMalhaPlanalto();
        }
    }

    private void abrirMalhaPlanalto() {
        JFrame exploringMars = new JFrame("Explorando Marte");
        exploringMars.setSize(700, 700);
        exploringMars.setVisible(true);
        exploringMars.setLayout(new BorderLayout());
        exploringMars.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
