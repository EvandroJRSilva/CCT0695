package aula02;

public class Sobrecarregados
{
    public static void main(String[] args)
    {
        // Arrays de Integer, Double e Character
        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
        Character[] characterArray = {'A', 'u', 'l', 'a', '0', '2'};

        System.out.println("Array de inteiros:");
        printArray(integerArray);
        System.out.println("Array de double:");
        printArray(doubleArray);
        System.out.println("Array de caracteres:");
        printArray(characterArray);
    }

    // MÉTODOS SOBRECARREGADOS

    // Para imprimir array de inteiros
    public static void printArray(Integer[] input)
    {
        for (Integer inteiro : input)
            System.out.println(inteiro);
    }

    // Para imprimir array de double
    public static void printArray(Double[] input)
    {
        for(Double real : input)
            System.out.println(real);
    }

    // Para imprimir array de caracteres
    public static void printArray(Character[] input)
    {
        for(Character caractere : input)
        {
            System.out.println(caractere);
        }
    }
}
