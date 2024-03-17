package Exercicio6;

public class TCalculoFatorial extends TCalculoValor {
	
	private double fatorialSegundoNumero;

    @Override
    public double calcular(double valor1, double valor2) {
        double fatorialValor1 = calcularFatorial(valor1);
        fatorialSegundoNumero = calcularFatorial(valor2);

        System.out.println("O fatorial do primeiro número é: " + fatorialValor1);

        return fatorialSegundoNumero;
    }
    
    
    private double calcularFatorial(double valor) {
        double fatorial = 1;
        for (int i = 1; i <= valor; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
