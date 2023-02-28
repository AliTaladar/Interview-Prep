def numberOfWaysToTraverseGraph(width, height):
    # Write your code here.
    grid = [[0 for i in range(width)] for j in range(height)]
    grid[0][0] = 1

    for i in range(height):
        for j in range(width):
            if i - 1 >= 0:
                grid[i][j] += grid[i - 1][j]
            if j - 1 >= 0:
                grid[i][j] += grid[i][j - 1]

    return grid[-1][-1]
    
