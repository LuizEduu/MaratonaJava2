package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();
        estudante.nome = "Luiz";
        estudante.idade = 23;
        estudante.sexo = 'M';

        impressoraEstudante.imprime(estudante);


    }
}
