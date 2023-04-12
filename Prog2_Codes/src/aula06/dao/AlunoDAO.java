package aula06.dao;

import aula06.model.Aluno;

import java.util.List;

public interface AlunoDAO
{
    public List<Aluno> getAllAlunos();
    public Aluno getAlunoByNumeroChamada(int numeroChamada);
    public void updateAluno(Aluno aluno);
    public void deleteAluno(Aluno aluno);
}
