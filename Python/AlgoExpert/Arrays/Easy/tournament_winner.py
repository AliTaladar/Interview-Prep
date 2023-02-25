def tournamentWinner(competitions, results):
    # Write your code here.
    HOME_TEAM_WON = 1
    
    current_winning_team = ""
    max_points = 0

    points = {}
    
    for i in range(len(competitions)):
        if results[i] == HOME_TEAM_WON:
            winning_team = competitions[i][0]
        else:
            winning_team = competitions[i][1]

        if winning_team not in points:
            points[winning_team] = 3
        else:
            points[winning_team] += 3

        if points[winning_team] > max_points:
            max_points = points[winning_team]
            current_winning_team = winning_team
    
    return current_winning_team
