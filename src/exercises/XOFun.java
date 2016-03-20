package exercises;

public class XOFun {
	int dim = 6;

	public static void main(String[] args) {
		new XOFun().createChamber();
	}

	public void createChamber() {
		String[][] chamber = new String[dim][dim];
		for (int row = 0; row < dim; row++) {
			for (int col = 0; col < dim; col++) {
				if (row == 0 || row == dim - 1)
					chamber[row][col] = "X ";
				else {
					if (col == 0 || col == dim - 1)
						chamber[row][col] = "X ";
					else
						chamber[row][col] = "O ";

				}
			}
		}
		for (int i = 0; i < dim; i++) {
			for (int x = 0; x < dim; x++) {
				System.out.print(chamber[i][x]);
			}
			System.out.println();
		}
	}

}
