package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimencionais01 {
  public static void main(String[] args) {
    int[][] dias = new int[3][3]; // cada posição do array vai fazer referência para outro endereço de memória que
                                  // vai referênciar outro array
    // ou seja em cada posição do primeiro array vai conter outro array

    /* for (int i = 0; i < dias.length; i++) {
      for (int j = 0; j < dias[i].length; j++) {
        System.out.println(dias[i][j]);
      }
    } */

    for(int[] arrBase: dias){ //cria uma variável de referência para cada array que está dentro do array dias
      for(int num: arrBase){ // percorre os valores que estão dentro de cada array
        System.out.println(num);
      }
    }
  }
}
