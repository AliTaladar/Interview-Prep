import java.util.*;

public class main {
    public static void main(String[] args) {
        HashMap<Character, Character[]> graph = new HashMap<>();
        graph.put('w', new Character[] {'x' , 'v'});
        graph.put('x', new Character[] {'w', 'y'});
        graph.put('y', new Character[] {'x', 'z'});
        graph.put('z', new Character[] {'y', 'v'});
        graph.put('v', new Character[] {'z', 'w'});


        System.out.println(shortestPath(graph, 'w', 'z'));
    }

    private static int shortestPath(HashMap<Character, Character[]> graph, char src, char dst) {
        HashSet<Character> visited = new HashSet<>();
        Queue<nodeDistancePair> queue = new LinkedList<>();
        queue.add(new nodeDistancePair(src, 0));
        visited.add(src);

        while (!queue.isEmpty()) {
            nodeDistancePair current = queue.poll();

            for (char neighbor: graph.get(current.node)) {
                if (!visited.contains(neighbor)) {
                    int newDistance = current.distance + 1;
                    if (neighbor == dst) {
                        return newDistance;
                    } else {
                        nodeDistancePair newPair = new nodeDistancePair(neighbor, newDistance);
                        queue.add(newPair);
                        visited.add(neighbor);
                    }
                }
            }
        }

        return -1;
    }


}

class nodeDistancePair {
    public char node;
    public int distance;
    public nodeDistancePair(char node, int distance) {
        this.node = node;
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "nodeDistancePair{" +
                "node=" + node +
                ", distance=" + distance +
                '}';
    }
}