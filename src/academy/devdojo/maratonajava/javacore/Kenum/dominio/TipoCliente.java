package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    //tem que vim sempre depois das enumerações

    private int valor;
    private String nome;

    TipoCliente(int valor, String nome) {
        this.valor = valor;
        this.nome = nome;
    }

    public static TipoCliente tipoClientePorNomeRelatorio(String nomeRelatorio) {
        for (TipoCliente cliente : values()) {
            if (cliente.getNome().equals(nomeRelatorio)) {
                return cliente;
            }
        }
        return null;
    }

    public int getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }
}
