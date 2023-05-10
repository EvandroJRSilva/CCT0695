package trabalho.model;

import trabalho.model.abstratas.PessoaJuridica;

import java.util.ArrayList;

public class Faculdade extends PessoaJuridica {
    private ArrayList<Curso> cursos;
    private Diretor diretor;

    //------------------------------------------------------------------------------------------------------------------
    // Constructors ----------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------

    // cnpj, nome, nomeFantasia
    public Faculdade(String cnpj, String nome, String nomeFantasia){
        super(cnpj, nome, nomeFantasia);
    }

    public Faculdade(String cnpj, String nome, String nomeFantasia, Diretor diretor){
        super(cnpj, nome, nomeFantasia);
        this.diretor = diretor;
    }

    //------------------------------------------------------------------------------------------------------------------
    // Getters & Setters -----------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
    public String getListaCursos(){
        StringBuilder listaCursos = new StringBuilder();
        for (Curso curso: cursos) {
            listaCursos.append(curso.getNome());
        }

        return listaCursos.toString();
    }

    public ArrayList<Curso> getCursos(){
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    //------------------------------------------------------------------------------------------------------------------
    // Methods ---------------------------------------------------------------------------------------------------------
    //------------------------------------------------------------------------------------------------------------------
    public void addCurso(Curso curso){
        cursos.add(curso);
    }

    public void removeCurso(Curso curso){
        cursos.remove(curso);
    }
}
