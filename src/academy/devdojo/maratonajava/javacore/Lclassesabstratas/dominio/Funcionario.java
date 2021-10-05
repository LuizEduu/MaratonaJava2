package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }


   //se uma classe abstrata extende outra classe abstrata ela não é obrigada a implementar os métodos abstratos,
    // porém se ela implementar a sobrescrita vale para todas as outras filhas dela.

    @Override
    public void imprime() {
        System.out.println("Implementando metodo abstrato da classe abstrata Pessoa e só precisa aqui uma vez e vale para todas");
    }

    public abstract void calculaBonus();

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
