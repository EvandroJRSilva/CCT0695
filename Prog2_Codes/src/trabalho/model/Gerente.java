package trabalho.model;

import trabalho.model.abstratas.Conta;
import trabalho.model.abstratas.Funcionario;
import java.util.ArrayList;
import java.util.Date;

public class Gerente extends Funcionario {
    private ArrayList<Conta> contas;

    //------------------------------------------------------------------------------------------------------------------
    // Constructors ----------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------

    public Gerente(String cpf, String nome, String id){
        super(cpf, nome, id);
    }

    public Gerente(String cpf, String nome, String id, String carteiraTrabalho){
        super(cpf, nome, id, carteiraTrabalho);
    }

    public Gerente(String cpf, String nome, String id, String carteiraTrabalho, Date dataAdmissao)
    {
        super(cpf, nome, id, carteiraTrabalho, dataAdmissao);
    }

    public Gerente(String cpf, String nome, String id, String carteiraTrabalho, Date dataAdmissao,
                       Date dataNascimento){
        super(cpf, nome, id, carteiraTrabalho, dataAdmissao, dataNascimento);
    }

    //------------------------------------------------------------------------------------------------------------------
    // Getters & Setters -----------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }

    //------------------------------------------------------------------------------------------------------------------
    // Methods ---------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------

    public void addConta(Conta conta){
        contas.add(conta);
    }

    public void removeConta(Conta conta){
        contas.remove(conta);
    }

    // TODO: manipulações de conta
}
