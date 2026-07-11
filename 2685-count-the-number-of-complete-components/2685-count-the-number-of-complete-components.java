class Solution {
    static boolean vis[];
    static int visc;
    static int ecount;
    private static void dfs(Map<Integer,ArrayList<Integer>>graph,int src)
    {
        vis[src] = true;
        visc++;
        ecount+=graph.get(src).size();
        
        for(int s : graph.get(src))
        {
            if(!vis[s])
            {
                dfs(graph,s);
            }
        }
    }
    public int countCompleteComponents(int n, int[][] edges) {

        if(edges.length==0)
        {
            return n;
        }

        Map<Integer,ArrayList<Integer>> graph = new HashMap<>();
        vis = new boolean[n];

        for(int i=0;i<n;i++)
        {
            graph.put(i,new ArrayList<>());
        }

        for(int i=0;i<edges.length;i++)
        {
            int arr[] = edges[i];
            graph.get(arr[0]).add(arr[1]);
            graph.get(arr[1]).add(arr[0]);
        }

        int res = 0;

        for(int i = 0;i<n;i++)
        {
            if(!vis[i])
            {
                visc = 0;
                ecount = 0;
                dfs(graph,i);
                int vertices = (visc * (visc-1))/2;
                if( vertices == (ecount/2))
                {
                    res+=1;
                }
            }
        }

        return res;
    }
}