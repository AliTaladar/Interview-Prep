# This is an input class. Do not edit.
class LinkedList:
    def __init__(self, value):
        self.value = value
        self.next = None


def sumOfLinkedLists(linkedListOne, linkedListTwo):
    # Write your code here.
    multiplier = 1
    sum_one = 0
    sum_two = 0
    
    while linkedListOne:
        sum_one += linkedListOne.value * multiplier
        linkedListOne = linkedListOne.next
        multiplier *= 10

    multiplier = 1
    while linkedListTwo:
        sum_two += linkedListTwo.value * multiplier
        linkedListTwo = linkedListTwo.next
        multiplier *= 10

    total = sum_one + sum_two

    result = LinkedList(total % 10)
    total = total // 10

    curr = result
    while total != 0:
        curr.next = LinkedList(total % 10)
        curr = curr.next
        total = total // 10
    
    return result
