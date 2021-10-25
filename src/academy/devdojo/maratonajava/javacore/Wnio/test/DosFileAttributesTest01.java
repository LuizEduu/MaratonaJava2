package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        Path file = Paths.get("pasta/texte.txt");

        if(Files.notExists(file)){
            Files.createFile(file);
        }

        Files.setAttribute(file, "dos:hidden", true);
        Files.setAttribute(file, "dos:readonly", true);

        DosFileAttributes dosFileAttributes = Files.readAttributes(file, DosFileAttributes.class);
        System.out.println(dosFileAttributes.isHidden());
        System.out.println(dosFileAttributes.isReadOnly());
        System.out.println("---------------------------");


        DosFileAttributeView fileAttributeView = Files.getFileAttributeView(file, DosFileAttributeView.class);

        fileAttributeView.setHidden(false);
        fileAttributeView.setReadOnly(false);

        System.out.println(fileAttributeView.readAttributes().isHidden());
        System.out.println(fileAttributeView.readAttributes().isReadOnly());



    }
}
