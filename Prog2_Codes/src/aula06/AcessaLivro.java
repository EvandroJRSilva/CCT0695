package aula06;

import aula06.dao.LivroDAO;
import aula06.model.Livro;

public class AcessaLivro
{
    public static void main(String[] args)
    {
        /* Exemplo adaptado de:
        * https://www.digitalocean.com/community/tutorials/dao-design-pattern*/

        LivroDAO livroDAO = new aula06.LivroDAOImpl();

        for (Livro livro : livroDAO.getAllLivros())
        {
            System.out.println("ISBN do livro: "+livro.getIsbn());
        }

        // Atualizando um livro
        Livro livro = livroDAO.getAllLivros().get(1);
        livro.setNome("Javoso");
        livroDAO.saveLivro(livro);
    }
}
