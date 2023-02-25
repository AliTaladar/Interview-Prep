def nonConstructibleChange(coins):
    # Write your code here.
    coins.sort()
    max_constructible_change = 0

    for coin in coins:
        if coin > max_constructible_change + 1:
            return max_constructible_change + 1
        else:
            max_constructible_change += coin
    
    return max_constructible_change + 1
