package teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestCalculTotalPuncte {

	TestGrila test;
	
	@Before
	public void beforeEach() {
		test = new TestGrila("test1", 25, 1);
	}

	@Test
	public void calculTotalPuncteExistence() {
		assertEquals(0, test.calculTotalPuncte());
	}

	
	@Test
	@Category(CategorieCustom.class)
	public void calculTotalPuncteCardinality3() {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(3);
		l1.add(7);
		l1.add(5);
		test.setPunctajeIntrebari(l1);
		assertEquals(15, test.calculTotalPuncte());
	}
}
