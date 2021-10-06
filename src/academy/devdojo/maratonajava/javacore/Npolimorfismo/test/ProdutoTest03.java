package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("dwdad", 440);
        Tomate produto2 = new Tomate("tomate", 5);
        CalculadoraImposto.calcularImposto(produto);
        produto2.setDataValidade("10/10/2021");
        System.out.println("----------------------------------");
        CalculadoraImposto.calcularImposto(produto2);
    }
}
