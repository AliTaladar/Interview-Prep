def minimumPassesOfMatrix(matrix):
    # Write your code here.
    passes = 0
    valid_negatives, has_negatives = find_valid_negatives(matrix)
    while len(valid_negatives) > 0:
        for negative in valid_negatives:
            row = negative[0]
            col = negative[1]
            matrix[row][col] *= -1
        passes += 1
        valid_negatives, has_negatives = find_valid_negatives(matrix)
    
    if not has_negatives:
        return passes
    else:
        return -1


def find_valid_negatives(matrix):
    negatives = []
    has_negatives = False
    for i in range(len(matrix)):
        for j in range(len(matrix[i])):
            if matrix[i][j] < 0:
                if has_adjacent_positives(matrix, i, j):
                    negatives.append((i, j))
                has_negatives = True
    return negatives, has_negatives


def has_adjacent_positives(matrix, row, col):
    if row - 1 >= 0 and matrix[row - 1][col] > 0:
        return True
    elif row + 1 < len(matrix) and matrix[row + 1][col] > 0:
        return True
    elif col - 1 >= 0 and matrix[row][col - 1] > 0:
        return True
    elif col + 1 < len(matrix[row]) and matrix[row][col + 1] > 0:
        return True
    
    return False


    