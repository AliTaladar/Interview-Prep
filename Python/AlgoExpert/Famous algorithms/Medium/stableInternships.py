def stableInternships(interns, teams):
    # Write your code here.
    matched_pairs = {}
    unmatched = [i for i in range(len(interns))]
    intern_next_choice = [0] * len(interns)

    team_ranks = []
    for team in teams:
        rank = {}
        for i, intern in enumerate(team):
            rank[intern] = i
        team_ranks.append(rank)
    
    while unmatched:
        intern = unmatched.pop()
        team_idx = intern_next_choice[intern]
        team_chosen = interns[intern][team_idx]
        intern_next_choice[intern] += 1
        
        if team_chosen not in matched_pairs:
            matched_pairs[team_chosen] = intern
        else:
            current_matched_intern = matched_pairs[team_chosen]
            if team_ranks[team_chosen][intern] < team_ranks[team_chosen][current_matched_intern]:
                matched_pairs[team_chosen] = intern
                unmatched.append(current_matched_intern)
            else:
                unmatched.append(intern)
            
    return [[intern, team] for team, intern in matched_pairs.items()]
