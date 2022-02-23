package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;


class SmartphoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {

        // para utilizar navigable set é obrigatorio que a classe tenha o comparable ou o comparator implementado
        // você utiliza o TreeSet quando a classe implementa comparable e o TreeSet vai reordenar a coleção pelo que for definido no compareTo
        // ou no compare do comparator
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone nokia = new Smartphone("123", "Nokia");
        set.add(nokia);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());

        mangas.add(new Manga(1L, "Attack on titan", 19.99));
        mangas.add(new Manga(4L, "Berserk", 10.40));
        mangas.add(new Manga(5L, "Hellsing Ultimate", 22.10));
        mangas.add(new Manga(2L, "Pokemon", 15.50));
        mangas.add(new Manga(3L, "Inuyasha", 3.2));
        mangas.add(new Manga(7L, "Dragon ball z", 100));
        mangas.add(new Manga(7L, "Black Clover", 1));
        mangas.add(new Manga(7L, "One Piece", 2.99));

        for(Manga manga: mangas) {
            System.out.println(manga);
        }


        System.out.println("------------------------");
        Manga deathNote = new Manga(7L, "Death Note", 2.99);
        System.out.println(mangas.lower(deathNote));
        System.out.println(mangas.floor(deathNote));
        System.out.println(mangas.higher(deathNote));
        System.out.println(mangas.ceiling(deathNote));

        // lower < valor anterior ao objeto utilizado para comparação
        // floor <=
        // higher >
        // ceiling >=


    }
}
