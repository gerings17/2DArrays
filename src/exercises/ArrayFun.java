package exercises;

public class ArrayFun {
	public int[][] createArray(int row, int col) {
		int[][] TwoD = new int[row][col];
		return TwoD;
	}

	public boolean equalsArray(int[][] a, int[][] b) {
		if (a == b)
			return true;
		if (a == null || b == null)
			return false;
		if (a.length != b.length)
			return false;

		for (int rowNum = 0; rowNum < a.length; rowNum++) {
			if (a[rowNum].length != b[rowNum].length)
				return false;
			for (int colNum = 0; colNum < a[rowNum].length; colNum++) {
				if (a[rowNum][colNum] != (b[rowNum][colNum]))
					return false;
			}
		}
		return true;

	}
}
