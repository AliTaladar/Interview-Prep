def nextGreaterElement(array):
    # Write your code here.
    result = [-1] * len(array)
    stack = []

    for i in range(len(array) * 2):
        idx = i % len(array)

        while stack and array[stack[-1]] < array[idx]:
            result[stack.pop()] = array[idx]
        
        if i < len(array):
            stack.append(i)
    
    return result
