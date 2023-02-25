# This is an input class. Do not edit.
class BST:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None


def validateBst(tree, min=None, max=None):
    # Write your code here.
    if not tree:
        return True
    elif min and tree.value < min:
        return False
    elif max and tree.value > max:
        return False

    return validateBst(tree.left, min, tree.value - 1) and validateBst(tree.right, tree.value, max)
