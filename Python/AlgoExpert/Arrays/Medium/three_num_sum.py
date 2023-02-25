def threeNumberSum(array, targetSum):
    # Write your code here.
    array.sort()
    result = []
    for i in range(len(array)):
        num1 = array[i]
        complement = targetSum - num1
        
        start, end = i + 1, len(array) - 1
        
        
        while(start < end):
            num2 = array[start]
            num3 = array[end]
            sum = num2 + num3
            if sum == complement:
                print('wut')
                result.append([num1, num2, num3])
                start += 1
                end -= 1
            elif sum > complement:
                end -= 1
            else:
                start += 1

    return result
