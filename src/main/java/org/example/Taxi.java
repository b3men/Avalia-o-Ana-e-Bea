package org.example;


import javax.swing.JOptionPane;

public class Taxi extends Veiculo {

    protected double numeroCorridas;
    public Taxi(double custoFixo, double custoUnidade, double custoMensal, double numeroCorridas) {
        super(custoFixo, custoUnidade, custoMensal);
        this.numeroCorridas = 0;
    }

    public double calculaCusto() {
        custoMensal = (numeroCorridas * custoUnidade) + custoFixo;
        return custoMensal;
    }

    public void verificaValorNegativo(double custoFixo, double numeroCorridas, double custoUnidade) {
        if (custoFixo >= 0 && numeroCorridas >= 0 && custoUnidade >= 0) {
            this.custoFixo = custoFixo;
            this.numeroCorridas = numeroCorridas;
            this.custoUnidade = custoUnidade;

        } else {
            JOptionPane.showMessageDialog(null, "O custo fixo, o núemro de corridas e o custo por unidade não pode ser negativo. Definindo como 0.");
            this.custoFixo = 0;
            this.numeroCorridas = 0;
            this.custoUnidade = 0;
        }

    }

    @Override
    public String toString() {
        String ret = "O custo mensal do Taxi é de: R$" + custoMensal;
        return ret;
    }

}
