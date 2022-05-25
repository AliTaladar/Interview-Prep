import java.util.*;

public class main {
    public static void main(String[] args) {
        HashMap<Integer, Integer[]> graph = new HashMap<>();
        graph.put(0, new Integer[]{8, 1, 5});
        graph.put(1, new Integer[]{0});
        graph.put(5, new Integer[]{0, 8});
        graph.put(8, new Integer[]{0, 5});
        graph.put(2, new Integer[]{3, 4});
        graph.put(3, new Integer[]{2, 4});
        graph.put(4, new Integer[]{3, 2});

        System.out.println(largestComponent(graph));
    }

    private static int largestComponent(HashMap<Integer, Integer[]> graph) {
        HashSet<Integer> visited = new HashSet<>();
        int longest = 0;

        for (int key : graph.keySet()) {
            if (visited.contains(key)) continue;
            int length = breadthFirstTraversalLength(graph, visited, key);
            if (length > longest)
                longest = length;
        }

        return longest;
    }

    private static int breadthFirstTraversalLength(HashMap<Integer, Integer[]> graph,
                                                   HashSet<Integer> visited, int key) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(key);
        visited.add(key);
        int length = 0;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            length++;

            for (int neighbor : graph.get(current)) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                }
            }
        }

        return length;
    }

}