package trabalho01.model.abstratas;

import java.util.Date;

public abstract class PessoaFisica extends Pessoa{
    protected String cpf;

    public PessoaFisica(){}

    public PessoaFisica(String cpf, String nome){
        super(nome);
        this.cpf = cpf;
    }

    public PessoaFisica(String cpf, String nome, Date dataNascimento){
        super(nome, dataNascimento);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
