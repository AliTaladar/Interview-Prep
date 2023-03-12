def threeNumberSort(array, order):
    # Write your code here.
    index = 0

    for val in order:
        for i in range(len(array)):
            if val == array[i]:
                array[i], array[index] = array[index], array[i]
                index += 1

    return array
