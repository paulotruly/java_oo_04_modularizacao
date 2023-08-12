public class MetodoEscreva {
    public static void main(String[] args) {
        
        String s1 = "Testando o método escreva";
        escreva(s1);
        System.out.println("De volta ao método main");

    }

    public static void escreva(String frase) {
        System.out.println(frase);
    }

}
