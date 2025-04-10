package org.example;


import javax.swing.JOptionPane;

public class Bicicleta extends Veiculo {

    protected double qtdBicicletas;

    public Bicicleta(double custoFixo, double custoUnidade, double custoMensal, double qtdBicicletas) {
        super(custoFixo, custoUnidade, custoMensal);
        this.qtdBicicletas = 0;
    }


    public double calculaCusto() {
        custoMensal = qtdBicicletas * custoUnidade;
        return custoMensal;
    }

    public void verificaValorNegativo(double qtdBicicletas, double custoUnidade) {
        if (qtdBicicletas >= 0 && custoUnidade >= 0) {
            this.qtdBicicletas = qtdBicicletas;
            this.custoUnidade = custoUnidade;

        } else {
            JOptionPane.showMessageDialog(null, "A quantidade de bicicletas e custo por unidade não pode ser negativo. Definindo como 0.");
            this.qtdBicicletas = 0;
            this.custoUnidade = 0;
        }

    }

    @Override
    public String toString() {
        String ret = "O custo mensal da Bicicleta é de: R$" + custoMensal;
        return ret;

    }
}
