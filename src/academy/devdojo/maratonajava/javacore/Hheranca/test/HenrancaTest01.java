package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HenrancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("D", "55555555");
        Funcionario funcionario = new Funcionario("José", "23241", endereco, 2000.00);
        funcionario.imprime();
        funcionario.relatorioPagamento(); 
    }
}
