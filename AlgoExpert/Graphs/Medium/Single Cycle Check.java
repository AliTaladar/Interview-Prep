import java.util.*;

class Program {
  public static boolean hasSingleCycle(int[] array) {
    
		int counter = 0;
		int index = 0;
		
		while(counter < array.length){
			if(counter > 0 && index == 0) return false;
			index = (index + array[index]) % array.length;
			if(index < 0) index = array.length + index;
			counter++;
		}
		
    return index == 0;
  }
}
