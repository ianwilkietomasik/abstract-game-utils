package src.games.sudoku;

/* This is the abstract class for a tile, which will be inheritable by
any of the games */
public class Tile {

  /** Data members */

  /* This is a numeric identifier for the tile */
  private int id;

  /* Boolean value representing whether or not a tile is occupied */
  private Boolean occupied;

  /** Methods */

  /* Constructor for an object of class tile */
  public Tile(int identifier) {

    id = identifier;

    occupied = false;

  }

  /* Returns true if the tile is occupied and false if not */
  public Boolean isOccupied() {
    return this.occupied;
  }

  /* returns the value of the id */
  public int id() {
    return this.id;
  }

  /* sets the value of occupied */
  public void setOccupied(boolean occupied) {
    this.occupied = occupied;
  }

  /* sets the value of id */
  public void setId(int id) {
    this.id = id;
  }

}