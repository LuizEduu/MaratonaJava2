package academy.devdojo.maratonajava.javacore.Oexecptions.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RunTimeExceptionTest03 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        try {
            throw new IllegalArgumentException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }


        // se não estão na mesma linha de herança não importa a ordem porque o polimorfismo aqui não pode ser usado
        try {
            talvezLanceException();
        } catch (SQLException | FileNotFoundException e) {
            System.out.println("SQL Exception");
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }
}
