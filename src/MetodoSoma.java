public class MetodoSoma {

    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int resposta = soma(a, b);
        System.out.println("A resposta é: "+resposta);

        
    }

    public static int soma(int x, int y) {
        int soma = 0;
        soma = x + y;
        return soma;
    }
    
}
