def mergeOverlappingIntervals(intervals):
    # Write your code here.
    intervals.sort(key=lambda x: x[0])

    prev = intervals[0].copy()
    new_intervals = []
    
    for i in range(1, len(intervals)):
        curr = intervals[i].copy()
        if prev[0] <= curr[0] <= prev[1]:
            prev = [prev[0], max(prev[1], curr[1])]
        else:
            new_intervals.append(prev)
            prev = curr
    
    new_intervals.append(prev)
    return new_intervals
