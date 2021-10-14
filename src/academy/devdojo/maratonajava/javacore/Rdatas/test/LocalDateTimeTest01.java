package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.parse("2022-04-04");
        LocalTime localTime = LocalTime.parse("09:45:00");
        LocalDateTime localDateTime = localDate.atTime(localTime);

    }
}
