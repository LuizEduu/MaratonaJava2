package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "'Amsterdan' dd 'de' MMMM 'de' yyyy"; //tudo que você precisa que seja ignorado pelo sdf é colocado entre aspas simples
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));
    }
}
