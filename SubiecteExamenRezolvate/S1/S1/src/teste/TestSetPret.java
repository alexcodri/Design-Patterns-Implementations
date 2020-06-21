package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestSetPret {
	Produs produs;
	
	@Before
	public void beforeEach() {
		produs = new Produs("p1", 200.2);
	}
	
	@Test
	@Category(CategorieCustom.class)
	public void setPretRight() {
		produs.setPret(500.0, 14);
		assertEquals(500.0, produs.getPret(), 0.01);
	}
	
	@Test
	public void setPretHigherBoundary() {
		produs.setPret(1000.0, 2);
		assertEquals(500.0, produs.getPret(), 0.01);
	}
	
	@Test
	public void setPretLowerBoundary() {
		produs.setPret(1.0, 1);
		assertEquals(1.0, produs.getPret(), 0.01);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void setPretErrorCondition() {
		produs.setPret(-1231.0, 1);
	}
}
