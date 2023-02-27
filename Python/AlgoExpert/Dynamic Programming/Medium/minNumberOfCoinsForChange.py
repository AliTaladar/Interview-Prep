def minNumberOfCoinsForChange(n, denoms):
    # Write your code here.
    num_of_coins = [float("inf") for i in range(n + 1)]
    num_of_coins[0] = 0

    for amount in range(n + 1):
        for denom in denoms:
            if denom > amount:
                continue
            if amount - denom >= 0:
                num_of_coins[amount] = min(num_of_coins[amount], num_of_coins[amount - denom] + 1)

    return num_of_coins[n] if num_of_coins[n] != float("inf") else -1
