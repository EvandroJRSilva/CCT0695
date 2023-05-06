package trabalho.model.abstratas;

import trabalho.model.Agencia;
import trabalho.model.Banco;

public abstract class Conta {
    protected Pessoa titular;
    protected double saldo;
    protected Banco banco;
    protected Agencia agencia;
    protected String code;
    protected Funcionario gerente;

    //------------------------------------------------------------------------------------------------------------------
    // Constructors ----------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------

    public Conta(){}

    public Conta(Banco banco, Agencia agencia, String code, Pessoa titular){
        this.banco = banco;
        this.agencia = agencia;
        this.code = code;
        this.titular = titular;
    }

    public Conta(Banco banco, Agencia agencia, String code, Pessoa titular, Funcionario gerente){
        this.banco = banco;
        this.agencia = agencia;
        this.code = code;
        this.titular = titular;
        this.gerente = gerente;
    }

    public Conta(Banco banco, Agencia agencia, String code, Pessoa titular, Funcionario gerente, double saldo){
        this.banco = banco;
        this.agencia = agencia;
        this.code = code;
        this.titular = titular;
        this.gerente = gerente;
        this.saldo = saldo;
    }
    //------------------------------------------------------------------------------------------------------------------
    // Getters & Setters -----------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public String getCode() {
        return code;
    }

    public Funcionario getGerente() {
        return gerente;
    }

    public void setGerente(Funcionario gerente) {
        this.gerente = gerente;
    }

    public void setCode(String code) {
        this.code = code;
    }

    //------------------------------------------------------------------------------------------------------------------
    // Methods ---------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------

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
