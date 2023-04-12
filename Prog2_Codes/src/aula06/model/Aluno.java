package aula06.model;

public class Aluno
{
    private String nome;
    private int numeroChamada;

    public Aluno(String nome, int numeroChamada)
    {
        this.nome = nome;
        this.numeroChamada = numeroChamada;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getNumeroChamada()
    {
        return numeroChamada;
    }

    public void setNumeroChamada(int numeroChamada)
    {
        this.numeroChamada = numeroChamada;
    }
}
