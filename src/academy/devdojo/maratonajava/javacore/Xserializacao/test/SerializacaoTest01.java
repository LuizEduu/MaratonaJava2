package academy.devdojo.maratonajava.javacore.Xserializacao.test;

import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Xserializacao.dominio.Turma;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Luiz", "1234567");
        Turma turma = new Turma("Maratona Java");
        aluno.setTurma(turma);
        serializar(aluno);
        deserealizar();

    }

    private static void serializar(Aluno aluno) {
        Path path = Paths.get("pasta/serializacao/aluno.ser");
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(path))){
            objectOutputStream.writeObject(aluno);
        }catch (IOException e){
            e.printStackTrace();
        }
    }


    // Quando uma classe é desserealizada o constructor dela não é executado!
    private static void deserealizar(){
        Path path = Paths.get("pasta/serializacao/aluno.ser");
        try(ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(path))){
            Aluno aluno = (Aluno) objectInputStream.readObject(); //forçando o cast para aluno
            System.out.println(aluno);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
