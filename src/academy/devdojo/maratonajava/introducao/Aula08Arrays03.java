package academy.devdojo.maratonajava.introducao;

public class Aula08Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int[] numeros2 = { 1, 2, 3, 4, 5 };
        int[] numeros3 = new int[] { 1, 2, 3, 4, 5 };

        for (int num : numeros2) {
            System.out.println(num);
        }
    }
}
