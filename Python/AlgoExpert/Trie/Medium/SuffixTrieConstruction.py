# Do not edit the class below except for the
# populateSuffixTrieFrom and contains methods.
# Feel free to add new properties and methods
# to the class.
class :
    def __init__(self, string):
        self.root = {}
        self.endSymbol = "*"
        self.populateSuffixTrieFrom(string)

    def populateSuffixTrieFrom(self, string):
        # Write your code here.
        for i in range(len(string)):
            current = self.root
            for j in range(i, len(string)):
                letter = string[j]
                if letter in current:
                    current = current[letter]
                else:
                    current[letter] = {}
                    current = current[letter]
            current[self.endSymbol] = True

    def contains(self, string):
        # Write your code here.
        current = self.root
        for letter in string:
            if letter not in current:
                return False
            else:
                current = current[letter]

        return self.endSymbol in current