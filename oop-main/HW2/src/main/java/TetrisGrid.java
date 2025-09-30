public class TetrisGrid {
    private boolean[][] grid;

    public TetrisGrid(boolean[][] grid) {
        this.grid = grid;
    }

    public void clearRows() {
        int rows = grid[0].length;
        int cols = grid.length;
        int writeRow = 0;
        for (int readRow = 0; readRow < rows; readRow++) {
            boolean full = true;
            for (int col = 0; col < cols; col++) {
                if (!grid[col][readRow]) {
                    full = false;
                    break;
                }
            }
            if (!full) {
                for (int col = 0; col < cols; col++) {
                    grid[col][writeRow] = grid[col][readRow];
                }
                writeRow++;
            }
        }
        for (int row = writeRow; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                grid[col][row] = false;
            }
        }
    }

    public boolean[][] getGrid() {
        return grid;
    }
}
