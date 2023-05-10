package trabalho.model;

import trabalho.model.abstratas.PessoaJuridica;

import java.util.ArrayList;
import java.util.Date;

public class Banco extends PessoaJuridica {
    private ArrayList<Agencia> agencias;

    //------------------------------------------------------------------------------------------------------------------
    // Constructors ----------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------

    public Banco(String cnpj, String nome, String nomeFantasia){
        super(cnpj, nome, nomeFantasia);
    }

    public Banco(String cnpj, String nome, String nomeFantasia, Date dataNascimento){
        super(cnpj, nome, nomeFantasia, dataNascimento);
    }

    //------------------------------------------------------------------------------------------------------------------
    // Getters & Setters -----------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------


    public ArrayList<Agencia> getAgencias() {
        return agencias;
    }

    public void setAgencias(ArrayList<Agencia> agencias) {
        this.agencias = agencias;
    }

    //------------------------------------------------------------------------------------------------------------------
    // Methods ---------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------

    public void addAgencia(Agencia agencia){
        agencias.add(agencia);
    }

    public void removeAgencia(Agencia agencia){
        agencias.remove(agencia);
    }
}
