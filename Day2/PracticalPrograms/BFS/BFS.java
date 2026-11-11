package BFS;


import java.util.*;

class BFS {

    static void addEdge(ArrayList<ArrayList<Integer>> graph, int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    static void bfs(ArrayList<ArrayList<Integer>> graph, int start) {

        boolean visited[] = new boolean[graph.size()];

        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.add(start);

        while (!queue.isEmpty()) {

            int node = queue.poll();

            System.out.print((char)('A' + node) + " ");

            for (int neighbour : graph.get(node)) {

                if (!visited[neighbour]) {

                    visited[neighbour] = true;
                    queue.add(neighbour);
                }
            }
        }
    }

    public static void main(String[] args) {

        int vertices = 7;

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        addEdge(graph, 0, 1);
        addEdge(graph, 0, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 5);
        addEdge(graph, 2, 6);

        System.out.println("BFS Traversal:");

        bfs(graph, 0);
    }
}

