package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestCalculValoareTVA {
	Facturare fact;
	
	@Before
	public void beforeEach() {
		fact = new Facturare();
	}

	@Test(expected = IllegalArgumentException.class)
	@Category(CategorieCustom.class)
	public void calculValoareTVAExistence() {
		fact.calculValoareTVA(null, 0.0);
	}
	
	@Test
	public void calculValoareTVAInverse() {
		double TVA = 19;
		double valoareTVA = 38;
		double pretFaraTVA = valoareTVA * 100 / TVA;
		assertEquals(pretFaraTVA, 200.0, 0.01);
	}
}
