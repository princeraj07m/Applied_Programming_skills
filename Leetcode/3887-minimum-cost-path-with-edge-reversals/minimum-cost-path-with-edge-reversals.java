import java.util.*;

class Solution {

    static class Edge {
        int to, cost;
        Edge(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }

    public int minCost(int n, int[][] edges) {

        // Build graph
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

        for (int[] e : edges) {
            int u = e[0], v = e[1], w = e[2];

            // original edge
            graph.get(u).add(new Edge(v, w));

            // reversed edge using switch
            graph.get(v).add(new Edge(u, 2 * w));
        }

        // Dijkstra
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;

        PriorityQueue<int[]> pq =
                new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.offer(new int[]{0, 0}); // {node, cost}

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int node = cur[0];
            int cost = cur[1];

            if (cost > dist[node]) continue;

            if (node == n - 1) return cost;

            for (Edge e : graph.get(node)) {
                int next = e.to;
                int newCost = cost + e.cost;

                if (newCost < dist[next]) {
                    dist[next] = newCost;
                    pq.offer(new int[]{next, newCost});
                }
            }
        }

        return -1;
    }
}
