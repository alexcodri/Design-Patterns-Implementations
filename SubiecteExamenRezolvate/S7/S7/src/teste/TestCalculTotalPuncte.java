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
	public void calculTotalPuncteOrdering() {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(3);
		l1.add(7);
		test.setPunctajeIntrebari(l1);
		int s1 = test.calculTotalPuncte();
		test.setDificultate("dificil");
		int s2 = test.calculTotalPuncte();
		assertTrue(s1 < s2);
	}

	
	@Test
	@Category(CategorieCustom.class)
	public void calculTotalPuncteCardinality1() {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(3);
		test.setPunctajeIntrebari(l1);
		assertEquals(3, test.calculTotalPuncte());
	}
}
