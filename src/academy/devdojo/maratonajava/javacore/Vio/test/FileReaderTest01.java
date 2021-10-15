package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileReader fileReader = new FileReader(file)) {
            while (fileReader.read() != -1) {
                System.out.println(fileReader.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
