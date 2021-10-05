package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Carro {
    private String marca;
    private String modelo;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;

    public Carro(String marca, String modelo, double velocidadeMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println(this.marca);
        System.out.println(this.modelo);
        System.out.println(this.velocidadeMaxima);
        System.out.println(velocidadeLimite);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public static double getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }
}
