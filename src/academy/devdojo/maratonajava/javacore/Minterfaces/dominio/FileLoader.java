package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("File Loader");
    }

    @Override
    public void remove() {
        System.out.println("File Remover");
    }
}
