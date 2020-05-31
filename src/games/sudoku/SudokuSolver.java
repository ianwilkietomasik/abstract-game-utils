package src.games.sudoku;

import java.util.ArrayList;

public class SudokuSolver {

  public ArrayList<SudokuState> getNextStates(SudokuState sudokuState) {
    // TODO //

  }

  public boolean isFinalState(SudokuState sudokustate) {
    int dim = sudokustate.getDimension();

    ArrayList<Integer> dimList = new ArrayList<Integer>();

    /* create a list of all of the possible entries in a row / column */
    for (int i = 1; i <= dim; ++i) {
      dimList.add(i);
    }

    for (int j = 0; j < dim; ++j) {

    }

  }

}