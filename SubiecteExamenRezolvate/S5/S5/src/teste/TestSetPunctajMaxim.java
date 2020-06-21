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

	@Test(expected = IllegalArgumentException.class)
	@Category(CategorieCustom.class)
	public void setPunctajMaximError() {
		testGrila.setPunctajMaxim(5);
	}

}
