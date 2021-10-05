package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class ExercicioTest01 {
    public static void main(String[] args) {
        Local local = new Local("Rua fulano de tal número 128 Centro");
        Professor professor = new Professor("Luiz", "Nenhuma");
        Aluno aluno = new Aluno("José", 23);
        Aluno[] alunosSeminario = {aluno};
        Seminario seminario = new Seminario("Java", local, alunosSeminario);
        Seminario[] seminarios = new Seminario[]{seminario};
        professor.setSeminarios(seminarios);

        System.out.println(local.getEndereco());
        seminario.imprime();
        professor.imprime();
        aluno.imprime();

    }
}
