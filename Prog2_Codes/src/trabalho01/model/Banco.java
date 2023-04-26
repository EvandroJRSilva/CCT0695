package trabalho01.model;

import trabalho01.model.abstratas.PessoaJuridica;

import java.util.Date;

public class Banco extends PessoaJuridica {
    /*TODO
    *  - Lista de Agências*/
    public Banco(String cnpj, String nome, String nomeFantasia){
        super(cnpj, nome, nomeFantasia);
    }

    public Banco(String cnpj, String nome, String nomeFantasia, Date dataNascimento){
        super(cnpj, nome, nomeFantasia, dataNascimento);
    }
}
