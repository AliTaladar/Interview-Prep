def generateDocument(characters, document):
    # Write your code here.
    char_map = {}
    for c in characters:
        if c in char_map:
            char_map[c] += 1
        else:
            char_map[c] = 1

    for c in document:
        if c not in char_map:
            return False
        else:
            if char_map[c] == 1:
                char_map.pop(c)
            else:
                char_map[c] -= 1
    return True
