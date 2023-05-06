package trabalho.model;

import trabalho.model.abstratas.Conta;
import trabalho.model.abstratas.Funcionario;
import trabalho.model.abstratas.Pessoa;

public class ContaCorrente extends Conta {
    private double taxa;

    //------------------------------------------------------------------------------------------------------------------
    // Constructors ----------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------

    public ContaCorrente(Banco banco, Agencia agencia, String code, Pessoa titular){
        super(banco, agencia, code, titular);
    }

    public ContaCorrente(Banco banco, Agencia agencia, String code, Pessoa titular, double taxa){
        super(banco, agencia, code, titular);
        this.taxa = taxa;
    }

    public ContaCorrente(Banco banco, Agencia agencia, String code, Pessoa titular, Funcionario gerente, double taxa){
        super(banco, agencia, code, titular, gerente);
        this.taxa = taxa;
    }

    public ContaCorrente(Banco banco, Agencia agencia, String code, Pessoa titular, Funcionario gerente, double saldo,
                         double taxa){
        super(banco, agencia, code, titular, gerente, saldo);
        this.taxa = taxa;
    }

    //------------------------------------------------------------------------------------------------------------------
    // Getters & Setters -----------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    //------------------------------------------------------------------------------------------------------------------
    // Methods ---------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------

    // TODO: exceptions aqui também
    public void cobraTaxa(){
        super.saldo -= this.taxa;
    }

    public void pagar(double valor){
        sacar(valor);
    }
}
