public class CharGrid {
    private char[][] grid;

    public CharGrid(char[][] grid) {
        this.grid = grid;
    }

    public int charArea(char ch) {
        int minRow = Integer.MAX_VALUE;
        int maxRow = Integer.MIN_VALUE;
        int minCol = Integer.MAX_VALUE;
        int maxCol = Integer.MIN_VALUE;
        boolean found = false;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == ch) {
                    found = true;
                    minRow = Math.min(minRow, i);
                    maxRow = Math.max(maxRow, i);
                    minCol = Math.min(minCol, j);
                    maxCol = Math.max(maxCol, j);
                }
            }
        }
        if (!found) return 0;
        return (maxRow - minRow + 1) * (maxCol - minCol + 1);
    }

    public int countPlus() {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (isPlus(i, j)) {
                    count++;
                }
            }
        }
        return count;
    }

    private boolean isPlus(int row, int col) {
        char ch = grid[row][col];
        int[] directions = {0, 1, 0, -1, 0};
        int armLength = 1;
        while (true) {
            boolean valid = true;
            for (int d = 0; d < 4; d++) {
                int r = row + directions[d] * armLength;
                int c = col + directions[d + 1] * armLength;
                if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] != ch) {
                    valid = false;
                    break;
                }
            }
            if (!valid) {
                break;
            }
            armLength++;
        }
        return armLength > 1;
    }
}
