def insertionSort(array):
    # Write your code here.
    for i in range(len(array)):
        j = i
        while j > 0 and array[j] < array[j - 1]:
            swap(array, j, j - 1)
            j -= 1
    return array


def swap(array, i, j):
    array[i], array[j] = array[j], array[i]
