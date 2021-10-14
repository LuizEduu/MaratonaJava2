package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now = now.withDayOfMonth(20); //mudar apenas o dia para 20;
        now = now.withMonth(04); //mudar apenas o mês para 4;
        System.out.println(now);

        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.THURSDAY)); //vai retornar a proxima quinta feira
        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.THURSDAY)); //vai retornar a ultima quinta feira
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth()); //vai retornar o primeiro dia do mês
        now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth()); //vai retornar o ultimo dia do mês
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
