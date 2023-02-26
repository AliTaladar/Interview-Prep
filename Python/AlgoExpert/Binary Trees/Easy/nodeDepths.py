def nodeDepths(root, curr_depth=0):
    # Write your code here.
    if not root:
        return 0

    sum = 0
    sum += nodeDepths(root.left, curr_depth + 1)
    sum += nodeDepths(root.right, curr_depth + 1)
    sum += curr_depth

    return sum
    
    
# This is the class of the input binary tree.
class BinaryTree:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None
