package exercises;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArrayFunTest {

	@Test
	public void testCreateArray() {
		int[][] a = new ArrayFun().createArray(2, 3);
		assertEquals("int[][]", a.getClass().getSimpleName());
	}

	@Test
	public void testEquals() {
		ArrayFun af = new ArrayFun();
		int[][] a = new int[][] { { 1, 2, 3 }, { 1, 2, 3 } };
		int[][] b = new int[][] { { 1, 2, 3 }, { 1, 2, 3 } };
		int[][] c = new int[][] { { 2, 2, 2 }, { 1, 2, 3 } };
		int[][] d = new int[][] { { 1, 2 }, { 3, 4, 5 } };
		int[][] e = null;
		int[][] f = null;
		int[][] g = new int[0][0];
		int[][] h = new int[1][0];

		assertEquals(true, af.equalsArray(a, b));
		assertEquals(false, af.equalsArray(a, c));
		assertEquals(false, af.equalsArray(b, c));
		assertEquals(true, af.equalsArray(a, a));
		assertEquals(false, af.equalsArray(a, d));
		assertEquals(true, af.equalsArray(e, f));
		assertEquals(false, af.equalsArray(f, g));
		assertEquals(false, af.equalsArray(g, h));

	}

}
