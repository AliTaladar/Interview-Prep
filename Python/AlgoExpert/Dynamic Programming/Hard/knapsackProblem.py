def knapsackProblem(items, capacity):
    # Write your code here.
    results = [[0 for _ in range(capacity + 1)] for _ in range(len(items) + 1)]

    for i in range(1, len(results)):
        curr_value = items[i - 1][0]
        curr_weight = items[i - 1][1]
        for j in range(1, len(results[i])):
            if j < curr_weight:
                results[i][j] = results[i - 1][j]
            else:
                if results[i - 1][j - curr_weight] + curr_value > results[i - 1][j]:
                    new_value = results[i - 1][j - curr_weight] + curr_value
                    results[i][j] = new_value
                else:
                    results[i][j] = results[i - 1][j]

    return [results[-1][-1], find_knapsack_items(items, results)]


def find_knapsack_items(items, results):
    knapsack_items = []
    row = len(results) - 1
    col = len(results[0]) - 1
    while row != 0:
        if results[row][col] == results[row - 1][col]:
            row -= 1
        else:
            row -= 1
            col -= items[row][1]
            knapsack_items.append(row)
    return knapsack_items
