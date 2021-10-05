package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Luffy", 5000.00);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Jinbei", 2000.00, "Java");

        System.out.println(desenvolvedor);
        System.out.println(gerente);
        desenvolvedor.imprime();
        gerente.imprime();
    }
}
