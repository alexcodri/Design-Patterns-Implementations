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
	
	@Test(expected = UnsupportedOperationException.class)
	public void calculTotalPuncteExistenceNull() {
		test.calculTotalPuncte();
	}
	
	@Test(expected = UnsupportedOperationException.class)
	@Category(CategorieCustom.class)
	public void calculTotalPuncteExistence0() {
		test.setPunctajeIntrebari(new ArrayList<Integer>());
		test.calculTotalPuncte();
	}

	@Test
	public void calculTotalPuncteCardinality2Case1() {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(3);
		l1.add(7);
		test.setPunctajeIntrebari(l1);
		assertEquals(10, test.calculTotalPuncte());
	}
	
	@Test
	public void calculTotalPuncteCardinality2Case2() {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(3);
		l1.add(7);
		test.setPunctajeIntrebari(l1);
		test.setDificultate("dificil");
		assertEquals(20, test.calculTotalPuncte());
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void calculTotalPuncteCardinality2Default() {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(3);
		l1.add(7);
		test.setDificultate("pro");
		test.setPunctajeIntrebari(l1);
		test.calculTotalPuncte();
	}
}
