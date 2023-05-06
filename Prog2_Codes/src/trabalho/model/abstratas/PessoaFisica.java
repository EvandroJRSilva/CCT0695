package trabalho.model.abstratas;

import java.util.Date;

public abstract class PessoaFisica extends Pessoa{
    protected String cpf;

    //------------------------------------------------------------------------------------------------------------------
    // Constructors ----------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
    public PessoaFisica(){}

    public PessoaFisica(String cpf, String nome){
        super(nome);
        this.cpf = cpf;
    }

    public PessoaFisica(String cpf, String nome, Date dataNascimento){
        super(nome, dataNascimento);
        this.cpf = cpf;
    }

    //------------------------------------------------------------------------------------------------------------------
    // Getters & Setters -----------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
