# Do not edit the class below except for
# the insert, contains, and remove methods.
# Feel free to add new properties and methods
# to the class.
class BST:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

    def insert(self, value):
        # Write your code here.
        # Do not edit the return statement of this method.
        if value >= self.value:
            if not self.right:
                self.right = BST(value)
            else:
                self.right.insert(value)
        else:
            if not self.left:
                self.left = BST(value)
            else:
                self.left.insert(value)
        return self

    def contains(self, value):
        # Write your code here.
        if self.value == value:
            return True
        elif value > self.value:
            if self.right:
                return self.right.contains(value)
            else:
                return False
        else:
            if self.left:
                return self.left.contains(value)
            else:
                return False


    def find_min_value(self):
        current_node = self
        while current_node.left:
            current_node = current_node.left
        return current_node.value
    
    
    def remove(self, value, parent_node=None):
        # Write your code here.
        # Do not edit the return statement of this method.
        current_node = self
        while current_node:
            if value < current_node.value:
                parent_node = current_node
                current_node = current_node.left
            elif value > current_node.value:
                parent_node = current_node
                current_node = current_node.right
            else:
                if current_node.left and current_node.right:
                    current_node.value = current_node.right.find_min_value()
                    current_node.right.remove(current_node.value, current_node)
                elif not parent_node:
                    if current_node.left:
                        current_node.value = current_node.left.value
                        current_node.right = current_node.left.right
                        current_node.left = current_node.left.left
                    elif current_node.right:
                        current_node.value = current_node.right.value
                        current_node.right = current_node.right.right
                        current_node.left = current_node.right.left
                    else:
                        pass
                elif current_node == parent_node.left:
                    if current_node.left:
                        parent_node.left = current_node.left
                    else:
                        parent_node.left = current_node.right
                elif current_node == parent_node.right:
                    if current_node.left:
                        parent_node.right = current_node.left
                    else:
                        parent_node.right = current_node.right
                break
        return self




