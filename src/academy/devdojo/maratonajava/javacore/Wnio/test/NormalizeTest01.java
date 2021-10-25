package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) throws IOException {
        String diretorioProjeto = "home/luiz/dev";
        String arquivoTxt = "../../arquivo.txt";

        Path path = Paths.get(diretorioProjeto, arquivoTxt);

        if(Files.notExists(path)){
            Files.createFile(path);
        }

        System.out.println(path);
        System.out.println(path.normalize());

        Path path2 = Paths.get("/home/./luiz/./dev/");
        System.out.println(path2.normalize());
    }
}
