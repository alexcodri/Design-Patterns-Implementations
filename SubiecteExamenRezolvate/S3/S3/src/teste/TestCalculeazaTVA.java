package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestCalculeazaTVA {
	
	private Facturare facturare;
	
	@Before
	public void createFacturare() {
		facturare = new Facturare();
	}

	@Test(expected = ExceptieCalculValoareTVA.class)
	public void calculValoareTVAExistanceTVA0() {
		facturare.calculValoareTVA(12.0, 0.0);
	}

	@Test(expected = ExceptieCalculValoareTVA.class)
	public void calculValoareTVAExistanceTVANull() {
		facturare.calculValoareTVA(12.0, null);
	}
	
	@Test(expected = ExceptieCalculValoareTVA.class)
	public void calculValoareTVAExistanceTVA1() {
		facturare.calculValoareTVA(12.0, 100.0);
	}
	
	@Test(expected = ExceptieCalculValoareTVA.class)
	public void calculValoareTVAExistanceVal0() {
		facturare.calculValoareTVA(0.0, 131.0);
	}
	
	@Test(expected = ExceptieCalculValoareTVA.class)
	public void calculValoareTVAExistanceValNull() {
		facturare.calculValoareTVA(null, 123.4);
	}
	
	@Test
    @Category(CategorieCustom.class)
    public void calculValoareTVACrossCheck() {
        Facturare facturare = new Facturare();
        facturare.adaugaProdusPeFactura(new Produs("Branza", 22.5));
        assertEquals(4.275, facturare.calculValoareTVA(facturare.calculValoareProduseFaraTVA(), 19.0), 0.01);
    }
}
