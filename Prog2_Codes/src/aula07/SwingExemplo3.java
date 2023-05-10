package aula07;

import javax.swing.*;
import java.awt.*;

public class SwingExemplo3 {

    public static void main(String[] args) {
        /*
         * Exemplos retirados de:
         *   - https://www.guru99.com/java-swing-gui.html
         * 	- https://docs.oracle.com/javase/tutorial/uiswing/layout/border.html
         * */

        /* 1 */
//        JFrame frame = new JFrame("Exemplo 3");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(300, 300);
//        frame.setLocation(800, 300);
//
//        JButton botão = new JButton("Aperta");
//        frame.getContentPane().add(botão); // colocando o botão no conteúdo inteiro
//
//        frame.setVisible(true);

        /* 2 */
//        JFrame frame = new JFrame("Exemplo 4");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLocation(800, 300);
//
//        JButton button1 = new JButton("Aperta");
//        button1.setPreferredSize(new Dimension(120, 100));
//
//        JButton button2 = new JButton("nin mim");
//        button2.setPreferredSize(new Dimension(200, 100));
//
//        JButton button3 = new JButton("abestado!");
//        button3.setPreferredSize(new Dimension(120, 100));
//
//        frame.getContentPane().add(button1, BorderLayout.LINE_START);
//        frame.getContentPane().add(button2, BorderLayout.CENTER);
//        frame.getContentPane().add(button3, BorderLayout.LINE_END);

        /* O método pack() dimensiona o frame de forma que t0do os seus conteúdos estejam em seus tamanhos preferíveis,
        ou acima deles. Uma alternativa ao pack é estabelecer o tamanho do frame explicitamente usando o setSize, ou o
        setBounds (o qual também configura a localização do frame). Em geral, usar o pack é preferível em vez de usar o
        setSize, já que o pack deixa o gerenciador de layout lidar com o tamanho do frame, e os gerenciadores de layout
        são bons em ajustar as dimensões de acordo com a plataforma do usuário ou outros fatores que influenciam no ta-
        manho do componente.*/
//        frame.pack();
//        frame.setVisible(true);

        /* 3 */
        JFrame frame = new JFrame("Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocation(800, 300);

        JMenuBar menuBarra = new JMenuBar();
        JMenu menu1 = new JMenu("Arquivo X");
        JMenu menu2 = new JMenu("Me ajuda Professor!");

        menuBarra.add(menu1); menuBarra.add(menu2);

        JMenuItem menu11 = new JMenuItem("A Verdade está lá fora");
        JMenuItem menu21 = new JMenuItem("É só passar o Pix");

        menu1.add(menu11);
        menu2.add(menu21);

        // Painel no fim da Janela
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Escreve aqui");
        JTextField textField = new JTextField(10);
        JButton enviar = new JButton("Enviar");
        JButton resetar = new JButton("Resetar");

        panel.add(label); panel.add(textField); panel.add(enviar); panel.add(resetar);

        // Área de texto no meio
        JTextArea textArea = new JTextArea();

        // Adicionando tudo ao Frame
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, menuBarra);
        frame.getContentPane().add(BorderLayout.CENTER, textArea);
        frame.setVisible(true);
    }
}
