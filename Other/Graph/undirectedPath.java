import java.util.*;

public class main {
    public static void main(String[] args) {
        HashMap<Character, Character[]> graph = new HashMap<>();
        graph.put('i', new Character[]{'j', 'k'});
        graph.put('j', new Character[]{'i'});
        graph.put('k', new Character[]{'i', 'm', 'l'});
        graph.put('m', new Character[]{'k'});
        graph.put('l', new Character[]{'k'});
        graph.put('o', new Character[]{'n'});
        graph.put('n', new Character[]{'o'});

        System.out.println(undirectedPath(graph, 'n', 'm'));
    }

    private static boolean undirectedPath(HashMap<Character, Character[]> graph, char src, char dst) {
        HashSet<Character> visited = new HashSet<>();
        return undirectedPath(graph, visited, src, dst);
    }

    private static boolean undirectedPath(HashMap<Character, Character[]> graph,
                                          HashSet<Character> visited, char src, char dst) {
        if (src == dst) {
            return true;
        }
        visited.add(src);

        for (char neighbor: graph.get(src)) {
            if (!visited.contains(neighbor) && undirectedPath(graph, visited, neighbor, dst))
                return true;
        }

        return false;
    }

}