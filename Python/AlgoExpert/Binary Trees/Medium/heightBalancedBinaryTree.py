# This is an input class. Do not edit.
class BinaryTree:
    def __init__(self, value, left=None, right=None):
        self.value = value
        self.left = left
        self.right = right


class TreeInfo:
    def __init__(self, is_balanced, height):
        self.is_balanced = is_balanced
        self.height = height


def heightBalancedBinaryTree(tree):
    # Write your code here.
    return get_tree_info(tree).is_balanced


def get_tree_info(tree):
    if not tree:
        return TreeInfo(True, -1)

    left_subtree_info = get_tree_info(tree.left)
    right_subtree_info = get_tree_info(tree.right)

    is_balanced = (left_subtree_info.is_balanced
                   and right_subtree_info.is_balanced
                   and abs(left_subtree_info.height - right_subtree_info.height) <= 1)

    height = max(left_subtree_info.height, right_subtree_info.height) + 1

    return TreeInfo(is_balanced, height)
