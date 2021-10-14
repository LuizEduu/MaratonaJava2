package academy.devdojo.maratonajava.javacore.Rdatas.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateTest01 {
    public static void main(String[] args) {
        //LocalDate não trabalha com horas só datas e foi incluida na versão 8 do Java
        LocalDate localDate = LocalDate.of(2022, Month.JANUARY, 27); //uma das mudanças é que agora janeiro começa do 1 e não do 0
        System.out.println(localDate.getYear()); //pegar o ano
        System.out.println(localDate.getMonthValue()); //pegar o valor do mês
        System.out.println(localDate.getDayOfWeek()); //dia da semana da data
        System.out.println(localDate.lengthOfMonth()); //saber quantos dias tem o mês
        System.out.println(localDate.isLeapYear()); //saber se o ano é bixesto ou não
        System.out.println(localDate.get(ChronoField.YEAR_OF_ERA));
        System.out.println(LocalDate.now()); //pegar a data de agora
        System.out.println(LocalDate.MAX); //máximo de datas possíveis
        System.out.println(LocalDate.MIN); //minímo de datas possíveis

    }
}
