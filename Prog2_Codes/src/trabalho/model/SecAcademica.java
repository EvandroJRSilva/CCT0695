package trabalho.model;

import trabalho.model.abstratas.Funcionario;
import trabalho.model.interfaces.Secretaria;

import java.util.Date;

public class SecAcademica extends Funcionario implements Secretaria {

    //------------------------------------------------------------------------------------------------------------------
    // Constructors ----------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
    public SecAcademica(String cpf, String nome, String id) {
        super(cpf, nome, id);
    }

    public SecAcademica(String cpf, String nome, String id, String carteiraTrabalho) {
        super(cpf, nome, id, carteiraTrabalho);
    }

    public SecAcademica(String cpf, String nome, String id, String carteiraTrabalho, Date dataAdmissao) {
        super(cpf, nome, id, carteiraTrabalho, dataAdmissao);
    }

    public SecAcademica(String cpf, String nome, String id, String carteiraTrabalho, Date dataAdmissao,
                        Date dataNascimento) {
        super(cpf, nome, id, carteiraTrabalho, dataAdmissao, dataNascimento);
    }
}
