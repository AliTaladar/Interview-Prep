def riverSizes(matrix):
    # Write your code here.
    visited = [[False for j in range(len(matrix[0]))] for i in range(len(matrix))]
    result = []

    for i in range(len(matrix)):
        for j in range(len(matrix[i])):
            if visited[i][j]:
                continue
                
            if matrix[i][j] == 1:
                result.append(find_river(matrix, visited, i, j))
            

    return result


def find_river(matrix, visited, row, col):
    to_visit = [(row, col)]
    visited[row][col] = True
    river_length = 0
    
    while to_visit:
        current = to_visit.pop(0)
        row = current[0]
        col = current[1]
        river_length += 1
        
        if row - 1 >= 0:
            if matrix[row - 1][col] == 1 and not visited[row - 1][col]:
                to_visit.append((row - 1, col))
                visited[row - 1][col] = True
        if col - 1 >= 0:
            if matrix[row][col - 1] == 1 and not visited[row][col - 1]:
                to_visit.append((row, col - 1))
                visited[row][col - 1] = True
        if row + 1 < len(matrix):
            if matrix[row + 1][col] == 1 and not visited[row + 1][col]:
                to_visit.append((row + 1, col))
                visited[row + 1][col] = True
        if col + 1 < len(matrix[row]):
            if matrix[row][col + 1] == 1 and not visited[row][col + 1]:
                to_visit.append((row, col + 1))
                visited[row][col + 1] = True
        
    return river_length



