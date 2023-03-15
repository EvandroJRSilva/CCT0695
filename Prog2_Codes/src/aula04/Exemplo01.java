package aula04;

public class Exemplo01
{
    public static void main(String[] args)
    {
        try{
            int data = 100/0; // divisão por 0 gera um erro
        }catch (ArithmeticException e){
            /* Mostra o "caminho" que a execução levou para chegar à exceção */
            e.printStackTrace();
            System.out.println(e); // imprimindo a mensagem de erro
        }

        System.out.println("Restante do código");
    }
}
