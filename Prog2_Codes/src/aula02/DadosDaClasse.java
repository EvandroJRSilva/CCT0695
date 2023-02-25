package aula02;

public @interface DadosDaClasse
{
    String autor();
    String dataCriacao();
    String dataUltimaModificacao() default "N/A";
    double versao() default 0.1;
    boolean prontoParaUso() default false;
}
