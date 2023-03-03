def classPhotos(redShirtHeights, blueShirtHeights):
    # Write your code here.
    redShirtHeights.sort()
    blueShirtHeights.sort()

    red_shirt_taller = redShirtHeights[0] > blueShirtHeights[0]

    for i in range(len(redShirtHeights)):
        if red_shirt_taller:
            if redShirtHeights[i] <= blueShirtHeights[i]:
                return False
        else:
            if redShirtHeights[i] >= blueShirtHeights[i]:
                return False
    
    return True
