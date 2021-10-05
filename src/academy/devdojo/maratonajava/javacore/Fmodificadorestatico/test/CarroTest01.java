package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro("BMW", "A4", 280);
        Carro carro2 = new Carro("Ferrari", "T50", 320);
        Carro.setVelocidadeLimite(300);
        carro.imprime();
        carro2.imprime();

    }
}
