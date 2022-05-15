import java.util.*;

class Program {

  public boolean classPhotos(
      ArrayList<Integer> redShirtHeights, ArrayList<Integer> blueShirtHeights) {
    // Write your code here.
		Collections.sort(redShirtHeights);
		Collections.sort(blueShirtHeights);
		boolean redShirtsBackRow = redShirtHeights.get(0) > blueShirtHeights.get(0);
		
		for (int i = 0; i < redShirtHeights.size(); i++) {
			int redShirtHeight = redShirtHeights.get(i);
			int blueShirtHeight = blueShirtHeights.get(i);
			
			if (redShirtsBackRow) {
				if (blueShirtHeight >= redShirtHeight) return false;
			} else {
				if (redShirtHeight >= blueShirtHeight) return false;
			}
		}
		
    return true;
  }
}
