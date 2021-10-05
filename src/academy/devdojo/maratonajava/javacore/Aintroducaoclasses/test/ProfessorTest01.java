package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

import java.text.MessageFormat;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Luiz";
        professor.idade = 23;
        professor.sexo = 'M';

        MessageFormat.format("Nome: {0} idade: {1} sexo:{2}", professor.nome, professor.idade, professor.sexo);
    }
}
