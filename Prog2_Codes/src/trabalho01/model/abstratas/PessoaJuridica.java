package trabalho01.model.abstratas;

import java.util.Date;

public abstract class PessoaJuridica extends Pessoa{
    protected String cnpj;
    protected String nomeFantasia;

    /*TODO
    *  - Lista de Funcionários*/

    public PessoaJuridica(String cnpj, String nome, String nomeFantasia){
        super(nome);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }

    public PessoaJuridica(String cnpj, String nome, String nomeFantasia, Date dataNascimento){
        super(nome, dataNascimento);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
}
