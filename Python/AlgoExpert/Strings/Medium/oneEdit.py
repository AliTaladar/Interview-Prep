def oneEdit(stringOne, stringTwo):
    # Write your code here.
    len_one = len(stringOne)
    len_two = len(stringTwo)
    if abs(len_one - len_two) > 1:
        return False

    made_edit = False
    index_one = 0
    index_two = 0

    while index_one < len_one and index_two < len_two:
        if stringOne[index_one] != stringTwo[index_two]:
            if made_edit:
                return False
            made_edit = True

            if len_one > len_two:
                index_one += 1
            elif len_two > len_one:
                index_two += 1
            else:
                index_one += 1
                index_two += 1
        else:
            index_one += 1
            index_two += 1
    
    return True
