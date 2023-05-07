# Do not edit the class below except for
# the constructor and the createSet, find,
# and union methods. Feel free to add new
# properties and methods to the class.
class UnionFind:
    def __init__(self):
        # Write your code here
        self.parents = {}
        self.ranks = {}

    def createSet(self, value):
        # Write your code here
        self.parents[value] = value
        self.ranks[value] = 0

    def find(self, value):
        # Write your code here
        if value not in self.parents:
            return None
        
        if value != self.parents[value]:
            self.parents[value] = self.find(self.parents[value])

        return self.parents[value]

    def union(self, valueOne, valueTwo):
        # Write your code here
        if valueOne not in self.parents or valueTwo not in self.parents:
            return
        
        parent_one = self.find(valueOne)
        parent_two = self.find(valueTwo)

        if parent_one == parent_two:
            return

        parent_one_rank = self.ranks[parent_one]
        parent_two_rank = self.ranks[parent_two]

        if parent_one_rank == parent_two_rank:
            self.parents[parent_two] = parent_one
            self.ranks[parent_one] += 1
        elif parent_one_rank > parent_two_rank:
            self.parents[parent_two] = parent_one
        else:
            self.parents[parent_one] = parent_two

