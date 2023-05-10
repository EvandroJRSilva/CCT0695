package trabalho.model;

import trabalho.model.abstratas.Conta;

import java.util.ArrayList;

public class Agencia {
    private Banco banco;
    private String code;
    private String nome;
    private ArrayList<Conta> contas;

    //------------------------------------------------------------------------------------------------------------------
    // Constructors ----------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------

    public Agencia(Banco banco, String code){
        this.banco = banco;
        this.code = code;
    }

    public Agencia(Banco banco, String code, String nome){
        this.banco = banco;
        this.code = code;
        this.nome = nome;
    }

    //------------------------------------------------------------------------------------------------------------------
    // Getters & Setters -----------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }

    //------------------------------------------------------------------------------------------------------------------
    // Methods ---------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------

    public void addConta(Conta conta){
        contas.add(conta);
    }

    public void removeConta(Conta conta){
        contas.remove(conta);
    }
}
