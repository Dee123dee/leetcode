class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int indegree[]=new int[numCourses];
        Map<Integer,List<Integer>>map=new HashMap<>();
        for(int i=0;i<prerequisites.length;i++)
        {
            int u=prerequisites[i][1];
            int v=prerequisites[i][0];
            map.putIfAbsent(u,new ArrayList<>());
            map.get(u).add(v);
            indegree[v]++;
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<numCourses;i++)
        {
            if(indegree[i]==0)
            {
                q.add(i);
            }
        }
        int result[] = new int[numCourses];
        int k=0;
        while(!q.isEmpty())
        {
            int top=q.poll();
            result[k++]=top;
            for(int i : map.getOrDefault(top, new ArrayList<>()))
            {
                indegree[i]--;
                if(indegree[i]==0)
                {
                    q.add(i);
                }
            }
        }
        if(k != numCourses) {
            return new int[0];
        }
        return result;
    }
}