# This is an input class. Do not edit.
class LinkedList:
    def __init__(self, value):
        self.value = value
        self.next = None


def mergingLinkedLists(linkedListOne, linkedListTwo):
    # Write your code here.
    curr_node_one = linkedListOne
    curr_node_two = linkedListTwo

    while curr_node_one is not curr_node_two:
        if not curr_node_one:
            curr_node_one = linkedListTwo
        else:
            curr_node_one = curr_node_one.next

        if not curr_node_two:
            curr_node_two = linkedListOne
        else:
            curr_node_two = curr_node_two.next            
    
    return curr_node_one
