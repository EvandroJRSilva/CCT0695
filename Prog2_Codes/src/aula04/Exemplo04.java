package aula04;

public class Exemplo04
{
    public static void main(String[] args)
    {
        try{
            int exemplo = 5/0;
        }catch (NumberFormatException e){ // exception errada de propósito
            System.out.println(e);
        }
        finally {
            System.out.println("Eu sempre vou executar, mesmo se a exceção não tiver sido tratada");
        }
    }
}
