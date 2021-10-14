package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale locale = new Locale("it", "it");
        Locale locale2 = new Locale("hi", "IN");
        Calendar calendar = Calendar.getInstance();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, locale2);
        System.out.println(df.format(calendar.getTime()));
        System.out.println(df2.format(calendar.getTime()));

        System.out.println(locale.getDisplayCountry());
    }
}
