
def findClosestValueInBst(tree, target):
    # Write your code here.
    return findClosestValueInBstHelper(tree, target, tree.value)


def findClosestValueInBstHelper(tree, target, closest):
    # Write your code here.
    if abs(target - tree.value) < abs(target - closest):
        closest = tree.value
    
    if target == tree.value:
        return tree.value
    elif target > tree.value and tree.right:
        return findClosestValueInBstHelper(tree.right, target, closest)
    elif target < tree.value and tree.left:
        return findClosestValueInBstHelper(tree.left, target, closest)

    return closest


# This is the class of the input tree. Do not edit.
class BST:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None
