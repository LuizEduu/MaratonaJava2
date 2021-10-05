package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Desenvolvedor extends Funcionario {
    private String areaAtuacao;

    public Desenvolvedor(String nome, double salario, String areaAtuacao) {
        super(nome, salario);
        this.areaAtuacao = areaAtuacao;
    }

    @Override
    public void calculaBonus() {
        this.salario = this.salario + this.salario * 0.05;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario + '\'' +
                ", areaAtuacao='" + areaAtuacao + '\'' +
                '}';
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }
}
