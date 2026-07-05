class Edge {
    int des;
    int weight;

    Edge(int des, int weight) {
        this.des = des;
        this.weight = weight;
    }
}

class Solution {
    int ans = Integer.MAX_VALUE;
    private void dfs(int node,ArrayList<ArrayList<Edge>> graph,boolean[] vis) 
    {
        vis[node] = true;
        for (Edge e : graph.get(node)) {
            ans = Math.min(ans, e.weight);
            if (!vis[e.des]) 
            {
                dfs(e.des, graph, vis);
            }
        }
    }
    public int minScore(int n, int[][] roads) {
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i=0;i<roads.length;i++) {
            int src = roads[i][0];
            int des = roads[i][1];
            int weight = roads[i][2];
            graph.get(src).add(new Edge(des, weight));
            graph.get(des).add(new Edge(src, weight));
        }
        dfs(1, graph, new boolean[n + 1]);
        return ans;
    }
}