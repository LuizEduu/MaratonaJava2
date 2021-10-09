package academy.devdojo.maratonajava.javacore.Oexecptions.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) {
        criarNovoArquivo();

    }

    private static void criarNovoArquivo() {
        File file = new File("arquivo//teste.txt");

        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado " + isCreated);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(); //jogar a exception novamente mesmo após ser tratada
        }
    }
}
