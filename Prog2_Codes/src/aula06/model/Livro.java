package aula06.model;

public class Livro
{
    private int isbn;
    private String nome;

    public Livro(int isbn, String nome)
    {
        this.isbn = isbn;
        this.nome = nome;
    }

    public int getIsbn()
    {
        return isbn;
    }

    public void setIsbn(int isbn)
    {
        this.isbn = isbn;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }
}
