# Do not edit the class below except
# for the breadthFirstSearch method.
# Feel free to add new properties
# and methods to the class.
class Node:
    def __init__(self, name):
        self.children = []
        self.name = name

    def addChild(self, name):
        self.children.append(Node(name))
        return self

    def breadthFirstSearch(self, array):
        # Write your code here.
        to_visit = [self]
        while to_visit:
            current = to_visit.pop(0)
            array.append(current.name)
            for child in current.children:
                to_visit.append(child)
        return array
