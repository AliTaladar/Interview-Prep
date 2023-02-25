import java.util.LinkedList;
import java.util.Queue;

public class main {

    public static void main(String[] args) {
        char[][] grid = new char[5][5];
        grid[0] = new char[]{'L', 'W', 'W', 'L', 'W'};
        grid[1] = new char[]{'L', 'W', 'W', 'L', 'L'};
        grid[2] = new char[]{'W', 'L', 'W', 'L', 'W'};
        grid[3] = new char[]{'W', 'W', 'W', 'W', 'W'};
        grid[4] = new char[]{'W', 'W', 'L', 'L', 'L'};

        System.out.println(minIsland(grid));

    }

    private static int minIsland(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 'W')
                    visited[i][j] = true;
                if (visited[i][j])
                    continue;

                int count = minIsland(grid, visited, i, j);
                if (count < min)
                    min = count;
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }

    private static int minIsland(char[][] grid, boolean[][] visited, int i, int j) {
        Queue<Integer[]> queue = new LinkedList<>();
        queue.add(new Integer[]{i, j});
        visited[i][j] = true;
        int count = 1;

        while (!queue.isEmpty()) {
            Integer[] current = queue.poll();
            i = current[0];
            j = current[1];

            if (i > 0 && !visited[i - 1][j] && grid[i - 1][j] == 'L') {
                queue.add(new Integer[]{i - 1, j});
                visited[i - 1][j] = true;
                count++;
            }
            if (i < grid.length - 1 && !visited[i + 1][j] && grid[i + 1][j] == 'L') {
                queue.add(new Integer[]{i + 1, j});
                visited[i + 1][j] = true;
                count++;
            }
            if (j > 0 && !visited[i][j - 1] && grid[i][j - 1] == 'L') {
                queue.add(new Integer[]{i, j - 1});
                visited[i][j - 1] = true;
                count++;
            }
            if (j < grid[i].length - 1 && !visited[i][j + 1] && grid[i][j + 1] == 'L') {
                queue.add(new Integer[]{i, j + 1});
                visited[i][j + 1] = true;
                count++;
            }
        }

        return count;
    }

}