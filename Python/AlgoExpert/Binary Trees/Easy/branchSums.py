# This is the class of the input root. Do not edit it.
class BinaryTree:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None


def branchSums(root):
    # Write your code here.
    arr = []
    branchSumsHelper(root, 0, arr)
    return arr


def branchSumsHelper(root, sum, arr):
    if not root:
        return

    new_sum = sum + root.value
    if not root.left and not root.right:
        arr.append(new_sum)

    branchSumsHelper(root.left, new_sum, arr)
    branchSumsHelper(root.right, new_sum, arr)
    
