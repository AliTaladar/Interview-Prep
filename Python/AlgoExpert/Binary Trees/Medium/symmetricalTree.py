# This is an input class. Do not edit.
class BinaryTree:
    def __init__(self, value, left=None, right=None):
        self.value = value
        self.left = left
        self.right = right


def symmetricalTree(tree):
    # Write your code here.
    return helper(tree.left, tree.right)


def helper(tree1, tree2):
    if tree1 and tree2:
        if tree1.value != tree2.value:
            return False
    else:
        return not (tree1 or tree2)

    subtree1_symmetrical = helper(tree1.left, tree2.right)
    subtree2_symmetrical = helper(tree1.right, tree2.left)
    
    return subtree1_symmetrical and subtree2_symmetrical

