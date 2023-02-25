def minHeightBst(array): 
    return constructMinHeightBst(array, 0, len(array) - 1)


def constructMinHeightBst(array, start, end):
    if start > end:
        return None

    middle = (start + end) // 2
    node = BST(array[middle])
    node.left = constructMinHeightBst(array, start, middle - 1)
    node.right = constructMinHeightBst(array, middle + 1, end)

    return node


class BST:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

    def insert(self, value):
        if value < self.value:
            if self.left is None:
                self.left = BST(value)
            else:
                self.left.insert(value)
        else:
            if self.right is None:
                self.right = BST(value)
            else:
                self.right.insert(value)
