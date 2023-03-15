# simple solution - easier to read and understand
# def firstDuplicateValue(array):
#     visited = set()
#     for num in array:
#         if num in visited:
#             return num
#         else:
#             visited.add(num)
#     return -1
def firstDuplicateValue(array):
    for num in array:
        abs_val = abs(num)
        if array[abs_val - 1] < 0:
            return abs_val
        array[abs_val - 1] *= -1
        print(array)
    return -1
