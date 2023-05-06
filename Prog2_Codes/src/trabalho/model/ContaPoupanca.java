package trabalho.model;

import trabalho.model.abstratas.Conta;
import trabalho.model.abstratas.Funcionario;
import trabalho.model.abstratas.Pessoa;

public class ContaPoupanca extends Conta {
    private double juros;

    //------------------------------------------------------------------------------------------------------------------
    // Constructors ----------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------

    public ContaPoupanca(Banco banco, Agencia agencia, String code, Pessoa titular){
        super(banco, agencia, code, titular);
    }

    public ContaPoupanca(Banco banco, Agencia agencia, String code, Pessoa titular, double juros){
        super(banco, agencia, code, titular);
        this.juros = juros;
    }

    public ContaPoupanca(Banco banco, Agencia agencia, String code, Pessoa titular, Funcionario gerente, double juros){
        super(banco, agencia, code, titular, gerente);
        this.juros = juros;
    }

    public ContaPoupanca(Banco banco, Agencia agencia, String code, Pessoa titular, Funcionario gerente, double saldo,
                         double juros){
        super(banco, agencia, code, titular, gerente, saldo);
        this.juros = juros;
    }

    //------------------------------------------------------------------------------------------------------------------
    // Getters & Setters -----------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    //------------------------------------------------------------------------------------------------------------------
    // Methods ---------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------

    public void aplicaJuros(){
        double valor = this.juros*super.saldo;
        super.depositar(valor);
    }
}
