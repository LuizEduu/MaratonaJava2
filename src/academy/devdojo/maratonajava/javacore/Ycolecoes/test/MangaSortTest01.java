package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {


    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(1L, "Attack on titan", 19.99));
        mangas.add(new Manga(4L, "Berserk", 10.40));
        mangas.add(new Manga(5L, "Hellsing Ultimate", 22.10));
        mangas.add(new Manga(2L, "Pokemon", 15.50));
        mangas.add(new Manga(3L, "Dragon ball z", 2.99));

        mangas.sort(new MangaByIdComparator());

        System.out.println(mangas);
    }
}
