package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Database Loader");
    }

    @Override
    public void remove() {
        System.out.println("Data Remover");
    }
}
