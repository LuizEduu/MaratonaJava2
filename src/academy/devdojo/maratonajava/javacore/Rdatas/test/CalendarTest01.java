package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(); //Calendar é uma classe abstract então não é possível dar new a partir dela
        Date date = calendar.getTime();
        System.out.println(date);

        if(calendar.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Domingo é o primeiro dia da semana");
        }

        System.out.println(calendar.get(Calendar.DAY_OF_WEEK)); //dia da semana que estou
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH)); // dia em que estou no mês
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR)); // dia em que estou no ano
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH)); //dia da semana que estou no mês
    }
}
