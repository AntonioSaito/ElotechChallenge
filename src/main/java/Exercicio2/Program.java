package Exercicio2;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual valor da compra?");
        int compra = sc.nextInt();
        System.out.println("Qual valor do pagamento?");
        int pagamento = sc.nextInt();

        if(pagamento > compra) {
            int valor = pagamento - compra;
            Troco calculadorTroco = new Troco();
            int[] troco = calculadorTroco.calcularTroco(valor);

            System.out.println("Troco para R$" + valor + ":");
            for (int i = 0; i < calculadorTroco.notas.length; i++) {
                if (troco[i] > 0) {
                    System.out.println("R$" + calculadorTroco.notas[i] + ": " + troco[i] + " nota");
                }
            }
        }
        else {
            System.out.println("Não é possivel calcular o troco pois o valor da compra é maior do que o pagamento informado.");

        }


    }

}
