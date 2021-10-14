package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.*;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime01 = LocalDateTime.now();
        LocalDateTime localDateTime02 = localDateTime01.plusYears(2).plusMinutes(10); //acrescenta 2 anos e 10 minutos a mais
        LocalTime now = LocalTime.now();
        LocalTime localTimeWith7Hours = now.minusHours(7).minusMinutes(20); //acrescenta 7 horas e 20 minutos a mais em now

        Duration duration = Duration.between(localDateTime01, localDateTime02);
        Duration d2 = Duration.between(now, localTimeWith7Hours);

        System.out.println(duration);
        System.out.println(d2);
    }
}
