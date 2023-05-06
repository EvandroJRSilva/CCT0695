package trabalho.model;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private String code;
    private ArrayList<Aluno> alunos;
    private Professor professor;

    //------------------------------------------------------------------------------------------------------------------
    // Constructors ----------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------

    public Disciplina(String nome, String code){
        this.nome = nome;
        this.code = code;
    }

    public Disciplina(String nome, String code, Professor professor){
        this.nome = nome;
        this.code = code;
        this.professor = professor;
    }

    //------------------------------------------------------------------------------------------------------------------
    // Getters & Setters -----------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    //------------------------------------------------------------------------------------------------------------------
    // Methods ---------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------

    public void addAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void removeAluno(Aluno aluno){
        alunos.remove(aluno);
    }
}
