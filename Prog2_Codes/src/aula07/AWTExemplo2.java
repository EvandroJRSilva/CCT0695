package aula07;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AWTExemplo2 {
    public AWTExemplo2(){
        Frame f = new Frame();
        Label l = new Label("Cartão do Funcionário");
        Button b = new Button("Enviar");
        TextField t = new TextField();

        // Configurando as posições (x, y, largura, altura)
        l.setBounds(20, 80, 150, 30);
        t.setBounds(20, 110, 200, 30);
        b.setBounds(220, 110, 80, 30);

        // Adicionando os componentes ao Frame
        f.add(b); f.add(l); f.add(t);

        // Configurando o Frame
        f.setSize(400, 300);
        f.setTitle("Informação do Funcionário");
        f.setLayout(null);
        f.setVisible(true);

        // Para fechar a janela
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we){
                f.dispose();
            }
        });
    }

    public static void main(String[] args) {
        new AWTExemplo2();
    }
}
