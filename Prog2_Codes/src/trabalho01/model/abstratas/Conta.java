package trabalho01.model.abstratas;

public abstract class Conta {
    protected String titular;
    protected double saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // TODO: throws exception here
    public void sacar(double valor){
        this.saldo -= valor;
    }

    public void depositar(double valor){
        System.out.println("Saldo anterior: "+this.saldo);
        this.saldo += valor;
        System.out.println("Saldo atual: "+this.saldo);
    }

    public void transferir(Conta origem, Conta destino, double valor){
        /*TODO
        *  - Throws exception
        *       + Insuficient money
        *       + Conta origem/destino does not exist
        *   - Calls sacar from origem and depositor to destino*/
    }
}
