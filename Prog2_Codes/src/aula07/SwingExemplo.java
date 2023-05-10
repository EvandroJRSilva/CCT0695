package aula07;

import javax.swing.*;

public class SwingExemplo {
    public static void main(String[] args) {
        // Criando objeto JFrame
        JFrame frame = new JFrame("Frame do Olá Mundo");
        // Criando objeto JLabel
        final JLabel label = new JLabel("Olá Mundo!");

        // Adicionando o label ao frame
        frame.getContentPane().add(label);
        // Configurando o fechamento da janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Outras configurações do frame
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
