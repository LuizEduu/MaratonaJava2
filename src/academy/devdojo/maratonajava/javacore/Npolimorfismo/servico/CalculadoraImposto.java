package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatório de imposto do computador");

        double imposto = computador.calcularImposto();
        System.out.println("imposto do computador " + computador.getNome());
        System.out.println("valor " + computador.getValor());
        System.out.println("Imposto a ser pago " + imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relatório de impost do computador");

        double imposto = tomate.calcularImposto();
        System.out.println("imposto do tomate " + tomate.getNome());
        System.out.println("valor " + tomate.getValor());
        System.out.println("Imposto a ser pago " + imposto);
    }
}
