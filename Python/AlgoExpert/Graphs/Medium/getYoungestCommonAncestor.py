# This is an input class. Do not edit.
class AncestralTree:
    def __init__(self, name):
        self.name = name
        self.ancestor = None


def getYoungestCommonAncestor(topAncestor, descendantOne, descendantTwo):
    # Write your code here.
    descendant_one_depth = get_node_depth(descendantOne, topAncestor);
    descendant_two_depth = get_node_depth(descendantTwo, topAncestor);

    if descendant_one_depth > descendant_two_depth:
        return backtrack_tree(descendantOne, descendantTwo, descendant_one_depth - descendant_two_depth)
    else:
        return backtrack_tree(descendantTwo, descendantOne, descendant_two_depth - descendant_one_depth)



def get_node_depth(node, ancestor):
    depth = 0

    while node != ancestor:
        depth += 1
        node = node.ancestor

    return depth


def backtrack_tree(lower_node, higher_node, diff):
    while diff > 0:
        lower_node = lower_node.ancestor
        diff -= 1

    while lower_node is not higher_node:
        lower_node = lower_node.ancestor
        higher_node = higher_node.ancestor

    return higher_node
        
