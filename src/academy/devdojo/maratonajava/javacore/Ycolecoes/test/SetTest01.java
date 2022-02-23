package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {

        //set vai utilizar o equals para verificar se tem um objeto duplicado e não vai inserir, HashSet não mantem a ordem de inserção
        //LinkedHashSet mantem a ordem de inserção
        Set<Manga> mangas = new LinkedHashSet<>();
        mangas.add(new Manga(1L, "Attack on titan", 19.99));
        mangas.add(new Manga(4L, "Berserk", 10.40));
        mangas.add(new Manga(5L, "Hellsing Ultimate", 22.10));
        mangas.add(new Manga(2L, "Pokemon", 15.50));
        mangas.add(new Manga(3L, "Dragon ball z", 2.99));
        mangas.add(new Manga(7L, "Dragon ball z", 2.99));

        for(Manga manga: mangas) {
            System.out.println(manga);
        }
    }
}
