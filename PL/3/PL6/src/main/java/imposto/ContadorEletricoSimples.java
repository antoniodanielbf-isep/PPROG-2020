/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imposto;

/**
 *
 * @author pokem
 */
public class ContadorEletricoSimples extends ContadorEletrico{
    private static double potLimite = 6.9;
    private static double custoMenor = 0.13;
    private static double custoMaior = 0.16;

    public ContadorEletricoSimples(String cliente, int consumo, double potencia) {
        super(cliente, consumo, potencia);
    }

    public String toString() {
        return String.format("%s Consumo: %d", super.toString(), super.getConsumo());
    }

    @Override
    public double calcularCusto() {
        return (super.getPotencia() < 6.9)
                ? super.getConsumo() * getCustoMenor()
                : super.getConsumo() * getCustoMaior();
    }

    public static double getPotLimite() {
        return ContadorEletricoSimples.potLimite;
    }

    public static double getCustoMenor() {
        return ContadorEletricoSimples.custoMenor;
    }

    public static double getCustoMaior() {
        return ContadorEletricoSimples.custoMaior;
    }

    public static void setPotLimite(double potLimite) {
        ContadorEletricoSimples.potLimite = potLimite;
    }

    public static void setCustoMenor(double custoMenor) {
        ContadorEletricoSimples.custoMenor = custoMenor;
    }

    public static void setCustoMaior(double custoMaior) {
        ContadorEletricoSimples.custoMaior = custoMaior;
    }
}
