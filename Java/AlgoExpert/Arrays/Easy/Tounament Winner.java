import java.util.*;

class Program {
	
	public int HOME_TEAM_WON = 1;

  public String tournamentWinner(
      ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
    
		Map<String, Integer> myMap = new HashMap<>();
		String currentBestTeam = "";
		myMap.put(currentBestTeam, 0);
		
		for(int i = 0; i < competitions.size(); i++){
			String homeTeam = competitions.get(i).get(0);
			String awayTeam = competitions.get(i).get(1);
			String winningTeam;
			
			winningTeam = (results.get(i) == HOME_TEAM_WON) ? homeTeam : awayTeam;
			
			if(!myMap.containsKey(winningTeam)){
				myMap.put(winningTeam, 0);
			}
			int currentScore = myMap.get(winningTeam);
			myMap.put(winningTeam, currentScore + 3);
			
			if(myMap.get(winningTeam) > myMap.get(currentBestTeam)){
				currentBestTeam = winningTeam;
			}
		}
		
		return currentBestTeam;
  }
}
