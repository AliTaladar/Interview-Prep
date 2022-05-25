import java.util.LinkedList;
import java.util.Queue;

public class main {

    public static void main(String[] args) {
        char[][] grid = new char[6][5];
        grid[0] = new char[]{'W', 'L', 'W', 'W', 'W'};
        grid[1] = new char[]{'W', 'L', 'W', 'W', 'W'};
        grid[2] = new char[]{'W', 'W', 'W', 'L', 'W'};
        grid[3] = new char[]{'W', 'W', 'L', 'L', 'W'};
        grid[4] = new char[]{'L', 'W', 'W', 'L', 'L'};
        grid[5] = new char[]{'L', 'L', 'W', 'W', 'W'};

        System.out.println(islandCount(grid));

    }

    private static int islandCount(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 'W')
                    visited[i][j] = true;
                if (visited[i][j])
                    continue;

                exploreIsland(grid, visited, i, j);
                count++;
            }
        }

        return count;
    }

    private static void exploreIsland(char[][] grid, boolean[][] visited, int i, int j) {
        Queue<Integer[]> queue = new LinkedList<>();
        queue.add(new Integer[]{i, j});

        while (!queue.isEmpty()) {
            Integer[] current = queue.poll();
            i = current[0];
            j = current[1];
            visited[i][j] = true;

            if (i > 0 && !visited[i - 1][j] && grid[i - 1][j] == 'L')
                queue.add(new Integer[]{i - 1, j});
            if (i < grid.length - 1 && !visited[i + 1][j] && grid[i + 1][j] == 'L')
                queue.add(new Integer[]{i + 1, j});
            if (j > 0 && !visited[i][j - 1] && grid[i][j - 1] == 'L')
                queue.add(new Integer[]{i, j - 1});
            if (j < grid[i].length - 1 && !visited[i][j + 1] && grid[i][j + 1] == 'L')
                queue.add(new Integer[]{i, j + 1});
        }
    }

}