import java.util.*;

class Program {
  // Tip: You can use `element instanceof ArrayList` to check whether an item
  // is an array or an integer.
  public static int productSum(List<Object> array) {
    // Write your code here.
    return productSum(array, 1);
  }
	
	public static int productSum(List<Object> array, int multiplier) {
    // Write your code here.
		int sum = 0;
		
		for(int i = 0; i < array.size(); i++){
			if(array.get(i) instanceof ArrayList){
				sum += productSum((List<Object>) array.get(i), multiplier + 1);
			}else if(array.get(i) instanceof Object){
				sum += (int) array.get(i);
			}
		}
		
    return sum * multiplier;
  }
}
