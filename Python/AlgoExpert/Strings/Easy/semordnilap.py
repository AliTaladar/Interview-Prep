def semordnilap(words):
    # Write your code here.
    visited = set()
    result = []
    for word in words:
        reversed_word = ''.join(reversed(word))
        if word in visited:
            result.append([reversed_word, word])
        else:
            visited.add(reversed_word)
    
    return result
