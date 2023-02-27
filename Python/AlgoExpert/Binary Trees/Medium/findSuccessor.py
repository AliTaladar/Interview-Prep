# This is an input class. Do not edit.
class BinaryTree:
    def __init__(self, value, left=None, right=None, parent=None):
        self.value = value
        self.left = left
        self.right = right
        self.parent = parent


def left_most_node(node):
    while node.left:
        node = node.left
    return node


def findSuccessor(tree, node):
    # Write your code here.
    if node.right:
        return left_most_node(node.right)

    while node != tree and node == node.parent.right:
        node = node.parent

    return node.parent

