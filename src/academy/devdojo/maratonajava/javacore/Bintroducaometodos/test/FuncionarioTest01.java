package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Luiz");
        funcionario.setIdade(23);
        funcionario.setSalarios(new double[]{2000, 1.200, 2.500});

        funcionario.imprimirDados();
    }

}
