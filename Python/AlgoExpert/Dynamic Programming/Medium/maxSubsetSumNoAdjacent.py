def maxSubsetSumNoAdjacent(array):
    # Write your code here.
    if len(array) == 0:
        return 0
    elif len(array) == 1:
        return array[0]

    maximums = [array[0], max(array[0], array[1])]

    for i in range(2, len(array)):
        maximums.append(max(maximums[i - 1], array[i] + maximums[i - 2]))

    return maximums[len(maximums) - 1]
