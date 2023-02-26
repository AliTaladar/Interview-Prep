# This is an input class. Do not edit.
class BinaryTree:
    def __init__(self, value, left=None, right=None):
        self.value = value
        self.left = left
        self.right = right


class TreeInfo:
    def __init__(self, height, diameter):
        self.height = height
        self.diameter = diameter


def binaryTreeDiameter(tree):
    # Write your code here.
    return get_tree_info(tree).diameter


def get_tree_info(tree):
    if not tree:
        return TreeInfo(0, 0)

    left_info = get_tree_info(tree.left)
    right_info = get_tree_info(tree.right)

    height = max(left_info.height, right_info.height) + 1
    diameter = max(max(left_info.diameter, right_info.diameter), left_info.height + right_info.height)

    
    return TreeInfo(height, diameter)


