package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Luiz");
        nomes.add("Dev Dojo");

        for(String nome: nomes) {
            System.out.println(nome);
        }
    }
}
