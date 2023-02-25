import java.util.*;

public class main {
    public static void main(String[] args) {
        HashMap<Integer, Integer[]> graph = new HashMap<>();
        graph.put(3, new Integer[]{});
        graph.put(4, new Integer[]{6});
        graph.put(6, new Integer[]{4, 5, 7, 8});
        graph.put(8, new Integer[]{6});
        graph.put(7, new Integer[]{6});
        graph.put(5, new Integer[]{6});
        graph.put(1, new Integer[]{2});
        graph.put(2, new Integer[]{1});

        System.out.println(connectedComponentsCount(graph));

    }

    private static int connectedComponentsCount(HashMap<Integer, Integer[]> graph) {
        HashSet<Integer> visited = new HashSet<>();
        int count = 0;

        for (int key : graph.keySet()) {
            if (visited.contains(key)) continue;
            depthFirstTraversal(graph, visited, key);
            count++;
        }

        return count;
    }

    private static void depthFirstTraversal(HashMap<Integer, Integer[]> graph,
                                            HashSet<Integer> visited, int key) {
        visited.add(key);
        for (int neighbor : graph.get(key)) {
            if (visited.contains(neighbor)) continue;
            depthFirstTraversal(graph, visited, neighbor);
        }
    }


}