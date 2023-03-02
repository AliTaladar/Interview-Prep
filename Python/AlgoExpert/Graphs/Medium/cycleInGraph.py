def cycleInGraph(edges):
    # Write your code here.
    for i in range(len(edges)):
        if depth_first_search(edges, i, []):
            return True
    return False


def depth_first_search(edges, idx, stack):
    if idx in stack:
        return True
    
    stack.append(idx)
    
    for neighbor in edges[idx]:
        if depth_first_search(edges, neighbor, stack):
            return True
        stack.pop()
    return False