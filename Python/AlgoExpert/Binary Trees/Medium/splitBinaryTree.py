# This is an input class. Do not edit.
class BinaryTree:
    def __init__(self, value, left=None, right=None):
        self.value = value
        self.left = left
        self.right = right


class BinaryTreeHelper:
    def __init__(self, tree, left_helper, right_helper, sum):
        self.tree = tree
        self.left_helper = left_helper
        self.right_helper = right_helper
        self.sum = sum


def splitBinaryTree(tree):
    # Write your code here.
    helper = build_helper(tree)
    if helper.sum % 2 == 1:
        return 0
    return splitBinaryTreeHelper(helper, helper.sum)[1]


def splitBinaryTreeHelper(tree_helper, total_sum):
    if not tree_helper:
        return False, 0

    if tree_helper.sum * 2 == total_sum:
        return True, tree_helper.sum

    left = splitBinaryTreeHelper(tree_helper.left_helper, total_sum)
    if left[0]:
        return True, left[1]

    right = splitBinaryTreeHelper(tree_helper.right_helper, total_sum)
    if right[0]:
        return True, right[1]

    return False, 0


def build_helper(tree):
    if not tree:
        return None

    left_helper = build_helper(tree.left)
    right_helper = build_helper(tree.right)

    if left_helper:
        left_sum = left_helper.sum
    else:
        left_sum = 0
    
    if right_helper:
        right_sum = right_helper.sum
    else:
        right_sum = 0

    return BinaryTreeHelper(tree, left_helper, right_helper, tree.value + left_sum + right_sum) 
    