package aula07;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends Frame implements ActionListener {
    Label lb1, lb2, lb3;
    TextField txt1, txt2, txt3;
    Button b1, b2, b3, b4, b5, b6, b7;

    public Calculadora(){
        lb1 = new Label("Var 1");
        lb2 = new Label("Var 2");
        lb3 = new Label("Resultado");

        txt1 = new TextField(10); // aceita até 10 caracteres
        txt2 = new TextField(10);
        txt3 = new TextField(10);

        b1 = new Button("Adicionar");
        b2 = new Button("Subtrair");
        b3 = new Button("Multiplicar");
        b4 = new Button("Dividir");
        b5 = new Button("Resto");
        b6 = new Button("Reset");
        b7 = new Button("Fechar");

        // adicionando os componentes
        add(lb1); add(txt1);
        add(lb2); add(txt2);
        add(lb3); add(txt3);
        add(b1); add(b2); add(b3);
        add(b4); add(b5); add(b6);
        add(b7);

        setSize(500, 120);
        setTitle("Calculadora");
        setLayout(new FlowLayout());

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        double a = 0, b = 0, c = 0;

        try{
            a = Double.parseDouble(txt1.getText());
        }catch (NumberFormatException e){
            txt1.setText("Entrada Inválida!");
        }

        try{
            b = Double.parseDouble(txt2.getText());
        }catch (NumberFormatException e){
            txt2.setText("Entrada Inválida!");
        }

        // Contas
        if(actionEvent.getSource() == b1){
            c = a + b;
            txt3.setText(String.valueOf(c));
        }

        if(actionEvent.getSource() == b2){
            c = a - b;
            txt3.setText(String.valueOf(c));
        }

        if(actionEvent.getSource() == b3){
            c = a * b;
            txt3.setText(String.valueOf(c));
        }

        if(actionEvent.getSource() == b4){
            c = a / b;
            txt3.setText(String.valueOf(c));
        }

        if(actionEvent.getSource() == b5){
            c = a % b;
            txt3.setText(String.valueOf(c));
        }

        if(actionEvent.getSource() == b6){
            txt1.setText("0");
            txt2.setText("0");
            txt3.setText("0");
        }

        if(actionEvent.getSource() == b7){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.setVisible(true);
        calculadora.setLocation(800, 300);
    }
}