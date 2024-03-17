package Exercicio3;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Calculador de Juros Compostos: ");
        System.out.printf("Insira o capital inicial: ");
        double capital = sc.nextDouble();
        System.out.printf("Insira o juros mensal(em porcentagem): ");
        double taxaJuros = sc.nextDouble();
        System.out.printf("Insira a quantidade de meses a ser aplicado: ");
        double meses = sc.nextDouble();


        InterestCalculator interestCalculator = new InterestCalculator(capital, taxaJuros, meses);

        double montanteTotal = interestCalculator.montantesCalculator();
        double jurosTotal = interestCalculator.jurosCompostosCalculator();

        System.out.printf("Valor investido: R$ %.2f\n", interestCalculator.getCapital());
        System.out.printf("Valor total (montante): R$ %.2f\n", montanteTotal);
        System.out.printf("Total em juros ao final do periodo: R$ %.2f\n", jurosTotal);

    }
}
