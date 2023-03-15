package aula04;

public class Exemplo05
{
    public static void main(String[] args)
    {
        int a = 5;
        int b = 0;

        if(b == 0)
            throw new ArithmeticException("Não pode haver divisão por 0");
        else
            System.out.println(a/b);
    }
}
