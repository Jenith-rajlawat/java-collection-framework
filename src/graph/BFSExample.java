package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Graph {
    private int vertexCount;
    private List<List<Integer>> adjList; // list of integers is kept as list

    public Graph(int vertexCount) {
        this.vertexCount = vertexCount;
        this.adjList = new ArrayList<>(vertexCount); // Arraylist of vertexCount is added to adjList i.e. list kept in a list

        for (int i = 0; i < vertexCount; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination) {
        adjList.get(source).add(destination);
        adjList.get(destination).add(source);
    }

    public List<Integer> getNeighbors(int vertex) {
        return adjList.get(vertex);
    }

    public int getVertexCount() {
        return vertexCount;
    }
}

public class BFSExample {
    public static void bfs(Graph graph, int start) {
        boolean[] visited = new boolean[graph.getVertexCount()];
        Queue<Integer> queue = new LinkedList<>();

        visited[start] = true;
        queue.offer(start);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(current + " ");

            for (int neighbor : graph.getNeighbors(current)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);

        System.out.print("BFS starting from vertex 0: ");
        bfs(graph, 0);
    }
}
