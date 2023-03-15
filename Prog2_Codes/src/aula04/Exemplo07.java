package aula04;

public class Exemplo07
{
    public static void main(String[] args)
    {
        // Múltiplos blocos catch
        // É necessário declará-los na ordem subclasse --> superclasse
        try
        {
            System.out.println(4/0);
        }catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException: divisão por 0");
        }catch (Exception e)
        {
            System.out.println("Exception: divisão por 0");
        }
        /* Imagem que mostra a hierarquia das principais exceções que um programador de Java vai lidar:
        * https://www.softwaretestinghelp.com/wp-content/qa/uploads/2020/06/new.png
        * Fonte: https://www.softwaretestinghelp.com/java/java-exceptions/*/
    }
}
