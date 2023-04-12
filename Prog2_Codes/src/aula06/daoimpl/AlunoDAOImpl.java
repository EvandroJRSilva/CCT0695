package aula06.daoimpl;

import aula06.dao.AlunoDAO;
import aula06.model.Aluno;

import java.util.ArrayList;
import java.util.List;

public class AlunoDAOImpl implements AlunoDAO
{
    // Simulando banco de dados com lista
    private List<Aluno> alunos;

    public AlunoDAOImpl()
    {
        alunos = new ArrayList<>();
        alunos.add(new Aluno("Alano", 1));
        alunos.add(new Aluno("Beltrano", 2));
        alunos.add(new Aluno("Cicrano", 3));
        alunos.add(new Aluno("Detano", 4));
        alunos.add(new Aluno("Elano", 5));
        alunos.add(new Aluno("Fulano", 6));
    }


    @Override
    public List<Aluno> getAllAlunos()
    {
        return alunos;
    }

    @Override
    public Aluno getAlunoByNumeroChamada(int numeroChamada)
    {
        return alunos.get(numeroChamada);
    }

    @Override
    public void updateAluno(Aluno aluno)
    {
        alunos.get(aluno.getNumeroChamada()).setNome(aluno.getNome());
        System.out.println("Aluno "+aluno.getNumeroChamada()+" está com o nome atualizado");
    }

    @Override
    public void deleteAluno(Aluno aluno)
    {
        alunos.remove(aluno);
        System.out.println("Aluno "+aluno.getNumeroChamada()+" foi removido.");
    }
}
