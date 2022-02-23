package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(1L, "Attack on titan", 19.99, 0));
        mangas.add(new Manga(4L, "Berserk", 10.40, 10));
        mangas.add(new Manga(5L, "Hellsing Ultimate", 22.10, 6));
        mangas.add(new Manga(2L, "Pokemon", 15.50, 2));
        mangas.add(new Manga(3L, "Dragon ball z", 2.99, 5));

//        Iterator<Manga> mangaIterator = mangas.iterator();
//        while (mangaIterator.hasNext()) {
//            Manga manga = mangaIterator.next();
//            if(manga.getQuantidade() == 0) {
//                mangaIterator.remove();
//            }
//        }

        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(mangas);
    }
}
