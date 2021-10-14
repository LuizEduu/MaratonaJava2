package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate nowTwoYears = now.plusYears(2).plusDays(7);
        Period p1 = Period.between(now, nowTwoYears);
        Period p2 = Period.ofDays(10); //retorna o periodo em dias
        Period p3 = Period.ofWeeks(58); //retorna o periodo de dias em 58 semanas
        Period p4 = Period.ofMonths(3); //retorna o periodo de meses

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(now.until(now.plusDays(p3.getDays()), ChronoUnit.MONTHS));
    }
}
