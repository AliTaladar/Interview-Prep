import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class main {
    public static void main(String[] args) {
        HashMap<Character, Character[]> graph = new HashMap<>();
        graph.put('f', new Character[] {'g', 'i'});
        graph.put('g', new Character[] {'h'});
        graph.put('h', new Character[] {});
        graph.put('i', new Character[] {'g', 'k'});
        graph.put('j', new Character[] {'i'});
        graph.put('k', new Character[] {});

        System.out.println(hasPathBFS(graph, 'f', 'k'));
    }

    public static boolean hasPathBFS(HashMap<Character, Character[]> graph, char src, char dst) {
        if (!graph.containsKey(src) || !graph.containsKey(dst)) {
            return false;
        }

        Queue<Character> queue = new LinkedList<>();
        queue.offer(src);

        while (!queue.isEmpty()) {
            char current = queue.poll();
            if (current == dst)
                return true;
            for (char neighbor: graph.get(current)) {
                queue.offer(neighbor);
            }
        }

        return false;
    }

}