# This is an input class. Do not edit.
class LinkedList:
    def __init__(self, value):
        self.value = value
        self.next = None


def removeKthNodeFromEnd(head, k):
    # Write your code here.
    first = head
    second = head
    for i in range(k):
        second = second.next

    if second:
        while second.next:
            first = first.next
            second = second.next
    else:
        first.value = first.next.value
    first.next = first.next.next

    