package trabalho.model;

import trabalho.model.abstratas.Funcionario;

import java.util.ArrayList;

public class Professor extends Funcionario {
    private ArrayList<Disciplina> disciplinas;

    //------------------------------------------------------------------------------------------------------------------
    // Constructors ----------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------

    public Professor(String cpf, String nome, String id){
        super(cpf, nome, id);
    }

    public Professor(String cpf, String nome, String id, String carteiraTrabalho){
        super(cpf, nome, id, carteiraTrabalho);
    }

    //------------------------------------------------------------------------------------------------------------------
    // Getters & Setters -----------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------


    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    //------------------------------------------------------------------------------------------------------------------
    // Methods ---------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------

    /* TODO:
    *   - Exception para quantidade máxima e mínima de disciplinas*/
    public void addDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }

    public void removeDisciplina(Disciplina disciplina){
        disciplinas.remove(disciplina);
    }
}
