import java.util.*;

public class main {
    public static void main(String[] args) {
        HashMap<Character, Character[]> graph = new HashMap<>();
        graph.put('f', new Character[]{'g', 'i'});
        graph.put('g', new Character[]{'h'});
        graph.put('h', new Character[]{});
        graph.put('i', new Character[]{'g', 'k'});
        graph.put('j', new Character[]{'i'});
        graph.put('k', new Character[]{});

        System.out.println(breadthFirstSearch(graph, 'f'));
    }

    public static ArrayList<Character> breadthFirstSearch(HashMap<Character, Character[]> graph, char src) {
        ArrayList<Character> list = new ArrayList<>();
        HashSet<Character> visited = new HashSet<>();
        visited.add(src);
        return breadthFirstSearch(graph, visited, list,  src);
    }

    public static ArrayList<Character> breadthFirstSearch(HashMap<Character, Character[]> graph,
                                          HashSet<Character> visited,
                                          ArrayList<Character> list, char src) {
        if (!graph.containsKey(src)) return list;
        Queue<Character> queue = new LinkedList<>();
        queue.offer(src);

        while (!queue.isEmpty()) {
            char current = queue.poll();
            for (char neighbor: graph.get(current)) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
            list.add(current);
        }
        return list;
    }

}