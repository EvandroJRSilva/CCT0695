package aula07;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTExemplo extends Frame {
    public AWTExemplo(){
        Button b = new Button("Clique em mim!");

        // Posição do botão na tela (x, y, largura, altura)
        b.setBounds(30, 100, 120, 30);

        // Adicionando o botão ao Frame
        add(b); // método herdado de Frame, por isso bastou chamá-lo

        // Configurando o tamanho do Frame
        setSize(300, 300);

        // Configurando o título do Frame
        setTitle("Exemplo básico de AWT");

        // Sem gerenciador de layout
        setLayout(null);

        // Configurando o Frame para visível (default: não visível)
        setVisible(true);

        // Método para "ouvir" eventos. O evento de clicar em fechar a janela terá como resultado a janela ser fechada.
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we){
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new AWTExemplo();
    }
}
