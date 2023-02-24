package aula02;

import java.util.ArrayList;

public class Pilha<T>
{
    private ArrayList<T> pilhados;

    // Construtor
    public Pilha(int quantidade)
    {
        /* Operador ternário: equivalente ao if-else
        * Se quantidade for maior do que zero, a quantidade inicial recebe esse valor, senão recebe o valor 10 por
        * padrão.*/
        int qtdInicial = quantidade > 0 ? quantidade : 10;
        pilhados = new ArrayList<T>(qtdInicial);
    }

    // Métodos
    public void empilhar(T valor)
    {
        pilhados.add(valor);
        // Imprimindo a pilha
        for(T elemento : pilhados)
            System.out.println(elemento);

        System.out.println(); //para deixar uma linha em branco no console
    }

    public void desempilhar()
    {
        if(pilhados.isEmpty())
            System.out.println("Pilha está vazia!");
        else
        {
            T retirado = pilhados.remove(pilhados.size()-1);
            System.out.println("Elemento retirado da pilha: "+retirado);
        }
    }

    // MAIN
    public static void main(String[] args)
    {
        Pilha<Integer> pilhaInt = new Pilha<Integer>(3);
        Pilha<String> pilhaString = new Pilha<String>(0);

        pilhaInt.empilhar(5);
        pilhaInt.empilhar(12);
        pilhaInt.empilhar(22);

        pilhaString.empilhar("Olê");
        pilhaString.empilhar("Olá");

        System.out.println();

        pilhaInt.desempilhar();
        pilhaString.desempilhar();
    }
}
