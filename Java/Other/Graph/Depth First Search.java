import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class main {
    public static void main(String[] args) {
        HashMap<Character, Character[]> graph = new HashMap<>();
        graph.put('f', new Character[]{'g', 'i'});
        graph.put('g', new Character[]{'h'});
        graph.put('h', new Character[]{});
        graph.put('i', new Character[]{'g', 'k'});
        graph.put('j', new Character[]{'i'});
        graph.put('k', new Character[]{});

        System.out.println(depthFirstSearch(graph, 'f'));
    }

    public static ArrayList<Character> depthFirstSearch(HashMap<Character, Character[]> graph, char src) {
        HashSet<Character> visited = new HashSet<>();
        visited.add(src);
        ArrayList<Character> list = new ArrayList<>();
        depthFirstSearch(graph, visited, list,  src);
        return list;
    }

    public static void depthFirstSearch(HashMap<Character, Character[]> graph,
                                     HashSet<Character> visited, ArrayList<Character> list, char src) {
        if (!graph.containsKey(src)) return;

        list.add(src);

        for (char neighbor: graph.get(src)) {
            if (visited.contains(neighbor)) continue;
            visited.add(neighbor);
            depthFirstSearch(graph, visited, list, neighbor);
        }
    }

}