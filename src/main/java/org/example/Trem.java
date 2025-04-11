package org.example;


import javax.swing.JOptionPane;

public class Trem extends Veiculo {
    protected double qtdQuilometros;

    public Trem(double custoFixo, double custoUnidade, double custoMensal, double qtdQuilometross) {
        super(custoFixo, custoUnidade, custoMensal);
        this.qtdQuilometros = 0;
    }

    public double calculaCusto() {
        custoMensal = custoFixo + (qtdQuilometros * custoUnidade);
        return custoMensal;
    }

    public void verificaValorNegativo(double custoFixo, double qtdQuilometros, double custoUnidade) {
        if (qtdQuilometros >= 0 || custoUnidade >= 0 || custoFixo >= 0) {
            this.qtdQuilometros = 0;
            this.custoUnidade = custoUnidade;
            this.custoFixo = 0;

        } else {
            JOptionPane.showMessageDialog(null, "A quantidade de quilômetros, o custo por unidade e o custo fixo não pode ser negativo. Definindo como 0.");
            this.qtdQuilometros = 0;
            this.custoUnidade = 0;
            this.custoFixo = 0;
        }

    }

    @Override
    public String toString() {
        String ret = "O custo mensal do Trem é de: R$" + custoMensal;
        return ret;
    }
}

