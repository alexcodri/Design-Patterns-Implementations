package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestSetPret {
	
	private Produs produs;

	@Before
	public void beforeAll() {
		produs = new Produs("p1", 22.5);
	}
	
	@Test
	public void setPretRightCase1() {
		produs.setPret(55.0, 1);
		assertEquals(55.0, produs.getPret(), 0.01);
	}
	
	@Test
	public void setPretRightCase2If() {
		produs.setPret(1.5, 2);
		assertEquals(1.5, produs.getPret(), 0.01);
	}
	
	@Test
	public void setPretRightCase2Else() {
		produs.setPret(30.0, 2);
		assertEquals(15, produs.getPret(), 0.01);
	}
	
	@Test
	@Category(CategorieCustom.class)
	public void setPretRightDefault() {
		produs.setPret(444.0, 1000);
		assertEquals(444.0, produs.getPret(), 0.01);
	}

	@Test
	public void setPretLowerBoundary() {
		produs.setPret(1.0, 2);
		assertEquals(1.0, produs.getPret(), 0.01);
	}
	
	@Test
	public void setPretHigherBoundary() {
		produs.setPret(1000.0, 2);
		assertEquals(500.0, produs.getPret(), 0.01);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void setPretException() {
		produs.setPret(10123123.0, 2);
	}
}
