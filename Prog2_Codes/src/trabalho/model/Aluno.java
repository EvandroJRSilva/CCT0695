package trabalho.model;

import trabalho.model.abstratas.PessoaFisica;

import java.util.ArrayList;
import java.util.Date;

public class Aluno extends PessoaFisica {
    private String matricula;
    private ArrayList<Disciplina> disciplinas;
    private int periodo = 1;

    //------------------------------------------------------------------------------------------------------------------
    // Constructors ----------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------

    public Aluno(String cpf, String nome){
        super(cpf, nome);
    }

    public Aluno(String cpf, String nome, String matricula){
        super(cpf, nome);
        this.matricula = matricula;
    }

    public Aluno(String cpf, String nome, Date dataNascimento){
        super(cpf, nome, dataNascimento);
    }

    public Aluno(String cpf, String nome, Date dataNascimento, String matricula){
        super(cpf, nome, dataNascimento);
        this.matricula = matricula;
    }

    //------------------------------------------------------------------------------------------------------------------
    // Getters & Setters -----------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    //------------------------------------------------------------------------------------------------------------------
    // Methods ---------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------

    public void mudaPeriodo(int novoPeriodo){
        this.periodo = novoPeriodo;
    }

    /* TODO:
    *   - Exception para quantidade máxima e mínima de disciplinas*/
    public void matriculaNovaDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }

    public void desmatriculaDisciplina(Disciplina disciplina){
        disciplinas.remove(disciplina);
    }
}
