package aula06.dao;

import aula06.model.Livro;

import java.util.List;

public interface LivroDAO
{
    List<Livro> getAllLivros();
    Livro getLivroByISBN(int isbn);
    void saveLivro(Livro livro);
    void deleteLivro(Livro livro);
}
