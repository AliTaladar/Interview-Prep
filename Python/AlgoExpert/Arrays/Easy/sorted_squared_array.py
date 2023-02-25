def sortedSquaredArray(array):
    # Write your code here.
    sorted_squares= [0 for x in array]
    start, end = 0, len(array) - 1

    for i in range(len(array) - 1, -1, -1):
        sq1 = array[start] ** 2
        sq2 = array[end] ** 2
        if (sq1 > sq2):
            sorted_squares[i] = sq1
            start += 1
        else:
            sorted_squares[i] = sq2
            end -= 1
    return sorted_squares
