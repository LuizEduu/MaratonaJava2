package academy.devdojo.maratonajava.javacore.Oexecptions.runtime.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(10, 2));
    }

    private static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal, não pode ser 0");
        }

        return a / b;
    }
}
