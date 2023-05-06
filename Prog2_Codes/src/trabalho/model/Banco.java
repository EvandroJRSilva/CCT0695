package trabalho.model;

import trabalho.model.abstratas.PessoaJuridica;

import java.util.Date;

public class Banco extends PessoaJuridica {
    /*TODO
    *  - Lista de Agências*/

    //------------------------------------------------------------------------------------------------------------------
    // Constructors ----------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------

    public Banco(String cnpj, String nome, String nomeFantasia){
        super(cnpj, nome, nomeFantasia);
    }

    public Banco(String cnpj, String nome, String nomeFantasia, Date dataNascimento){
        super(cnpj, nome, nomeFantasia, dataNascimento);
    }
}
