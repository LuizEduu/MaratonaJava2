package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios = new double[3];
    private double media;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);

        for (double salario : this.salarios) {
            System.out.print(salario + ", ");
        }
        mediaSalario();
    }

    public void mediaSalario() {

        for (double salario : this.salarios) {
            this.media += salario;
        }
        this.media /= this.salarios.length;

        System.out.println("\nMedia dos salários: " + this.media);
    }
}
