package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    void load();
    int MAX_FILE_SIZE = 10;
    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }

     static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na interface");
    }
}
