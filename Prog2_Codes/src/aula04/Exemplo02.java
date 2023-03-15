package aula04;

public class Exemplo02
{
    public static void main(String[] args) {
        String exemplo = null;
        // System.out.println(exemplo.length()); --> a String é nula, portanto não há como verificar seu comprimento.
        // Solução com tratamento de exceção
        try{
            System.out.println(exemplo.length());
        }catch (NullPointerException e){
            System.out.println("A String é nula!");
        }
    }
}
