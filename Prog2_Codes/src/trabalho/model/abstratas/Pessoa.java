package trabalho.model.abstratas;

import java.util.ArrayList;
import java.util.Date;

public abstract class Pessoa {
    protected String nome;
    protected Date dataNascimento;
    protected ArrayList<Conta> contas;

    //------------------------------------------------------------------------------------------------------------------
    // Constructors ----------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
    public Pessoa(String nome){
        this.nome = nome;
    }

    public Pessoa(String nome, Date dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public Pessoa(){}


    //------------------------------------------------------------------------------------------------------------------
    // Getters & Setters -----------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
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
