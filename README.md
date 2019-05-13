# abstract-game-utils
Support for multiple board games in Java

## First level design
An abstract class GameState with two functions `abstract ArrayList<GameState> exploreOneMove()` and `ArrayList<GameState> search(Callable<Boolean> goalFunction)`. `exploreOneMove` returns all the possible states from the current state and `search` returns the path to the goal. The `goalFunction`, given a state, returns either true or false.

A concrete class ChessPosition that supports the functionality `Boolean searchForMate(int numMoves)` which checks if a checkmate is possible in less than numMoves.
