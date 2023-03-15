package aula04;

public class Conta
{
    private double saldo;
    private String titular;

    public Conta(){} // construtor simples

    public Conta(String titular, double saldo)
    {
        this.saldo = saldo;
        this.titular = titular;
    }

    // Métodos
    public void sacar(double valor) throws ChequeSemFundoException
    {
        if(saldo - valor < 0)
            throw new ChequeSemFundoException("Saldo insuficiente!");
        else
            saldo -= valor;
    }

    public double getSaldo()
    {
        return this.saldo;
    }

    public static void main(String[] args)
    {
        Conta conta = new Conta("Fulano", 1234.12);
        try{
            conta.sacar(200);
            System.out.println("Saldo: R$" + conta.getSaldo());
            conta.sacar(5000);
        }catch (ChequeSemFundoException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
