def removeIslands(matrix):
    # Write your code here.
    visited = [[False for j in range(len(matrix[i]))] for i in range(len(matrix))]
    
    for i in range(len(matrix)):
        for j in range(len(matrix[i])):
            if visited[i][j]:
                continue
            
            is_island = False
            if matrix[i][j] == 1:
                is_island, land = find_land(matrix, visited, i, j)
            else:
                visited[i][j] = True
            
            if is_island:
                remove_island(matrix, land)
    
    return matrix


def find_land(matrix, visited, row, col):
    land = [(row, col)]
    is_island = True
    visited[row][col] = True

    idx = 0
    while idx < len(land):
        curr = land[idx]
        row = curr[0]
        col = curr[1]
        print(curr, len(matrix[row]))
        if row == 0 or row == len(matrix) - 1 or col == 0 or col == len(matrix[row]) - 1:
            is_island = False

        if row - 1 >= 0:
            if not visited[row - 1][col] and matrix[row - 1][col] == 1:
                land.append((row - 1, col))
                visited[row - 1][col] = True
        if col + 1 < len(matrix[row]):
            if not visited[row][col + 1] and matrix[row][col + 1] == 1:
                land.append((row, col + 1))
                visited[row][col + 1] = True
        if row + 1 < len(matrix):
            if not visited[row + 1][col] and matrix[row + 1][col] == 1:
                land.append((row + 1, col))
                visited[row + 1][col] = True
        if col - 1 >= 0:
            if not visited[row][col - 1] and matrix[row][col - 1] == 1:
                land.append((row, col - 1))
                visited[row][col - 1] = True

        idx += 1

    return (is_island, land)


def remove_island(matrix, land):
    for l in land:
        row = l[0]
        col = l[1]
        matrix[row][col] = 0


