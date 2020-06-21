package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestSetPunctajMaxim {

	TestGrila testGrila;
	
	@Before
	public void beforeEach() {
		testGrila = new TestGrila("Test1", 25, 3);
	}
	
	@Test
	public void setPunctajMaximLowerBoundary() {
		testGrila.setPunctajMaxim(10);
		assertEquals(10, testGrila.getPunctajMaxim());
	}
	
	@Test
	public void setPunctajMaximHigherBoundary() {
		testGrila.setPunctajMaxim(90);
		assertEquals(90, testGrila.getPunctajMaxim());
	}

	@Test(expected = IllegalArgumentException.class)
	@Category(CategorieCustom.class)
	public void setPunctajMaximErrorCondition() {
		testGrila.setPunctajMaxim(-123);
	}

}
