package aula07;

import javax.swing.*;

public class SwingExemplo2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Nome da Janela");

        JButton button = new JButton("Clica aqui, por obséquio!");
        button.setBounds(75, 50, 250, 40);

        frame.add(button);
        frame.setSize(400, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(800, 300);
    }
}
