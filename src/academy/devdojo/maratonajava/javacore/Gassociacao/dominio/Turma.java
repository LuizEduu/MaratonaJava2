package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Turma {
    private String nome;
    private int quantidadeAlunos;
    private Professor professor;

    public Turma(String nome, int quantidadeAlunos) {
        this.nome = nome;
        this.quantidadeAlunos = quantidadeAlunos;
    }

    public Turma(String nome, int quantidadeAlunos, Professor professor) {
        this.nome = nome;
        this.quantidadeAlunos = quantidadeAlunos;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
