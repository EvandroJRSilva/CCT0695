package aula02;

@DadosDaClasse(
        autor = "Fulano",
        dataCriacao = "18/08/22",
        dataUltimaModificacao = "02/03/23",
        versao = 0.2)
@IsExemplo(isExemplo = true)
public class ExemploAnotacao
{
    /* Na IDE IntelliJ, se você colocar o mouse em cima do nome da classe, vai aparecer sua documentação. Perceba que
    * aparece somente a anotação isExemplo. Isso acontece porque somente ela está com o @Documented em sua declaração.
    * Experimente adicionar @Documented na declaração de DadosDaClasse.java e depois ponha novamente o mouse em cima do
    * nome da classe ExemploAnotacao*/
    public String atributo1;
    public double atributo2;

    //...
}
