package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(23, 32, 12); //vai de 0 até 23 hrs, 24 lança uma exception
        LocalTime timeNow = LocalTime.now();
        System.out.println(time); //hora personalizada
        System.out.println(timeNow); //hora de agora
        System.out.println(time.getHour()); //pegar apenas a hora
        System.out.println(time.getMinute()); //pegar apenas os minutos
        System.out.println(time.getSecond()); //pegar apenas os segundos
        System.out.println(time.get(ChronoField.HOUR_OF_DAY)); //pega a hora da data time, no caso 23
        System.out.println(LocalTime.MIN); //pega o começo do dia o mínimo que são 00:00 ou meia noite
        System.out.println(LocalTime.MAX); //pega o máximo de horas do dia que são 23:59:59.999999999 horas
    }
}
