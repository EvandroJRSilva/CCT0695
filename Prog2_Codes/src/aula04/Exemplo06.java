package aula04;

import java.io.*;

public class Exemplo06
{
    // Criando método que, se necessário, lança exceção
    public static void encontraArquivo() throws IOException
    {
        // Código que pode gerar exceção
        File novoArquivo = new File("teste.txt");
        FileInputStream stream = new FileInputStream(novoArquivo);
    }

    public static void main(String[] args)
    {
        try{
            encontraArquivo();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
