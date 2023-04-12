package aula06;

import aula06.dao.LivroDAO;
import aula06.model.Livro;
import aula06.daoimpl.LivroDAOImpl;

public class AcessaLivro
{
    public static void main(String[] args)
    {
        /* Exemplo adaptado de:
        * https://www.digitalocean.com/community/tutorials/dao-design-pattern*/

        LivroDAO livroDAO = new LivroDAOImpl();

        for (Livro livro : livroDAO.getAllLivros())
        {
            System.out.println(livro.getNome()+", ISBN: "+livro.getIsbn());
        }

        // Atualizando um livro
        Livro livro = livroDAO.getAllLivros().get(1);
        livro.setNome("Javoso");
        livroDAO.saveLivro(livro);
    }
}
