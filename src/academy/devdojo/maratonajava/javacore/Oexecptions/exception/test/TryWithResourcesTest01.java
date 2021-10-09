package academy.devdojo.maratonajava.javacore.Oexecptions.exception.test;

import academy.devdojo.maratonajava.javacore.Oexecptions.exception.dominio.Leitor1;
import academy.devdojo.maratonajava.javacore.Oexecptions.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo() {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) { //implements closeable ou autocloseable, eles fecham na ordem inversa que foram chamados ou seja fecha o 2 depois o 1

        } catch (IOException e) {

        }
    }

    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
