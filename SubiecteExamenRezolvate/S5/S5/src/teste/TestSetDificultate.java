package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestSetDificultate {
	
	TestGrila testGrila;
	
	@Before
	public void beforeEach() {
		testGrila = new TestGrila("Test1", 25, 3);
	}

	@Test
	public void setDificultateRightUsor() {
		testGrila.setDificultate("usor");
		assertEquals(testGrila.getDificultate(), 1);
	}

	@Test
	@Category(CategorieCustom.class)
	public void setDificultateRightDificil() {
		testGrila.setDificultate("dificil");
		assertEquals(testGrila.getDificultate(), 2);
	}
	
	@Test
	public void setDificultateRightPro() {
		testGrila.setDificultate("pro");
		assertEquals(testGrila.getDificultate(), 3);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void setDificultateException() {
		testGrila.setDificultate("extra hard");
	}
}
