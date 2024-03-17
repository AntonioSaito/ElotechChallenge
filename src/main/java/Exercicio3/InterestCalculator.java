package Exercicio3;

public class InterestCalculator {

    private double capital;
    private double taxaJuros;
    private double meses;

    public InterestCalculator() {
    }

    public InterestCalculator(double capital, double taxaJuros, double meses) {
        super();
        this.capital = capital;
        this.taxaJuros = taxaJuros;
        this.meses = meses;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public double getMeses() {
        return meses;
    }

    public void setMeses(double meses) {
        this.meses = meses;
    }

    public double montantesCalculator() {
        double taxa = taxaJuros / 100;
        double montante = capital * Math.pow(1 + taxa, meses);
        return montante;
    }

    public double jurosCompostosCalculator() {
        double taxa = taxaJuros / 100;
        double montante = capital * Math.pow(1 + taxa, meses);
        double totalJuros = montante - capital;
        return totalJuros;
    }
}
