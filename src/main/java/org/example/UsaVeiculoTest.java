package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UsaVeiculoTest {

    @Test
    void testOnibus() {
        Onibus onibus = new Onibus(3000.0, 0, 0);
        onibus.calculaCusto();
        assertEquals(3000.0, onibus.custoMensal);
    }

    @Test
    void testTaxi() {
        Taxi taxis = new Taxi(1000.0, 10, 25.0, 0); // custo fixo + (corridas * custo por corrida)
        taxis.calculaCusto();
        assertEquals(1250.0, taxis.custoMensal);
    }

    @Test
    void testBicicletaCompartilhada() {
        Bicicleta bicicletas = new Bicicleta(100, 20.0, 0, 0); // unidades * manutenção por unidade
        bicicletas.calculaCusto();
        assertEquals(2000.0, bicicletas.custoMensal);
    }

    @Test
    void testTremUrbano() {
        Trem trens = new Trem(8000.0, 150.0, 3.0, 0); // fixo + (km * custo por km)
        trens.calculaCusto();
        assertEquals(8450.0, trens.custoMensal);
    }

}
