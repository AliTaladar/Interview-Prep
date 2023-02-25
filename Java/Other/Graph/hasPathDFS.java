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

        System.out.println(hasPathDFS(graph, 'f', 'k'));
    }

    public static boolean hasPathDFS(HashMap<Character, Character[]> graph, char src, char dst) {
        HashSet<Character> visited = new HashSet<>();
        visited.add(src);
        return hasPathDFS(graph, visited, src, dst);
    }

    public static boolean hasPathDFS(HashMap<Character, Character[]> graph,
                                     HashSet<Character> visited, char src, char dst) {
        if (!graph.containsKey(src) || !graph.containsKey(dst))
            return false;
        if (src == dst)
            return true;

        for (char neighbor : graph.get(src)) {
            if (visited.contains(neighbor)) continue;
            else visited.add(neighbor);
            if (hasPathDFS(graph, visited, neighbor, dst)) return true;
        }

        return false;
    }

}