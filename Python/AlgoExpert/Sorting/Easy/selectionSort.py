def selectionSort(array):
    # Write your code here.
    for i in range(len(array) - 1):
        smallest_idx = i
        for current_idx in range(i + 1, len(array)):
            if array[current_idx] < array[smallest_idx]:
                smallest_idx = current_idx
        swap(array, i, smallest_idx)
    return array


def swap(array, i, j):
    array[i], array[j] = array[j], array[i]
