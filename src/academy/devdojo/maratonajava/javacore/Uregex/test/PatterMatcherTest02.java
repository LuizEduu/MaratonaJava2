package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest02 {
    public static void main(String[] args) {
        // \d = Todos os dígitos
        // \D = Tudo que não for dígito
        // \s = Espaços em branco \t \n \f \r
        // \S = todos os caracteres excluindo os brancos
        // \w = a-Z A-Z, dígitos, _
        // [abc] = delimitar um range de procura ele vai procurar ou por a ou por b ou por c
        // [a-zA-C]
        String regex = "\\d";
        String texto = "hhj2482idjadw292992";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto   " + texto);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex " + regex);
        System.out.println("Posições encontratas");

        while (matcher.find()) {
            System.out.print(matcher.start() + " ");
        }
    }
}
