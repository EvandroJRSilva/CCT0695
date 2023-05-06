package trabalho.model;

import trabalho.model.abstratas.Funcionario;
import trabalho.model.interfaces.Diretoria;

import java.util.Date;

public class Coordenador extends Funcionario implements Diretoria {

    //------------------------------------------------------------------------------------------------------------------
    // Constructors ----------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
    public Coordenador(String cpf, String nome, String id) {
        super(cpf, nome, id);
    }

    public Coordenador(String cpf, String nome, String id, String carteiraTrabalho) {
        super(cpf, nome, id, carteiraTrabalho);
    }

    public Coordenador(String cpf, String nome, String id, String carteiraTrabalho, Date dataAdmissao) {
        super(cpf, nome, id, carteiraTrabalho, dataAdmissao);
    }

    public Coordenador(String cpf, String nome, String id, String carteiraTrabalho, Date dataAdmissao,
                       Date dataNascimento) {
        super(cpf, nome, id, carteiraTrabalho, dataAdmissao, dataNascimento);
    }
}
