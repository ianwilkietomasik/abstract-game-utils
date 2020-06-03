package src.games.sudoku;

public class Sudoku {
  public static void main(String[] args) {

    SudokuState mySudokuState = new SudokuState(9);

    mySudokuState.setValue(0, 0, 5);
    mySudokuState.setValue(0, 1, 4);
    mySudokuState.setValue(1, 0, 3);

    mySudokuState.print();

    System.out.println(" list here");

    mySudokuState.printRow(mySudokuState, 0);

    SudokuSolver mySolver = new SudokuSolver();

    System.out.print(mySolver.isFinalState(mySudokuState));

  }

}