def powerset(array, i=None):
    # Write your code here.
    if i is None:
        i = len(array) - 1
    if i < 0:
        return [[]]
    ele = array[i]
    subsets = powerset(array, i - 1)
    for i in range(len(subsets)):
        current_subset = subsets[i]
        subsets.append(current_subset + [ele])
    return subsets