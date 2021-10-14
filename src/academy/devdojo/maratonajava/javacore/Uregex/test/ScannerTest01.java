package academy.devdojo.maratonajava.javacore.Uregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Levi, Eren, Mikasa";
        String[] separated = texto.split(",");
        for (String t: separated) {
            System.out.println(t);
        }
    }
}
