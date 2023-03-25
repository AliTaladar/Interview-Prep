def reverseWordsInString(string):
    # Write your code here.
    if len(string) == 0:
        return ''
    
    str_arr = []
    start = len(string) - 1
    end = len(string)

    is_blank = string[len(string) - 1] == ' '
    while start >= 0:
        if is_blank and string[start] == ' ' or not is_blank and string[start] != ' ':
            start -= 1
        else:
            str_arr.append(string[start + 1:end])
            end = start + 1
            is_blank = not is_blank

    str_arr.append(string[start + 1:end])
        
    return "".join(str_arr)
