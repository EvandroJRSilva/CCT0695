package trabalho.model;

import java.util.ArrayList;

public class Curso {
    private String nome;
    private String code;
    private Coordenador coordenador;
    private ArrayList<Disciplina> disciplinas;

    //------------------------------------------------------------------------------------------------------------------
    // Constructors ----------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------

    public Curso(String nome, String code){
        this.nome = nome;
        this.code = code;
    }

    public Curso(String nome, String code, Coordenador coordenador){
        this.nome = nome;
        this.code = code;
        this.coordenador = coordenador;
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

    public Coordenador getCoordenador() {
        return coordenador;
    }

    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    //------------------------------------------------------------------------------------------------------------------
    // Methods ---------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------

    public void addDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }

    public void removeDisciplina(Disciplina disciplina){
        disciplinas.remove(disciplina);
    }
}
