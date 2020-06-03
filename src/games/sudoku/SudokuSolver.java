package src.games.sudoku;

import java.util.ArrayList;

public class SudokuSolver {

  public SudokuSolver() {

  }

  // public ArrayList<SudokuState> getNextStates(SudokuState sudokuState) {
  // TODO //}

  /**
   * checkRowCol is true if rowcol is true if 1: rowcol = col and all of the
   * columns are full or 2: rowcol = row and all of the rows are full else false
   */
  private boolean checkRowCol(SudokuState sudokustate, String rowcol) {

    /* establish the dimension of the sudokustate */
    int dim = sudokustate.getDimension();

    /* create a new list containing all of the intgers from 1 : dim */
    ArrayList<Integer> dimList = new ArrayList<Integer>();
    for (int i = 1; i <= dim; ++i) {
      dimList.add(i);
    }

    if (rowcol == "row") {
      for (int j = 0; j < dim; ++j) {
        ArrayList<Integer> curr_row = sudokustate.rowList(sudokustate, j);
        for (int e : dimList) {
          if (curr_row.contains(e)) {
            continue;
          } else {
            return false;
          }
        }
      }

    } else {
      for (int j = 0; j < dim; ++j) {
        ArrayList<Integer> curr_col = sudokustate.colList(sudokustate, j);
        for (int e : dimList) {
          if (curr_col.contains(e)) {
            continue;
          } else {
            return false;
          }
        }
      }
    }
    return true;
  }

  /* isFinalState is true if the sudoku state is final and false if not */
  public boolean isFinalState(SudokuState sudokustate) {
    if (checkRowCol(sudokustate, "row") && checkRowCol(sudokustate, "col")) {
      return true;
    } else {
      return false;
    }
  }
}