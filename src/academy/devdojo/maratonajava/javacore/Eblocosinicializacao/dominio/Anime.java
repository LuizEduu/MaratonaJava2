package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodios;

    {
        this.episodios = new int[12];
    }

    public Anime(String nome, int[] episodios) {
        this.nome = nome;
        this.episodios = episodios;
    }

    public void imprime() {
        System.out.println(this.nome);
        for (int episodio : this.episodios) {
            System.out.println(episodio + ", ");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}
