package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {

        // generics é executado em tempo de compilação, ou seja. se algo foge do padrão ele não vai permitir a compilação do código.

        // Type erasure - apaga o tipo depois que o código é compilado, para manter a compatibilidade com sistemas legados.
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
    }
}
