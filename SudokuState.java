import java.util.ArrayList;

/** Represents the state of a sudoku **/
public class SudokuState extends Grid {

	private int dimension;

	/**
	 * Constructor which creates an instance of the class SudokuState with a
	 * dimension of dim and
	 **/
	public SudokuState(int dim) {

		dimension = dim;

		for (int i = 0; i < dim; ++i) {
			grid.add(new ArrayList<Tile>());

			for (int j = 0; j < dim; ++j) {
				grid.get(i).add(new Tile(0));
			}
		}
	}

	/** Getter function which returns the value at a specific index in the grid **/
	public int getValue(int row, int col) {
		return grid.get(row).get(col).id();
	}

	/** Sets the value of the tile at row, col in grid */
	public void setValue(int row, int col, int val) {
		grid.get(row).get(col).setId(val);
	}
}
