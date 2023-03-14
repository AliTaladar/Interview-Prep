def runLengthEncoding(string):
    # Write your code here.
    curr_char = string[0]
    count = 0
    char_list = []

    for c in string:
        if c == curr_char:
            if count == 9:
                char_list.append(str(count))
                char_list.append(curr_char)
                count = 1
            else:
                count += 1
        else:
            char_list.append(str(count))
            char_list.append(curr_char)
            count = 1
            curr_char = c

    if count != 0:
        char_list.append(str(count))
        char_list.append(curr_char)

    return ''.join(char_list)
