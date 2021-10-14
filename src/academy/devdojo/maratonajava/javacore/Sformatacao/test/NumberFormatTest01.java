package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localePT = new Locale("pt", "br");
        Locale localeJP = Locale.JAPAN;
        NumberFormat[] numberFormat = new NumberFormat[3];

        numberFormat[0] = NumberFormat.getCurrencyInstance();
        numberFormat[1] = NumberFormat.getCurrencyInstance(localePT);
        numberFormat[2] = NumberFormat.getCurrencyInstance(localeJP); //conversão para o valor monetário

        double valor = 10_000.2130;
        for (NumberFormat nfa : numberFormat) {
            nfa.setMaximumFractionDigits(2);
            System.out.println(nfa.format(valor));
        }
    }
}
