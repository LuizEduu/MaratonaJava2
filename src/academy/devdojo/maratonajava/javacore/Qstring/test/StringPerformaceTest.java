package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerformaceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatStringBuider(100_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo StringBuider " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatString(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo String " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo StringBuffer " + (fim - inicio) + "ms");
    }

    private static void concatString(int tamanho) {
        String texto = "";

        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    private static void concatStringBuider(int tamanho) {
        StringBuilder stringBuilder = new StringBuilder(tamanho); //posso passar o tamanho que o StringBuider precisa alocar

        for (int i = 0; i < tamanho; i++) {
            stringBuilder.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho) {
        StringBuffer stringBuffer = new StringBuffer(tamanho);

        for (int i = 0; i < tamanho; i++) {
            stringBuffer.append(i);
        }
    }
}
