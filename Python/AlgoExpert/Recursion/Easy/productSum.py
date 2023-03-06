# Tip: You can use the type(element) function to check whether an item
# is a list or an integer.
def productSum(array, depth=1):
    # Write your code here.
    sum = 0
    for element in array:
        if isinstance(element, int):
            sum += element
        else:
            sum += productSum(element, depth + 1)

    return depth * sum
