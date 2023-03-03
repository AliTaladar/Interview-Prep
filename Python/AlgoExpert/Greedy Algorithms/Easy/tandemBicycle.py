def tandemBicycle(redShirtSpeeds, blueShirtSpeeds, fastest):
    # Write your code here.
    redShirtSpeeds.sort()
    blueShirtSpeeds.sort(reverse=fastest)

    speed_sums = 0
    for i in range(len(redShirtSpeeds)):
        speed_sums += max(redShirtSpeeds[i], blueShirtSpeeds[i])
    
    return speed_sums
