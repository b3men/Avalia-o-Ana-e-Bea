package org.example;


import javax.swing.JOptionPane;

public class Patinete extends Veiculo {

    protected double qtdHoraUsada;
    public Patinete(double custoFixo, double custoUnidade, double custoMensal, double  qtdHoraUsada) {
        super(custoFixo, custoUnidade, custoMensal);
        this.qtdHoraUsada = 0;
    }

    public double calculaCusto() {
        custoMensal = qtdHoraUsada * custoUnidade;
        return custoMensal;
    }

    public void verificaValorNegativo(double qtdHorasUsadas, double custoUnidade) {
        if (qtdHorasUsadas >= 0 && custoUnidade >= 0) {
            this.qtdHoraUsada = 0;
            this.custoUnidade = custoUnidade;

        } else {
            JOptionPane.showMessageDialog(null, "A quantidade de horas usadas e o custo por hora não pode ser negativa. Definindo como 0.");
            this.qtdHoraUsada = 0;
            this.custoUnidade = 0;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
