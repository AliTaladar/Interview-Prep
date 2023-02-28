def levenshteinDistance(str1, str2):
    # Write your code here.
    grid = [[x for x in range(len(str1) + 1)] for y in range(len(str2) + 1)]
    
    for i in range(len(str2) + 1):
        grid[i][0] = i
    
    for row in range(1, len(str2) + 1):
        for col in range(1, len(str1) + 1):
            if str2[row - 1] == str1[col - 1]:
                grid[row][col] = grid[row - 1][col - 1]
            else:
                grid[row][col] = min(grid[row - 1][col], grid[row][col - 1], grid[row - 1][col - 1]) + 1

    return grid[-1][-1]
