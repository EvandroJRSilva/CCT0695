package aula06;

import aula06.dao.LivroDAO;
import aula06.model.Livro;

import java.util.ArrayList;
import java.util.List;

public class LivroDAOImpl implements LivroDAO
{
    // Lista de livros para simular um banco de dados
    private List<Livro> livros;

    public LivroDAOImpl()
    {
        // Inicializando com alguns livros
        livros = new ArrayList<>();
        livros.add(new Livro(1, "Java"));
        livros.add(new Livro(2, "Python"));
        livros.add(new Livro(3, "Julia"));
        livros.add(new Livro(4, "Rust"));
    }


    @Override
    public List<Livro> getAllLivros()
    {
        return livros;
    }

    @Override
    public Livro getLivroByISBN(int isbn)
    {
        return livros.get(isbn);
    }

    @Override
    public void saveLivro(Livro livro)
    {
        livros.add(livro);
    }

    @Override
    public void deleteLivro(Livro livro)
    {
        livros.remove(livro);
    }
}
