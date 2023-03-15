package aula04;

public class ChequeSemFundoException extends Exception
{
    public ChequeSemFundoException(String s)
    {
        super(s); // Usando construtor da classe Exception
    }
}
