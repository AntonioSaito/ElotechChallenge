package Exercicio6;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Soma
		System.out.printf("Insira o primeiro valor para soma: ");
		double valor1 = sc.nextDouble();
		System.out.printf("Insira o segundo valor para soma: ");
		double valor2 = sc.nextDouble();
		
		TCalculoSoma tCalculoSoma = new TCalculoSoma();
		double resultado = tCalculoSoma.calcular(valor1, valor2);
		
		System.out.printf("Resultado da soma: %.2f\n", resultado);
		
		
		//Multiplicação
		System.out.printf("Insira o primeiro valor para multiplicação: ");
		double mValor1 = sc.nextDouble();
		System.out.printf("Insira o segundo valor para multiplicação: ");
		double mValor2 = sc.nextDouble();
		
		TCalculoMultiplicacao tCalculoMultiplicação = new TCalculoMultiplicacao();
		double resultado2 = tCalculoMultiplicação.calcular(mValor1, mValor2);
		
		System.out.printf("Resultado da multiplicação: %.2f\n", resultado2);  
		
		
		//Fatorial

		System.out.printf("Insira primeiro numero que deseja calcular o fatorial: ");
		int numFatorial1 = sc.nextInt();
		System.out.printf("Insira segundo numero que deseja calcular o fatorial: ");
		int numFatorial2 = sc.nextInt();

		TCalculoFatorial tCalculoFatorial = new TCalculoFatorial();
		double fatorialNum1 = tCalculoFatorial.calcular(numFatorial1, numFatorial2);

		System.out.println("O fatorial do segundo numero é: " + fatorialNum1);
		
		
	}                            

}