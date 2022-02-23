package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(1L, "Attack on titan", 19.99));
        mangas.add(new Manga(4L, "Berserk", 10.40));
        mangas.add(new Manga(5L, "Hellsing Ultimate", 22.10));
        mangas.add(new Manga(2L, "Pokemon", 15.50));
        mangas.add(new Manga(3L, "Dragon ball z", 2.99));
    }
}
