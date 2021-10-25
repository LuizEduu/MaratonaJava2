package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("pasta/subpasta/file.bkp");
        Path path2 = Paths.get("pasta/subpasta/file.txt");
        Path path3 = Paths.get("pasta/subpasta/file.java");
        matches(path1, "glob:*.bkp"); //com um * só ignora os diretorios
        matches(path1, "glob:**/*.bkp"); //com 2 * ele procura nos diretorios tmb
        matches(path1, "glob:**/*.{bkp,java,txt}"); //com as {} ele vai procurar pelo que estiver dentro porém não pode colocar espaços
    }

    private static void matches(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": "+ matcher.matches(path));
    }
}
