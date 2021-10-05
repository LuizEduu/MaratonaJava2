package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class AssociacaoTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Maradona");
        Jogador jogador2 = new Jogador("Messi");
        Jogador jogador3 = new Jogador("Pelé");
        Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};
        Time time = new Time("Dream Team", jogadores);
        jogador1.setTime(time);
        jogador2.setTime(time);
        jogador3.setTime(time);
        System.out.println(jogador1.getTime());

        for(Jogador jogador: time.getJogadores()){
            System.out.println(jogador.getNome());
        }

    }
}
