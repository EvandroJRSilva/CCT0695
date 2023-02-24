package aula02;

public class Generico
{
    public static void main(String[] args)
    {
        // Os mesmos arrays
        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
        Character[] characterArray = {'A', 'u', 'l', 'a', '0', '2'};

        // Agora vamos imprimi-los usando um método genérico
        System.out.println("Array de inteiros:");
        printArray(integerArray);
        System.out.println("Array de double:");
        printArray(doubleArray);
        System.out.println("Array de caracteres:");
        printArray(characterArray);
    }

    // Método printArray GENÉRICO
    public static <T> void printArray(T[] input)
    {
        for(T generico : input)
            System.out.println(generico);
    }
}
