def taskAssignment(k, tasks):
    # Write your code here.
    map = {}
    
    for i in range(len(tasks)):
        if tasks[i] in map:
            map[tasks[i]].append(i)
        else:
            map[tasks[i]] = [i]

    tasks.sort(reverse=True)

    result = []
    start = 0
    end = len(tasks) - 1
    while start < end:
        task1 = map[tasks[start]].pop()
        task2 = map[tasks[end]].pop()
        result.append([task1, task2])
        start += 1
        end -= 1
        
    return result
