package aula02;

public class TipoLimitado
{
    // Para esse método ser utilizado, o tipo tem de ser 'comparável'
    public static <T extends Comparable<T>> T maximo(T a, T b, T c)
    {
        T max = a; //supondo que a é o maior

        if (b.compareTo(max) > 0)
            max = b;

        if (c.compareTo(max) > 0)
            max = c;

        return max;
    }

    public static void main(String[] args)
    {
        System.out.printf("O maior número entre %d, %d e %d é %d\n\n", 1, 4, 2, maximo(1, 4, 2));
        System.out.printf("O maior número entre %.1f, %.1f e %.1f é %.1f\n\n", 1.1, 5.3, 7.2, maximo(1.1, 5.3, 7.2));
        System.out.printf("A melhor fruta dentre %s, %s e %s é %s", "pera", "uva", "maçã", maximo("pera", "uva", "maçã"));
    }
}
