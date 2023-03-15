package aula04;

public class Exemplo03
{
    public static void main(String[] args)
    {
        // As vezes não sabemos qual exceção pode acontecer. Nesse caso capturamos a exceção de forma genérica
        String exemplo = "abc";
        try{
            int i = Integer.parseInt(exemplo);
        }catch (Exception e){
            System.out.println(e);
            // ou para pegar somente a mensagem da exceção
            System.out.println(e.getMessage());
            // Também é possível identificar a causa da exceção
            System.out.println(e.getCause());
        }
    }
}
