package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Pessoa(String nome, String cpf, Endereco endereco) {
        this(nome, cpf);
        this.endereco = endereco;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.cpf);

        if (this.endereco == null) {
            return;
        }

        System.out.println(this.endereco.getRua());
        System.out.println(this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
