import java.util.*;

class Program {

  public int validStartingCity(int[] distances, int[] fuel, int mpg) {
    // Write your code here.
    int numOfCities = distances.length;
    int miles = 0;
    int minMile = 0;
    int startingCity = 0;

    for (int i = 1; i < numOfCities; i++) {
      miles += fuel[i - 1] * mpg - distances[i - 1];
      if (miles < minMile) {
        minMile = miles;
        startingCity = i;
      }
    }
    
    return startingCity;
  }
}
