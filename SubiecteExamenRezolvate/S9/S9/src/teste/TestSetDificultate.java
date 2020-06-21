package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestSetDificultate {
	TestGrila test;
	
	@Before
	public void beforeEach() {
		test = new TestGrila("test1", 25, 1);
	}

	@Test
	@Category(CategorieCustom.class)
	public void setDificultateRightCase1() {
		test.setDificultate("usor");
		assertEquals(1, test.getDificultate());
	}
	
	@Test
	public void setDificultateRightCase2() {
		test.setDificultate("dificil");
		assertEquals(2, test.getDificultate());
	}
	
	@Test
	public void setDificultateRightCase3() {
		test.setDificultate("pro");
		assertEquals(3, test.getDificultate());
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void setDificultateErrorCondition() {
		test.setDificultate("extra hard");
	}
}
