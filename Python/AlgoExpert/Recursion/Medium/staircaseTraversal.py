def staircaseTraversal(height, maxSteps):
    # Write your code here.
    if height == 0:
        return 1
    elif height < 0:
        return 0

    ways = 0
    for i in range(1, maxSteps + 1):
        ways += staircaseTraversal(height - i, maxSteps)
    
    return ways
