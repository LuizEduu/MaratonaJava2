package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String test = input.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();
        System.out.println("Digite M ou F para seu sexo: ");
        char sexo = input.next().charAt(0);



    }
}
