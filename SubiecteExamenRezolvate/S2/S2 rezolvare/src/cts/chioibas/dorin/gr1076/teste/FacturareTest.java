package cts.chioibas.dorin.gr1076.teste;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class FacturareTest {

    @Test(expected = IllegalArgumentException.class)
    public void calculValoareTVAExistenceZero() {
        Facturare facturare = new Facturare();
        facturare.calculValoareTVA(0.0, 22.5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void calculValoareTVAExistenceNull() {
        Facturare facturare = new Facturare();
        facturare.calculValoareTVA(0.0, null);
    }

    @Test
    @Category(CategorieCustom.class)
    public void calculValoareTVACrossCheck() {
        Facturare facturare = new Facturare();
        facturare.adaugaProdusPeFactura(new Produs("Branza", 22.5));
        assertEquals(4.275, facturare.calculValoareTVA(facturare.calculValoareProduseFaraTVA(), 19.0), 0.01);
    }



}