# This is an input class. Do not edit.
class BST:
    def __init__(self, value, left=None, right=None):
        self.value = value
        self.left = left
        self.right = right


class TreeInfo:
    def __init__(self, num_of_visited, last_node_value):
        self.num_of_visited = num_of_visited
        self.last_node_value = last_node_value


def findKthLargestValueInBst(tree, k, arr=[]):
    # Write your code here.
    treeInfo = TreeInfo(0, tree.value)
    reverseInOrderTraversal(tree, treeInfo, k)
    return treeInfo.last_node_value


def reverseInOrderTraversal(tree, treeInfo, k):
    if not tree or treeInfo.num_of_visited >= k:
        return

    reverseInOrderTraversal(tree.right, treeInfo, k)
    if treeInfo.num_of_visited < k:
        treeInfo.num_of_visited += 1
        treeInfo.last_node_value = tree.value
        reverseInOrderTraversal(tree.left, treeInfo, k)
    


