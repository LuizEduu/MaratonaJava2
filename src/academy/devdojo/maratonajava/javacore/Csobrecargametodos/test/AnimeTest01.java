package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("One Piece", "Mangá", 1026);
        anime.init("One Piece", "Mangá", 1026, "Aventura");
        // Sobrecarga de metodos permite que o mesmo método com o mesmo nome tenha uma quantidade de paramêtros diferentes
        // o modificador de acesso e o retorno não importam desde que a quantidade ou os tipos dos paramêtros sejam diferentes
        anime.imprime();
    }
}
