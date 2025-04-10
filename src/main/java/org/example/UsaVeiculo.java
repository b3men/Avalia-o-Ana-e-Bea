package org.example;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class UsaVeiculo {

    // relatório e cadastro de onibus
    static ArrayList<Onibus> onibus = new ArrayList<>();
    public static ArrayList<Onibus> getOnibus() {return onibus;}
    public static void cadastraOnibus(double custoFixo, double custoUnidade, double custoMensal) {
        Onibus o = new Onibus( custoFixo,  custoUnidade,  custoMensal);
        onibus.add(o);
    }

    // relatório e cadastro de taxi
    static ArrayList<Taxi> taxis = new ArrayList<>();
    public static ArrayList<Taxi> getTaxi() {return taxis;}
    public static void cadastraTaxi(double custoFixo, double custoUnidade, double custoMensal, double numeroCorridas) {
        Taxi t = new Taxi( custoFixo,  custoUnidade,  custoMensal,  numeroCorridas);
        taxis.add(t);
    }

    // relatório e cadastro de Bicicleta
    static ArrayList<Bicicleta> bicicletas = new ArrayList<>();
    public static ArrayList<Bicicleta> getBicicleta() {return bicicletas;}
    public static void cadastraBicicleta(double custoFixo, double custoUnidade, double custoMensal,  double qtdBicicletas) {
        Bicicleta b = new Bicicleta( custoFixo,  custoUnidade,  custoMensal, qtdBicicletas);
        bicicletas.add(b);
    }
    // relatório e cadastro de Trem
    static ArrayList<Trem> trens = new ArrayList<>();
    public static ArrayList<Trem> getTrem() {return trens;}
    public static void cadastraTrem(double custoFixo, double custoUnidade, double custoMensal,  double qtdQuilometros) {
        Trem tr = new Trem( custoFixo,  custoUnidade,  custoMensal, qtdQuilometros);
        trens.add(tr);
    }

    // relatório e cadastro de Patinete
    static ArrayList<Patinete> patinetes = new ArrayList<>();
    public static ArrayList<Patinete> getPatinete() {return patinetes;}
    public static void cadastraPatinete(double custoFixo, double custoUnidade, double custoMensal, double qtdHoraUsada) {
        Patinete p = new Patinete( custoFixo,  custoUnidade,  custoMensal, qtdHoraUsada);
        patinetes.add(p);
    }

    public static void main(String[] args) {
        int op = 0;
        String menu = " Menu \n" +
                "1- Inserir um Ônibus. \n" +
                "2- Inserir um Taxi. \n" +
                "3- Inserir um Bicicleta. \n" +
                "4- Inserir um Trem. \n" +
                "5- Inserir um Patinete. \n" +
                "6- Sair. \n";

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, menu));

            double custoFixo = Double.parseDouble(JOptionPane.showInputDialog("Digite o Custo Fixo:"));
            double custoUnidade = Double.parseDouble(JOptionPane.showInputDialog("Digite o Custo por Unidade:"));
            double custoMensal = Double.parseDouble(JOptionPane.showInputDialog("Digite o Custo Mensal:"));
            double numeroCorridas = Double.parseDouble(JOptionPane.showInputDialog("Digite o Número de corridas:"));
            double qtdBicicletas = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de bicicletas:"));
            double qtdQuilometros = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de quilômetros percorridos:"));
            double qtdHoraUsada = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas usadas:"));

            if (op == 1) cadastraOnibus( custoFixo,  custoUnidade,  custoMensal);
            if (op == 2) cadastraTaxi(custoFixo,  custoUnidade,  custoMensal,  numeroCorridas);
            if (op == 3) cadastraBicicleta(custoFixo, custoUnidade, custoMensal, qtdBicicletas);
            if (op == 4) cadastraTrem(custoFixo, custoUnidade, custoMensal, qtdQuilometros);
            if (op == 5) cadastraPatinete(custoFixo, custoUnidade, custoMensal, qtdHoraUsada);

            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");

        } while (op != 6);
    }
}