package trabalho.model;

import trabalho.model.abstratas.Funcionario;
import trabalho.model.interfaces.Diretoria;

import java.util.Date;

public class Presidente extends Funcionario implements Diretoria {

    //------------------------------------------------------------------------------------------------------------------
    // Constructors ----------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------

    public Presidente(String cpf, String nome, String id) {
        super(cpf, nome, id);
    }

    public Presidente(String cpf, String nome, String id, String carteiraTrabalho) {
        super(cpf, nome, id, carteiraTrabalho);
    }

    public Presidente(String cpf, String nome, String id, String carteiraTrabalho, Date dataAdmissao) {
        super(cpf, nome, id, carteiraTrabalho, dataAdmissao);
    }

    public Presidente(String cpf, String nome, String id, String carteiraTrabalho, Date dataAdmissao,
                      Date dataNascimento) {
        super(cpf, nome, id, carteiraTrabalho, dataAdmissao, dataNascimento);
    }
}
