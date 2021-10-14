package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(1998, 04, 04, 21, 0, 0);
        System.out.println(ChronoUnit.DAYS.between(aniversario, LocalDateTime.now()));
        System.out.println(ChronoUnit.MONTHS.between(aniversario, LocalDateTime.now()));
        System.out.println(ChronoUnit.YEARS.between(aniversario, LocalDateTime.now()));
    }
}
