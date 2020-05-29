import java.utils*;

package sudoku;

/** Represents the state of a sudoku **/
public class SudokuState {

	/**
	 * Integer which represents the number of 3 x 3 squares that are in the grid.
	 * For example, a dimension of 3 would be a 9 x 9 board in total. Must be a
	 * perfect square
	 **/
	private int dimension;

	/**
	 * Nested array list which contains values between 1 and dimension (both
	 * inclusive) or 0 to represent and empty field
	 **/
	private ArrayList<ArrayList<Integer>> grid;

	/**
	 * Constructor which creates an instance of the class SudokuState with a
	 * dimension of dim and
	 **/
	public SudokuState(int dim) {

		dimension = dim;

		grid = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i < dim; ++i) {
			grid.add(new ArrayList<Integer>());

			for (int j = 0; j < dim; ++j) {
				grid.get(i).add(0);
			}
		}
	}

	/** Getter function which returns the value at a specific index in the grid **/
	public Integer getValue(Integer row, Integer col) {
		return grid.get(row).get(col);
	}

	/** Setter function which sets the dimension of the sudoku board **/
	public setDimension(int dim, SudokuState sudokuState){
		/** Will need to check if the dimension is a perfect square **/
		sudokuState.dimension = dim;
	}

}

	} 

	public Boolean finalState(SudokuState sudokuState){ 
		

	}
 

			if(arr[i] == num){
				return True;
			} 
		ret urn False; 
		}  
	}
}
			



