package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Tsubasa", TipoCliente.PESSOA_JURIDICA);
        System.out.println(cliente);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        System.out.println(TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física"));
    }
}
