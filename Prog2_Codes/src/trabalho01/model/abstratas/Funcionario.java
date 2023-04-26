package trabalho01.model.abstratas;

import java.util.Date;

public abstract class Funcionario extends PessoaFisica{
    protected String id;
    protected Date dataAdmissao;
    protected String carteiraTrabalho;

    public Funcionario(String cpf, String nome, String id){
        super(cpf, nome);
        this.id = id;
    }

    public Funcionario(String cpf, String nome, String id, String carteiraTrabalho){
        super(cpf, nome);
        this.id = id;
        this.carteiraTrabalho = carteiraTrabalho;
    }

    public Funcionario(String cpf, String nome, String id, String carteiraTrabalho, Date dataAdmissao)
    {
        super(cpf, nome);
        this.id = id;
        this.carteiraTrabalho = carteiraTrabalho;
        this.dataAdmissao = dataAdmissao;
    }

    public Funcionario(String cpf, String nome, String id, String carteiraTrabalho, Date dataAdmissao,
                       Date dataNascimento){
        super(cpf, nome, dataNascimento);
        this.id = id;
        this.carteiraTrabalho = carteiraTrabalho;
        this.dataAdmissao = dataAdmissao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCarteiraTrabalho() {
        return carteiraTrabalho;
    }

    public void setCarteiraTrabalho(String carteiraTrabalho) {
        this.carteiraTrabalho = carteiraTrabalho;
    }
}
