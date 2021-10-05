package academy.devdojo.maratonajava.introducao;

public class Aula06OperadorTernario {
    public static void main(String[] args) {
        double salario = 4000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String naoDoar = "Ainda não tenho condições, mas vou ter!";
        String resultado = (salario >=5000) ? mensagemDoar:naoDoar;

        System.out.println(resultado);
    }
}
