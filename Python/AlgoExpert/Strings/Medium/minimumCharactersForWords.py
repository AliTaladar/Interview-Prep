def minimumCharactersForWords(words):
    # Write your code here.
    my_map = {}
    for word in words:
        curr_letters = {}
        for letter in word:
            if letter in curr_letters:
                curr_letters[letter] += 1
            else:
                curr_letters[letter] = 1
        for letter in curr_letters:
            if letter in my_map:
                my_map[letter] = max(my_map[letter], curr_letters[letter])
            else:
                my_map[letter] = curr_letters[letter]

    result = []
    for key in my_map:
        for i in range(my_map[key]):
            result.append(key)
        
    return result