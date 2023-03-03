def minimumWaitingTime(queries):
    # Write your code here.
    queries.sort()
    waiting_time = 0
    for i in range(len(queries)):
        waiting_time += queries[i] * (len(queries) - i - 1)
    return waiting_time
