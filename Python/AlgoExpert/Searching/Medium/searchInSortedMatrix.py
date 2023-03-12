def searchInSortedMatrix(matrix, target):
    # Write your code here.
    row = 0
    col = len(matrix[row]) - 1

    while col >= 0 and row < len(matrix):
        if target < matrix[row][col]:
            col -= 1
        elif target > matrix[row][col]:
            row += 1
        else:
            return [row, col]

    return [-1, -1]
