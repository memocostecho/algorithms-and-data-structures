import java.util.HashMap;

/**
 * Sudoku is a number-placement puzzle. The objective is to fill a 9 × 9 grid with numbers in such a way that each column,
 * each row, and each of the nine 3 × 3 sub-grids that compose the grid all contain all of the numbers from 1 to 9 one time.
 * <p>
 * Implement an algorithm that will check whether the given grid of numbers represents a valid Sudoku puzzle according to
 * the layout rules described above. Note that the puzzle represented by grid does not have to be solvable.
 */
public class Sudoku {

    private static boolean sudoku2(char[][] grid) {

        HashMap<String, Character> map = new HashMap<>();

        for(int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[0].length; j++) {

                if(map.get("R"+i) == grid[i][j] ||
                        map.get("C"+j) == grid[i][j]) {
                    return false;
                }


                map.put("R"+i, grid[i][j]);
                map.put("C"+j, grid[i][j]);
            }
        }

        return true;


    }







    public static void main(String[] args) {
            System.out.println(sudoku2(new char[][] {}));
    }

}


