def sortStack(stack):
    # Write your code here.
    helper_stack = []
    while stack:
        if len(helper_stack) == 0:
            helper_stack.append(stack.pop())
        else:
            curr_element = stack.pop()
            if curr_element <= helper_stack[-1]:
                helper_stack.append(curr_element)
            else:
                while helper_stack and curr_element > helper_stack[-1]:
                    stack.append(helper_stack.pop())
                helper_stack.append(curr_element)
    
    while helper_stack:
        stack.append(helper_stack.pop())
    return stack
