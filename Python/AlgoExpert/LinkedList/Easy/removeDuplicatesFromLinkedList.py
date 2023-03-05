# This is an input class. Do not edit.
class LinkedList:
    def __init__(self, value):
        self.value = value
        self.next = None


def removeDuplicatesFromLinkedList(linkedList):
    # Write your code here.
    curr = linkedList

    while curr.next:
        if curr.value == curr.next.value:
            curr.next = curr.next.next
        else:
            curr = curr.next

    return linkedList
