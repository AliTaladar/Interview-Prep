def balancedBrackets(string):
    # Write your code here.
    bracket_map = {'(': ')', '{': '}', '[': ']'}
    opening_brackets = '({['
    closing_brackets = ')}]'
    
    curr_open = []
    for i in range(len(string)):
        if string[i] in opening_brackets:
            curr_open.append(string[i])
        elif string[i] in closing_brackets:
            if len(curr_open) == 0:
                return False
            else:
                last_open = curr_open.pop()
                if bracket_map[last_open] != string[i]:
                    return False
        
    return len(curr_open) == 0
    
                
