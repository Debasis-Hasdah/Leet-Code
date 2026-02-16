import java.util.*;

class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
        val = 0;
        neighbors = new ArrayList<>();
    }

    public Node(int val) {
        this.val = val;
        neighbors = new ArrayList<>();
    }
}

public class CloneGraph {

    private Map<Node, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {
        if (node == null) return null;

        if (map.containsKey(node)) {
            return map.get(node);
        }

        Node clone = new Node(node.val);
        map.put(node, clone);

        for (Node neighbor : node.neighbors) {
            clone.neighbors.add(cloneGraph(neighbor));
        }

        return clone;
    }

    public static void main(String[] args) {
        // Build small test graph: 1 -- 2
        Node n1 = new Node(1);
        Node n2 = new Node(2);

        n1.neighbors.add(n2);
        n2.neighbors.add(n1);

        CloneGraph solution = new CloneGraph();
        Node cloned = solution.cloneGraph(n1);

        System.out.println("Original: " + n1.val);
        System.out.println("Cloned: " + cloned.val);
    }
}
