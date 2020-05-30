import java.util.ArrayList;

/** represents an abstract grid */
public class Grid {

  /* the height of the grid */
  public int y_dim = 0;

  /* the width of the grid */
  public int x_dim = 0;

  /* the representation of a grid */
  public ArrayList<ArrayList<Tile>> grid = new ArrayList<ArrayList<Tile>>();

}