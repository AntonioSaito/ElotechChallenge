package Exercicio2;

public class Troco {

    public static final int[] notas = {100, 50, 20, 10, 5, 2, 1};

    public int[] calcularTroco(int valor) {
        int[] troco = new int[notas.length];
        for (int i = 0; i < notas.length; i++) {
            troco[i] = valor / notas[i];
            valor %= notas[i];
        }
        return troco;
    }

}
