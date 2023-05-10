package trabalho.model;

import trabalho.model.abstratas.Funcionario;
import trabalho.model.abstratas.PessoaFisica;
import trabalho.model.interfaces.Diretoria;

import java.util.ArrayList;
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

    //------------------------------------------------------------------------------------------------------------------
    // Methods ---------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
    @Override
    public void atenderFila(ArrayList<PessoaFisica> pessoas) {
        for (PessoaFisica pessoa: pessoas) {
            if(!(pessoa instanceof Professor || pessoa instanceof Aluno)){
                // TODO: throw exception
            }
            else{
                System.out.println("O coordenador " + this.nome + " atendeu " + pessoa.getNome());
            }
        }
    }
}
