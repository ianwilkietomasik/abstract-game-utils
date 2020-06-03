package src.games.sudoku;

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

	public void print() {
		System.out.println("Sudoku grid of dimension" + dimension);
		for (int row = 0; row < dimension; ++row) {
			for (int col = 0; col < dimension; ++col) {
				System.out.print(grid.get(row).get(col).id() + "    ");
			}
			System.out.println();
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

	public int getDimension() {
		return this.dimension;
	}

	/** colList is the the column at col in sudokustate */
	public ArrayList<Integer> rowList(SudokuState sudokustate, int row) {
		ArrayList<Integer> rowList = new ArrayList<Integer>();
		for (int i = 0; i < sudokustate.getDimension(); ++i) {
			if (i == row) {
				int j = 0;
				while (j < sudokustate.getDimension()) {
					int app = sudokustate.getValue(j, i);
					rowList.add(app);
					j++;
				}
			}
		}
		return rowList;
	}

	public void printCol(SudokuState sudokustate, int col) {
		ArrayList<Integer> col_list = colList(sudokustate, col);
		Object[] my_array = col_list.toArray();
		for (int i = 0; i < col_list.size(); ++i) {
			System.out.print(my_array[i] + "    ");
		}
	}

	/** rowList is the row at row in sudokustate */
	public ArrayList<Integer> colList(SudokuState sudokustate, int col) {
		ArrayList<Integer> colList = new ArrayList<Integer>();
		int dim = sudokustate.getDimension();
		for (int i = 0; i < dim; ++i) {
			int j = 0;
			while (j < dim) {
				if (j == col) {
					int app = sudokustate.getValue(j, i);
					colList.add(app);
				}
				j++;
			}
		}
		return colList;
	}

	public void printRow(SudokuState sudokustate, int row) {
		ArrayList<Integer> row_list = colList(sudokustate, row);
		Object[] my_array = row_list.toArray();
		for (int i = 0; i < row_list.size(); ++i) {
			System.out.print(my_array[i] + "    ");
		}
	}
}
