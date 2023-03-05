def validStartingCity(distances, fuel, mpg):
    # Write your code here.
    miles_left = 0
    min_miles = 0
    min_city = 0

    for i in range(len(distances)):
        if miles_left < min_miles:
            min_miles = miles_left
            min_city = i
        miles_left += fuel[i] * mpg - distances[i]
        
    return min_city
