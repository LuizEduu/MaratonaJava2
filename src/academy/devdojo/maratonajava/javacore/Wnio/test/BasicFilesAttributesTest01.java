package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFilesAttributesTest01 {
    public static void main(String[] args) throws IOException {
        LocalDateTime date = LocalDateTime.now().minusDays(10); //diminui 10 dias da data de hoje
        File file = new File("pasta2/novo.txt");
        boolean isCreated = file.createNewFile();
        boolean isModified = file.setLastModified(date.toInstant(ZoneOffset.UTC).toEpochMilli());//converte a data para UTC e transforma para long


        Path path = Paths.get("pasta2/novo_path.txt");

        if(Files.notExists(path)){
            Files.createFile(path);
        }

        FileTime from = FileTime.from(date.toInstant(ZoneOffset.UTC));
        Files.setLastModifiedTime(path, from);

        System.out.println(Files.isWritable(path));
        System.out.println(Files.isReadable(path));
        System.out.println(Files.isExecutable(path));
    }
}
