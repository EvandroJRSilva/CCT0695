package aula06;

import aula06.dao.AlunoDAO;
import aula06.daoimpl.AlunoDAOImpl;
import aula06.model.Aluno;

public class AcessaAluno
{
    public static void main(String[] args)
    {
        /* Exemplo adaptado de
        https://www.tutorialspoint.com/design_pattern/data_access_object_pattern.htm */
        
        AlunoDAO alunoDAO = new AlunoDAOImpl();

        for (Aluno aluno : alunoDAO.getAllAlunos())
        {
            System.out.println("Aluno: [N. Chamada: "+aluno.getNumeroChamada()+", Nome: "+aluno.getNome()+"]");
        }
    }
}
