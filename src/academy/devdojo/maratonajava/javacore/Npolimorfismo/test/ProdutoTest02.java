package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("MacPro", 15000);
        Produto produto2 = new Tomate("Americano", 40);
        Produto produto3 = new Televisao("Samsung", 4500);

        /*
        * Com polimorfismo eu posso criar variáveis de referência da superclasse e fazer elas apontarem para objetos subclasses que extendem essa classe pai
        * Mas o que existir expecificamente da subclasse eu não posso chamar utilizando uma variável de referência da classe pai.
        * */

        CalculadoraImposto.calcularImposto(produto);
        System.out.println("-----------------------");
        CalculadoraImposto.calcularImposto(produto2);
        System.out.println("-----------------------");
        CalculadoraImposto.calcularImposto(produto3);
    }
}
