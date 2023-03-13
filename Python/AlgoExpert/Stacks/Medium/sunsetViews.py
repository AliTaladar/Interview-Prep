def sunsetViews(buildings, direction):
    # Write your code here.
    if direction == 'EAST':
        start, stop, step = 0, len(buildings), 1
    else:
        start, stop, step = len(buildings) - 1, -1 , -1

    result = []
    for i in range(start, stop, step):
        print(i)
        while len(result) > 0:
            last_height = buildings[result[-1]]
            if last_height <= buildings[i]:
                result.pop()
            else:
                break
        result.append(i)

    if direction == 'WEST':
        return result[::-1]
        
    return result