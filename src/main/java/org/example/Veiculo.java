package org.example;


public class Veiculo {

    protected double custoFixo, custoUnidade, custoMensal;
    protected double numeroCorridas;


    public Veiculo(double custoFixo, double custoUnidade, double custoMensal) {

        this.custoFixo = custoFixo;
        this.custoUnidade = custoUnidade;
        this.custoMensal = custoMensal;

    }

    public double getCustoFixo() {
        return custoFixo;
    }

    public void setCustoFixo(double custoFixo) {
        this.custoFixo = custoFixo;
    }

    public double getCustoUnidade() {
        return custoUnidade;
    }

    public void setCustoUnidade(double custoUnidade) {
        this.custoUnidade = custoUnidade;
    }

    public double getCustoMensal() {
        return custoMensal;
    }

    public void setCustoMensal(double custoMensal) {
        this.custoMensal = custoMensal;
    }

    public double getNumeroCorridas() {
        return numeroCorridas;
    }

    public void setNumeroCorridas(int numeroCorridas) {
        this.numeroCorridas = numeroCorridas;
    }



    public double calculaCusto() {
        if (custoMensal < 0) {
            custoMensal = 0;
        }
        return custoMensal;
    }

    @Override
    public String toString() {
        return " ";
    }
}
