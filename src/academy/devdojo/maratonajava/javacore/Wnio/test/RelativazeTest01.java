package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativazeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/luiz");
        Path classe = Paths.get("/home/luiz/devdojo/OlaMundo.java");
        Path pathToClass = dir.relativize(classe);
        System.out.println(pathToClass);

        Path absoluto1 = Paths.get("/home/luiz");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/luiz/devdojo/OlaMundo.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.2492422");


        System.out.println("1 " +  absoluto1.relativize(absoluto3));
        System.out.println("2 " +  absoluto3.relativize(absoluto1));
        System.out.println("3 " +  absoluto1.relativize(absoluto2));
        System.out.println("4 " +  absoluto1.relativize(relativo2));
        System.out.println("5 " +  absoluto1.relativize(relativo1));
    }
}
