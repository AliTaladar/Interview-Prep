def isMonotonic(array):
    # Write your code here.
    return is_non_increasing(array) or is_non_decreasing(array)


def is_non_increasing(array):
    for i in range(len(array) - 1):
        if array[i + 1] > array[i]:
            return False
    return True


def is_non_decreasing(array):
    for i in range(len(array) - 1):
        if array[i + 1] < array[i]:
            return False
    return True
