package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimencionais02 {
    public static void main(String[] args) {
        int[][] dias = new int[3][];

        dias[0] = new int[2];
        dias[1] = new int[4];
        dias[2] = new int[6];

        for (int[] arrBase : dias) {
            for (int dia : arrBase) {
                System.out.println(dia);
            }
        }

    }
}
