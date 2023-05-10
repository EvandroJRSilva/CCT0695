package trabalho.model;

import trabalho.model.abstratas.Funcionario;
import trabalho.model.abstratas.PessoaFisica;
import trabalho.model.interfaces.Diretoria;

import java.util.ArrayList;
import java.util.Date;

public class Diretor extends Funcionario implements Diretoria {

    //------------------------------------------------------------------------------------------------------------------
    // Constructors ----------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
    public Diretor(String cpf, String nome, String id) {
        super(cpf, nome, id);
    }

    public Diretor(String cpf, String nome, String id, String carteiraTrabalho) {
        super(cpf, nome, id, carteiraTrabalho);
    }

    public Diretor(String cpf, String nome, String id, String carteiraTrabalho, Date dataAdmissao) {
        super(cpf, nome, id, carteiraTrabalho, dataAdmissao);
    }

    public Diretor(String cpf, String nome, String id, String carteiraTrabalho, Date dataAdmissao,
                   Date dataNascimento) {
        super(cpf, nome, id, carteiraTrabalho, dataAdmissao, dataNascimento);
    }

    //------------------------------------------------------------------------------------------------------------------
    // Methods ---------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public void atenderFila(ArrayList<PessoaFisica> pessoas) {
        for (PessoaFisica coordenador: pessoas) {
            if(!(coordenador instanceof Coordenador)){
                // TODO: throw exception
            }
            else{
                System.out.println("O diretor " + this.nome + " atendeu " + coordenador.getNome());
            }
        }
    }
}
