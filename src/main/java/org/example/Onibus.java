package org.example;


import javax.swing.JOptionPane;

public class Onibus extends Veiculo {

    public Onibus(double custoFixo, double custoUnidade, double custoMensal) {
        super(custoFixo, custoUnidade, custoMensal);
    }

    public double calculaCusto() {
        return custoFixo = custoMensal;
    }

    public void verificaValorNegativo(double custoFixo) {
        if (custoFixo >= 0) {
            this.custoFixo = custoFixo;
        } else {
            JOptionPane.showMessageDialog(null, "O custo fixo não pode ser negativo. Definindo como 0.");
            this.custoFixo = 0;
        }

    }

    @Override
    public String toString() {
        return super.toString();
    }

}
