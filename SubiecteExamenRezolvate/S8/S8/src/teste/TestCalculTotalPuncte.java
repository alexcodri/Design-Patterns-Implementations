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
	
	@Test(expected = UnsupportedOperationException.class)
	public void calculTotalPuncteCardinality1CaseDefautlt() {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(3);
		test.setPunctajeIntrebari(l1);
		test.setDificultate("pro");
		test.calculTotalPuncte();
	}

	@Test
	@Category(CategorieCustom.class)
	public void calculTotalPuncteCardinality2() {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(3);
		l1.add(7);
		test.setPunctajeIntrebari(l1);
		assertEquals(10, test.calculTotalPuncte());
	}
	
	@Test
	public void calculTotalPuncteRightCase2() {
		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.add(3);
		test.setPunctajeIntrebari(l1);
		test.setDificultate("dificil");
		assertEquals(6, test.calculTotalPuncte());
	}
	

}
