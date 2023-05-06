package trabalho.model.abstratas;

import java.util.Date;

public abstract class PessoaJuridica extends Pessoa{
    protected String cnpj;
    protected String nomeFantasia;

    /*TODO
    *  - Lista de Funcionários*/

    //------------------------------------------------------------------------------------------------------------------
    // Constructors ----------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------

    // Default
    public PessoaJuridica(){}

    // cnpj, nome, nomeFantasia
    public PessoaJuridica(String cnpj, String nome, String nomeFantasia){
        super(nome);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }

    // cnpj, nome, nomeFantasia, dataNascimento
    public PessoaJuridica(String cnpj, String nome, String nomeFantasia, Date dataNascimento){
        super(nome, dataNascimento);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }

    //------------------------------------------------------------------------------------------------------------------
    // Getters & Setters -----------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
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
