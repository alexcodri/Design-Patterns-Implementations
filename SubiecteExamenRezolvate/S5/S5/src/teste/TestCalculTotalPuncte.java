package teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class TestCalculTotalPuncte {
	
TestGrila testGrila;
	
	@Before
	public void beforeEach() {
		testGrila = new TestGrila("Test1", 25, 1);
	}

	@Test
	public void calculTotalPuncteOrdering() {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(3);
		l1.add(7);
		testGrila.setPunctajeIntrebari(l1);
		int first = testGrila.calculTotalPuncte();
		testGrila.setDificultate("dificil");
		int second = testGrila.calculTotalPuncte();
		assertTrue(second > first);
	}
	
	@Test
	public void calculTotalPuncteCardinality1Case1() {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(3);
		testGrila.setPunctajeIntrebari(l1);
		assertEquals(3,testGrila.calculTotalPuncte());
	}

	@Test
	@Category(CategorieCustom.class)
	public void calculTotalPuncteCardinality1Case2() {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(3);
		testGrila.setPunctajeIntrebari(l1);
		testGrila.setDificultate("dificil");
		assertEquals(6,testGrila.calculTotalPuncte());
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void calculTotalPuncteCardinality1CaseDefautlt() {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(3);
		testGrila.setPunctajeIntrebari(l1);
		testGrila.setDificultate("pro");
		testGrila.calculTotalPuncte();
	}
	
}
