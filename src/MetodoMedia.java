public class MetodoMedia {
    public static void main(String[] args) {
        double[] x = {10, 10, 4};
        double resultado = media(x);
        System.out.println("A média resultou em: " +resultado);
    }

    public static double media(double[] v) {
        double soma = 0;
        double media = 0;
        for (int i = 0; i < v.length; i++) {
            soma = soma + v[i];
        }
        media = soma / v.length;
        return media;
}

}
