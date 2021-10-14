package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Luiz";
        String nome2 = "Luiz"; //String literal

        boolean compareNames = nome == nome2; //true pois a String Luiz já existe no pool de strings
                                             // e nome2 irá referênciar o mesmo espaço de memória
        if(compareNames){
            System.out.println("true");
        }

        String nomeConcatenado = nome.concat("Eduardo"); //concat strings, nome não vai ser alterado por conta do conceito de imutabilidade
        System.out.println(nomeConcatenado);

        String nome3 = new String("Luiz");
        System.out.println(nome2 == nome3); //false porque nome 3 não vai ser criado no pool de Strings e sim como um objeto comum
                                            // A referência de nome3 vai ser para esse objeto e não para Luiz no pool de strings
    }
}
