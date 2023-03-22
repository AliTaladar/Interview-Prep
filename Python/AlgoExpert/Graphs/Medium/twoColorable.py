def twoColorable(edges):
    # Write your code here.
    my_map = {0: 'RED'}
    to_explore = [0]

    while len(to_explore) > 0:
        idx = to_explore.pop()
        curr_color = my_map[idx]
        for i in edges[idx]:
            if i in my_map:
                if curr_color == my_map[i]:
                    return False
            else:
                to_explore.append(i)
                my_map[i] = 'RED' if curr_color == 'BLUE' else 'BLUE'
        
    return True
