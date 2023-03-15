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
        System.out.println("Todos eles ao mesmo tempo:");
        printArray(integerArray, doubleArray, characterArray);
    }

    // Método printArray GENÉRICO
    public static <T> void printArray(T[] input)
    {
        for(T generico : input)
            System.out.println(generico);
    }

    public static <T,E,I> void printArray(T[] input, E[] input2, I[] input3)
    {
        for(T generico : input)
            System.out.println(generico);
        for (E generico2: input2)
            System.out.println(generico2);
        for(I generico3: input3)
            System.out.println(generico3);
    }
}
