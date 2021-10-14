package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("/home/luiz/Documents/workspace/MaratonaJava/arquivo/file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println(isCreated);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
