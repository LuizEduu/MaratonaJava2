package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File directory = new File("pasta");
        boolean diretorioCriado = directory.mkdir();
        System.out.println(diretorioCriado);
        File arquivo = new File(directory, "file.txt");
        arquivo.createNewFile();
        System.out.println(arquivo);
        File fileRenamed = new File(directory, "renomeado.txt");
        arquivo.renameTo(fileRenamed);
    }
}
