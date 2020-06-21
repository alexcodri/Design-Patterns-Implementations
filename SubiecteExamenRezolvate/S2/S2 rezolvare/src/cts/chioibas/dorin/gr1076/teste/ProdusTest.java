package cts.chioibas.dorin.gr1076.teste;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;


public class ProdusTest {

    @Test
    @Category(CategorieCustom.class)
    public void setPretLowerBoundary() {
        Produs produs = new Produs("Prod1", 22.5);
        produs.setPret(1.0, 1);
        assertEquals(produs.getPret(), 1.0, 0.01);
    }

    @Test
    public void setPretUpperBoundary() {
        Produs produs = new Produs("Prod1", 22.5);
        produs.setPret(1000.0, 2);
        assertEquals(produs.getPret(), 500.0, 0.01);
    }

    @Test
    public void setPretRangeInnerInterval() {
        Produs produs = new Produs("Prod1", 22.5);
        produs.setPret(552.23, 50);
        assertEquals(produs.getPret(), 552.23, 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void setPretRangeOuterInterval() {
        Produs produs = new Produs("Prod1", 22.5);
        produs.setPret(2023.41, 50);
    }


    @Test
    public void serPretRightInnerInterval() {
        Produs produs = new Produs("Prod1", 22.5);
        produs.setPret(1.5, 2);
        assertEquals(produs.getPret(), 1.5, 0.01);
    }
}